package cn.jondai.idandan.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 */
public class DateUtilTest {

    @Test
    public void testCompareToday() throws Exception {
        int i = DateUtil.compareToday("2016-03-13");
        assertTrue(i < 0);
    }

    @Test
    public void testGetYear(){
        String year = DateUtil.getYear();
        assertTrue("2016".equals(year));
    }
}