package com.fosu.trading.pojo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String goodsName;
    private String goodsAdress;
    private String goodsImg;
    private String sellerName;
	private String sellerTel;
	private String buyer;
	private String buyerName;
    private String buyerTel;
	private String buyerAddress;
	private BigDecimal orderStatus;
	private Date  orderTime;
	private BigDecimal pickTask;
	public String formateTime(Date date) {
    	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    	return df.format(date);
    }
	 public String  formateDate(Date time){
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         String orderTime = sdf.format(time);
         System.out.println(orderTime);
         return orderTime;
     }
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsAdress() {
		return goodsAdress;
	}
	public void setGoodsAdress(String goodsAdress) {
		this.goodsAdress = goodsAdress;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerTel() {
		return sellerTel;
	}
	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerTel() {
		return buyerTel;
	}
	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}
	public String getBuyerAddress() {
		return buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public BigDecimal getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(BigDecimal orderStatus) {
		this.orderStatus = orderStatus;
	}
//	public Date getOrderTime() {
//		return orderTime;
//	}
//	public void setOrderTime(Date orderTime) {
//		this.orderTime = orderTime;
//	}
	public String getOrderTime() {
		return formateDate(orderTime);
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public BigDecimal getPickTask() {
		return pickTask;
	}
	public void setPickTask(BigDecimal pickTask) {
		this.pickTask = pickTask;
	}
	
	
}
