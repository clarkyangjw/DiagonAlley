package com.clark.pojo;

import lombok.Data;

import java.util.List;

public class Page<T> {

    //currently page number
    private int pageNo;

    //list in currently page
    private List<T> list;

    //number displaying every page
    private int pageSize = 10;

    //total records
    private long totalItemNumber;

    public Page(int pageNo){
        this.pageNo = pageNo;
    }

    public int getPageNo() {
        if(pageNo < 0){
            pageNo = 1;
        }
        if(pageNo > getTotalPageNumber()){
            pageNo = getTotalPageNumber();
        }
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalItemNumber() {
        return totalItemNumber;
    }

    public void setTotalItemNumber(long totalItemNumber) {
        this.totalItemNumber = totalItemNumber;
    }

    //get total page
    public int getTotalPageNumber(){
        int totalPageNumber = (int) (totalItemNumber / pageSize);
        if(totalItemNumber % pageSize != 0){
            totalPageNumber++;
        }
        return totalPageNumber;
    }

    public boolean hasNextPage(){
        if(getPageNo() < getTotalPageNumber()){
            return true;
        }
        return false;
    }

    public boolean hasPrevPage(){
        if(getPageNo() > 1){
            return true;
        }
        return false;
    }

    public int getPrevPage(){
        if(hasPrevPage()){
            return getPageNo() - 1;
        }
        return getPageNo();
    }

    public int getNextPage(){
        if(hasNextPage()){
            return getPageNo() + 1;
        }
        return getPageNo();
    }

}
