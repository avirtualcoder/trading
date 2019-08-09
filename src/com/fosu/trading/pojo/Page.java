package com.fosu.trading.pojo;

import org.springframework.stereotype.Component;

@Component
public class Page {
    private int currentPage=1;    //当前页数
    private int totalPages;       //总页数
    private int totalUsers;            //记录总行数
    private int pageSize=10;    //每页记录行数
    private int nextPage;        //下一页
    private int prefPage;       //前一页
    private int role;          //查找的用户类型
    
    
    public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        totalPages = totalUsers % pageSize == 0 ? totalUsers / pageSize : totalUsers / pageSize + 1;
        if(totalPages==0){
        	totalPages=totalPages+1;
        }
        return totalPages;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getNextPage() {
        if (currentPage < totalPages) {
            nextPage = currentPage + 1;
        } else {
            nextPage = currentPage;
        }
        return nextPage;
    }

    public int getPrefPage() {
        if (currentPage > 1) {
            prefPage = currentPage - 1;
        } else {
            prefPage = currentPage;
        }
        return prefPage;
    }
}