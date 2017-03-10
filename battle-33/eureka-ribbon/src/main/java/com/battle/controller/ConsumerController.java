package com.battle.controller;

import com.battle.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bing.Z on 2017/3/9.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return computeService.addService();
    }
}
