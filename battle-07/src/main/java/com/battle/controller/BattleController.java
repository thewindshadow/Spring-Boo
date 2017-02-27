package com.battle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by Bing.Z on 2017/2/27.
 */
@RestController
public class BattleController {

    @ApiIgnore
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello Word";
    }

}
