package com.battle.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bing.Z on 2017/3/8.
 */
@RestController
public class ComputeController {


    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        final ServiceInstance instance = client.getLocalServiceInstance();
        Integer i = a + b;
        System.out.println("/add  host:" + instance.getHost() + "\tport:"+instance.getPort()+"\tserver_id:" + instance.getServiceId() + "result:" + i);
        return i;
    }
}
