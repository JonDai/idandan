package cn.jondai.idandan.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 */
public class NetUtilTest {

    @Test
    public void testSendGet() throws Exception {
        String url = Constant.JOB_URL_CDRSKSW;
        Map<String,Object> data = NetUtil.sendGet(url);
        assertTrue("200".equals(data.get("status").toString()));
    }

    @Test
    public void testSendPost() throws Exception {
        Document doc = Jsoup.connect(Constant.JOB_URL_YINGJIESHENG).get();
        String title = doc.title();
        System.out.println(title);


    }
}