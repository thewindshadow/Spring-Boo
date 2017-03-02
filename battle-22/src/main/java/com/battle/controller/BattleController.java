package com.battle.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Bing.Z on 2017/3/2.
 */
@RestController
public class BattleController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

}
