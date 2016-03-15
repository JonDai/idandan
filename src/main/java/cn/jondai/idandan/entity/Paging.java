package cn.jondai.idandan.entity;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/15.
 * 分页VO
 */
public class Paging {

    public Paging(Integer pageSize, Integer currPage) {
        this.pageSize = pageSize;
        this.currPage = currPage;
    }

    private Integer pageSize;

    private Integer currPage;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }
}
