package cn.jondai.idandan.crawler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = cn.jondai.idandan.Applicationtest.class)
@WebAppConfiguration
public class YingjieshengCrawlerTest {
    @Autowired
    private YingjieshengCrawler yingjieshengCrawler;

    @Test
    public void testExtract() throws Exception {
        yingjieshengCrawler.extract();
    }

    @Test
    public void testExtractEntity() throws Exception {

    }
}