package cn.com.wowgz.serverribbon.base.controller;

import cn.com.wowgz.serverribbon.base.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BaseController
 * @Author Guo Zhen
 * @Date 2021/7/24 0024 21:57
 * @Description 基本接口
 */
@RestController
@RequestMapping("base")
public class BaseController {

    @Autowired
    private IBaseService baseService;

    @RequestMapping("hi")
    public String helloWowGz(@RequestParam String name) {
        return baseService.testService(name);
    }
}
