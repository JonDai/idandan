package cn.jondai.idandan.crawler;

import cn.jondai.idandan.entity.JobInfo;
import cn.jondai.idandan.util.NetUtil;
import com.google.common.base.Optional;

import java.util.Map;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 子类继承此类实现提取实体对象功能
 * 1.发送请求到目标网站，获取整个网页的html
 * 2.找个招聘信息目标板块，判断日期，若为当天，（并且统计当天条数）
 * 3.找到目标信息详细url，打开该url
 * 4.解析该网页，提取为实体对象
 */
public abstract class BaseCrawler {

    /**

     * @param URL
     * @return
     */
    public String crawl(String URL){
        Optional.of(URL);
        String responseText = "";
        Map<String, Object> result = NetUtil.sendGet(URL);
        if(!"200".equals(result.get("status").toString())){
            // TODO: 2016/3/14  请求失败需要有重试机制
            System.out.println("请求失败!!");
        }else{
          responseText = result.get("text").toString();
        }
        return responseText;
    }

    /**
     * 子类实现自己的提取方法，返回实体对象
     * @param <E>
     * @return
     */
    public abstract JobInfo extractEntity(String ArticleUrl);

    /**
     * 找个招聘信息目标板块，提取有效url
     * @return
     */
    public abstract String extract();

    /**
     * 从可用的url中获取实体链接详情
     * @param ArticleUrl
     * @return
     */
    public String getDetailArticle(String ArticleUrl){
        return this.crawl(ArticleUrl);
    }

}
