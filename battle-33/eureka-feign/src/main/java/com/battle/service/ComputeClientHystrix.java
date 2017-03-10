package com.battle.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Bing.Z on 2017/3/10.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -10000;
    }
}
