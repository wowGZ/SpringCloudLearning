package cn.com.wowgz.serverribbon.base.service.impl;

import cn.com.wowgz.serverribbon.base.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName BaseServiceImpl
 * @Author Guo Zhen
 * @Date 2021/7/24 0024 21:58
 * @Description 基本服务service实现类
 */
@Service
public class BaseServiceImpl implements IBaseService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String testService(String name) {
        return restTemplate.getForObject("http://SERVER-TEST/getServerPort?name=" + name, String.class);
    }
}
