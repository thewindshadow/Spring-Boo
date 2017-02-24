package com.battle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Win7 on 2017/2/24.
 */
@RestController
public class BattleController {

    @RequestMapping(value = "index")
    public String index(){
        return "Hello World!";
    }
}
