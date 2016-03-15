package cn.jondai.idandan.util;

import java.text.SimpleDateFormat;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 项目常量
 */
public interface Constant {

    /**
     * 日期格式
     */
    SimpleDateFormat DF_yyyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat DF_DATE_SEQUENCE = new SimpleDateFormat("yyyyMMddHHmmss");
    SimpleDateFormat DF_YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat DF_YY = new SimpleDateFormat("yy");
    SimpleDateFormat DF_yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat DF_HHmmss = new SimpleDateFormat("HH:mm:ss");
    /**
     * 网络请求编码
     */
    String NET_ENCODING = "UTF-8";
    /**
     * 招聘信息链接地址
     */
    String JOB_URL_CDRSKSW = "http://www.cdpta.gov.cn";
    String JOB_URL_SHIYEBIAN = "http://www.shiyebian.net/sichuan/chengdu/";
    String JOB_URL_YINGJIESHENG = "http://zph.yingjiesheng.com";

    /**
     * 其他
     */

    Integer PAGESIZE = 10;
}
