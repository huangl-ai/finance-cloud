package com.timegroup.financecloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huanglei
 * @Date: 2020/11/23 10:28
 */
@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping("getInfo")
    public String getInfo(){
        return "this is a demo for jenkins";
    }
}
