package com.xiaoqi.pojo.vo;

/**
 * 分页查询 视图层对象
 * @author : yangfan
 * @Date : 2020/7/1
 **/
public class PageVo {
    /**
     * 页数
     */
    private Integer page;
    /**
     * 每页数量
     */
    private Integer pageSize;
    /**
     * 查询字段
     */
    private String type;
    /**
     * 查询条件
     */
    private String condition;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "PageVo{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", type='" + type + '\'' +
                ", condition='" + condition + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
