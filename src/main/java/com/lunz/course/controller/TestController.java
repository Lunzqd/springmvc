package com.lunz.course.controller;

import com.lunz.course.service.interfaces.ScheduleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author al
 * @date 2019/11/27 10:31
 * @description
 */
@RestController
public class TestController {

    @Autowired
    ScheduleInfoService scheduleInfoService;

    @GetMapping("/test")
    public String test(String name){
        scheduleInfoService.selectByPrimaryKey("","");
        return "Hello "+name;
    }

}
