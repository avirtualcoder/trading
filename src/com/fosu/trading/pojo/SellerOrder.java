package com.fosu.trading.pojo;

import java.math.BigDecimal;

import javax.servlet.SessionTrackingMode;

import org.omg.CORBA.PRIVATE_MEMBER;

public class SellerOrder {
	private BigDecimal itemId; 
	private String sellerId;
	private String goodsName;
	private String goodsAdress;
	private String goodsImg;
	private String buyer;
	private String receiptName;
	private String receiptAddress;
	private String receiptTel;
	private BigDecimal orderStatus;
	private BigDecimal payMent;
    private String payPrice;
	private BigDecimal goodsCount;
	private BigDecimal star;
	public BigDecimal getItemId() {
		return itemId;
	}
	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
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
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getReceiptName() {
		return receiptName;
	}
	public void setReceiptName(String receiptName) {
		this.receiptName = receiptName;
	}
	public String getReceiptAddress() {
		return receiptAddress;
	}
	public void setReceiptAddress(String receiptAddress) {
		this.receiptAddress = receiptAddress;
	}
	public String getReceiptTel() {
		return receiptTel;
	}
	public void setReceiptTel(String receiptTel) {
		this.receiptTel = receiptTel;
	}
	public BigDecimal getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(BigDecimal orderStatus) {
		this.orderStatus = orderStatus;
	}
	public BigDecimal getPayMent() {
		return payMent;
	}
	public void setPayMent(BigDecimal payMent) {
		this.payMent = payMent;
	}
	public String getPayPrice() {
		return payPrice;
	}
	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}
	public BigDecimal getGoodsCount() {
		return goodsCount;
	}
	public void setGoodsCount(BigDecimal goodsCount) {
		this.goodsCount = goodsCount;
	}
	public BigDecimal getStar() {
		return star;
	}
	public void setStar(BigDecimal star) {
		this.star = star;
	}

	
}
