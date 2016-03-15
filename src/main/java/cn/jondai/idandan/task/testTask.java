package cn.jondai.idandan.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 */
@Component
public class testTask {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 每天8点到22点每小时执行一次
     */
    @Scheduled(cron = "0-20 * * * * ?")
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
    }
}
