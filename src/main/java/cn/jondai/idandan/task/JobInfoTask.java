package cn.jondai.idandan.task;

import cn.jondai.idandan.crawler.YingjieshengCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 消息调度任务（更新工作实体对象）
 */
@Component
public class JobInfoTask {

    @Autowired
    private YingjieshengCrawler yingjieshengCrawler;

    /**
     * 每天8点到22点每小时执行一次，更新消息
     */
    @Scheduled(cron = "0 0 8-22 * * ?")
    public void updateJobInfo(){
        yingjieshengCrawler.extract();
    }

}
