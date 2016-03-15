package cn.jondai.idandan.dao;

import cn.jondai.idandan.entity.JobInfo;
import cn.jondai.idandan.entity.Paging;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 */
@Repository
public interface JobInfoDao extends CrudRepository<JobInfo, Long>{

    List<JobInfo> findByJobUrl(String url);

    List<JobInfo> findByIsReadOrderByCreateTimeDesc(int i);

    List<JobInfo> findByIsStart(int i);

}
