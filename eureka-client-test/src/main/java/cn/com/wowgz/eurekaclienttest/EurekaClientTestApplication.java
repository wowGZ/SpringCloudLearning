package cn.com.wowgz.eurekaclienttest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientTestApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@RequestMapping("/getServerPort")
	public String getServerPort(@RequestParam(value = "name", defaultValue = "WowGz") String name) {
		return "Hello " + name + ", I am from port " + port;
	}
}
