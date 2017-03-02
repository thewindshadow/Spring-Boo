package com.battle.task;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Bing.Z on 2017/3/2.
 */
@Component
public class ScheduleTasks {

    @Scheduled(fixedRate = 5000)
    public void ReportCurrentTime(){
        System.out.println("当前时间：" + DateFormatUtils.format(new Date(),"yyyy-MM-dd"));
    }
}
