package cn.jondai.idandan.service;

import cn.jondai.idandan.entity.JobInfo;
import cn.jondai.idandan.entity.Paging;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = cn.jondai.idandan.Applicationtest.class)
public class JobInfoManagerTest {

    @Autowired
    private JobInfoManager jobInfoManager;

    @Test
    public void testGetUnread() throws Exception {

    }

    @Test
    public void testGetUnreadOnlyTitle() throws Exception {

    }

    @Test
    public void testGetOneById() throws Exception {

    }

    @Test
    public void testGetAll() throws Exception {

    }

    @Test
    public void testGetAllPaging() throws Exception {
        List<JobInfo> allPaging = jobInfoManager.getAllPaging(new Paging(10, 1));
        assertTrue(allPaging.size() > 1);
    }

    @Test
    public void testGetStart() throws Exception {

    }

    @Test
    public void testSetStart() throws Exception {

    }

    @Test
    public void testDeleteOne() throws Exception {

    }
}