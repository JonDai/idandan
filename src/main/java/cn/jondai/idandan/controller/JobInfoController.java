package cn.jondai.idandan.controller;

import cn.jondai.idandan.entity.JobInfo;
import cn.jondai.idandan.entity.Paging;
import cn.jondai.idandan.service.JobInfoManager;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 工作消息
 */
@RestController
@RequestMapping("/jobinfo")
public class JobInfoController {

    @Autowired
    private JobInfoManager jobInfoManager;

    @RequestMapping(value = "/unread" , method = RequestMethod.GET)
    public String Unread(){
        return new Gson().toJson(jobInfoManager.getUnreadOnlyTitle());
    }

    @RequestMapping(value = "all" , method = RequestMethod.GET)
    public String All(){
        return new Gson().toJson(jobInfoManager.getAll());
    }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            @RequestMapping(value = "all" , method = RequestMethod.POST)
    public String AllByPaging(Paging paging){
        Map<String,Object> result = new HashMap<>();
        try{
//            JobInfo job = jobInfoManager.getOneById(Long.parseLong(id));
//            result.put("data",job);
        }catch (Exception e){
            result.put("error","后台出错了!");
        }
        return new Gson().toJson(result);
    }

    @RequestMapping(value = "start" , method = RequestMethod.GET)
    public String Start(){
        return new Gson().toJson(jobInfoManager.getStart());
    }

    @RequestMapping(value = "detail/{id}")
    public String Detail(@PathVariable("id") String id){
        Map<String,Object> result = new HashMap<>();
        try{
            JobInfo job = jobInfoManager.getOneById(Long.parseLong(id));
            result.put("data",job);
        }catch (Exception e){
            result.put("error","后台出错了!");
        }
        return new Gson().toJson(result);
    }

    @RequestMapping(value = "start/{id}")
    public String SetStart(@PathVariable("id") String id){
        Map<String,Object> result = new HashMap<>();
        try{
            JobInfo job = jobInfoManager.getOneById(Long.parseLong(id));
            result.put("data",job);
        }catch (Exception e){
            result.put("error","后台出错了!");
        }
        return new Gson().toJson(result);
    }

    @RequestMapping(value = "delete/{id}")
    public String delete(@PathVariable("id") String id){
        Map<String,Object> result = new HashMap<>();
        try{
            jobInfoManager.deleteOne(Long.parseLong(id));
            result.put("data","删除成功");
        }catch (Exception e){
            result.put("error","后台出错了!");
        }
        return new Gson().toJson(result);
    }



}
