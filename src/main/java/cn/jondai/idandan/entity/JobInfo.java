package cn.jondai.idandan.entity;

import com.google.gson.annotations.Expose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/14.
 * 就业信息招聘实体对象
 */
@Entity
@Table(name="jobinfo")
@NamedQuery(name ="JobInfo.findAll", query = "SELECT j FROM JobInfo j")
public class JobInfo extends IdEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 工作内容标题
     */
    @Expose
    private String title;

    /**
     * 正文
     */
    @Expose
    private String content;

    /**
     * 发布时间
     */
    @Expose
    private String pubtime;

    /**
     * 发布单位
     */
    @Expose
    private String pubUnit;

    /**
     * 消息来源单位
     */
    @Expose
    private String fromUnit;

    /**
     * 消息来源连接
     */
    @Expose
    private String fromUnitUrl;

    /**
     * 该消息的连接地址
     */
    @Expose
    private String jobUrl;

    /**
     * 创建时间
     */
    @Expose
    private String createTime;

    /**
     * 是否收藏
     * 0:未收藏
     * 1：已收藏
     */
    @Expose
    private int isStart;

    /**
     * 是否已读
     * 0：未读
     * 1：已读
     */
    @Expose
    private int isRead;

    /**
     * 初始化对象
     */
    public JobInfo() {
        this.isStart = 0;
        this.isRead = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="content" , length = 1024)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public String getPubUnit() {
        return pubUnit;
    }

    public void setPubUnit(String pubUnit) {
        this.pubUnit = pubUnit;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public String getFromUnitUrl() {
        return fromUnitUrl;
    }

    public void setFromUnitUrl(String fromUnitUrl) {
        this.fromUnitUrl = fromUnitUrl;
    }

    public String getJobUrl() {
        return jobUrl;
    }

    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getIsStart() {
        return isStart;
    }

    public void setIsStart(int isStart) {
        this.isStart = isStart;
    }

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }
}
