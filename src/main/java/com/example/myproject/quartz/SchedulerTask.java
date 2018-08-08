package com.example.myproject.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {

	private int count=0;

    @Scheduled(cron="*/6 * * * * ?")    //两种定时设置     1.每隔6秒    后面任务2也是 6000ms
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }

}
