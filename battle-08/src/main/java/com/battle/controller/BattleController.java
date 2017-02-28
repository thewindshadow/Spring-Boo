package com.battle.controller;

import com.battle.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bing.Z on 2017/2/28.
 */
@Controller
public class BattleController {

    @RequestMapping("/hello")
    public String hello() throws Exception{
       throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws Exception{
        throw new MyException("发生错误2");
    }

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host","https://www.baidu.com");
        return "index";
    }
}
