package cn.jondai.idandan.crawler;

import cn.jondai.idandan.dao.JobInfoDao;
import cn.jondai.idandan.entity.JobInfo;
import cn.jondai.idandan.util.Constant;
import cn.jondai.idandan.util.DateUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 应届生招聘网
 */
@Component
public class YingjieshengCrawler extends BaseCrawler {

    @Autowired
    private JobInfoDao jDao;

    @Override
    public String extract() {
        Document doc = null;

        try {
            doc = Jsoup.connect(Constant.JOB_URL_YINGJIESHENG+"/chengduzhaopinhui").get();
            Elements trs = doc.getElementsByClass("title");
            for(Element tr : trs){
                //获取日期，转换成正常的日期格式
                String[] strDate = tr.text().split("日")[0].split("月");
                String pubDate = DateUtil.getYear() +"-"+ strDate[0] +"-"+ strDate[1];

                String pubUrl = Constant.JOB_URL_YINGJIESHENG + tr.attr("href");
                int i = DateUtil.compareToday(pubDate);
                if(i >= 0){ //对今天发布消息进行进一步的处理
                    //处理方式1： 利用详细文章链接去数据库查询是否有重复，
                    // 如果没有则存入、并且通知消息推送
                    List<JobInfo> jobs = jDao.findByJobUrl(pubUrl);
                    if(jobs == null || jobs.size() < 1){
                        this.extractEntity(pubUrl);
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public JobInfo extractEntity(String ArticleUrl) {
        Document doc = null;
        JobInfo job = new JobInfo();
        try {
            doc = Jsoup.connect(ArticleUrl).get();

            job.setTitle(doc.getElementsByClass("center").text());
            job.setContent(doc.getElementsByClass("content").text());
            job.setCreateTime(Constant.DF_yyyyMMddHHmmss.format(new Date()));
            job.setJobUrl(ArticleUrl);
            jDao.save(job);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return job;
    }

}
