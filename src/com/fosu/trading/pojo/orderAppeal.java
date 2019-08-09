package com.fosu.trading.pojo;

import org.springframework.stereotype.Component;

@Component
public class orderAppeal {
	private int appealId;
	private String orderId;
	private String buyerId;
	private String sellerId;
	private int credit;
	private int goodsId;
	private String appealReason;
	private int role;
	
	
    
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getAppealReason() {
		return appealReason;
	}
	public void setAppealReason(String appealReason) {
		this.appealReason = appealReason;
	}
	public int getAppealId() {
		return appealId;
	}
	public void setAppealId(int appealId) {
		this.appealId = appealId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	
	
}
