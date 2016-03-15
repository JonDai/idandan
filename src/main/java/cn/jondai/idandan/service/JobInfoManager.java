package cn.jondai.idandan.service;

import cn.jondai.idandan.dao.JobInfoDao;
import cn.jondai.idandan.entity.JobInfo;
import cn.jondai.idandan.entity.Paging;
import cn.jondai.idandan.util.Constant;
import com.google.common.base.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 */
@Service
@Transactional(readOnly = true)
public class JobInfoManager {

    @Autowired
    private JobInfoDao jDao;

    @PersistenceContext
    private EntityManager entityManager;

    public List<JobInfo> getUnread(){
        return jDao.findByIsReadOrderByCreateTimeDesc(0);
    }

    /**
     * 加载列表目录时，清空正文
     * @return
     */
    public List<JobInfo> getUnreadOnlyTitle(){
        List<JobInfo> jobInfos = getUnread();
        for(JobInfo jobInfo : jobInfos){
            jobInfo.setContent("");
        }
        return jobInfos;
    }

    public JobInfo getOneById(Long id){
        Optional.of(id);
        return jDao.findOne(id);
    }

    public List<JobInfo> getAll(){
        return (List<JobInfo>) jDao.findAll();
    }


    public List<JobInfo> getAllPaging(Paging paging){
        Optional.of(paging);
        String sql = "SELECT j FROM JobInfo j ORDER BY j.createTime DESC";
        int pageSize = (paging.getPageSize() == null) ? Constant.PAGESIZE : paging.getPageSize();
        return  entityManager.createQuery(sql).setFirstResult((paging.getCurrPage() - 1)* pageSize)
                .setMaxResults(pageSize).getResultList();
    }

    public List<JobInfo> getStart(){
        return jDao.findByIsStart(1);
    }

    public void SetStart(Long id){
        Optional.of(id);
        getOneById(id).setIsStart(1);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void deleteOne(Long id){
        Optional.of(id);
        jDao.delete(id);
    }
}
