package com.cskaoyan.springbootdubbo.bean;

public class ResponseVO<T> {
    private int status;
    private int nowPage;
    private int totalPage;
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "status=" + status +
                ", nowPage=" + nowPage +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
