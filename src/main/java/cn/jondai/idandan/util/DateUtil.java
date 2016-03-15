package cn.jondai.idandan.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 日期工具类
 */
public class DateUtil {

    /**
     * 与当前日期比较
     * @return -1:小于今天 0：等于今天 1：大于今天
     */
    public static int compareToday(String Date2){
        //String Date1 = Constant.DF_yyyyMMdd.format(new Date()).toString();
        String Date1 = "2016-03-16";
        return compareTwoDate(Date1,Date2);
    }

    public static int compareTwoDate(String DATE1 , String DATE2){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() < dt2.getTime()) {
                return 1;
            } else if (dt1.getTime() > dt2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    public static String getYear(){
        Calendar a= Calendar.getInstance();
        return a.get(Calendar.YEAR)+"";
    }
}
