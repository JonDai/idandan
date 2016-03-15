package cn.jondai.idandan.crawler;

import cn.jondai.idandan.entity.JobInfo;
import cn.jondai.idandan.util.Constant;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 成都人事考试网招聘
 */
@Component
public class CdptaCrawler extends BaseCrawler {

    @Override
    public String extract() {
        Document doc = null;
        try {
            doc = Jsoup.connect(Constant.JOB_URL_CDRSKSW+"/netpage/ortherlist_all.do?pageSize=10&ifall=1&id=989").get();
            Elements table = doc.getElementsByClass("border_2");
            System.out.println(table);
            //// TODO: 2016/3/14 数据不好获取 搁置
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public JobInfo extractEntity(String ArticleUrl) {

        return null;
    }



}
