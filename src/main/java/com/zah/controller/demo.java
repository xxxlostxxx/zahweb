package com.zah.controller;

import com.zah.entity.Result;
import com.zah.entity.User;
import com.zah.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class demo {
    @Autowired
    private DemoService demoService;
    @ResponseBody
    @RequestMapping(value="/demo")
    public Result demo(){
        Result result =new Result();
        List<User> users = demoService.find();
        result.data=users;
        return result;
    }
}
