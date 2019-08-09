package com.fosu.trading.po;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Goods {
    private BigDecimal goodsId;

    private BigDecimal typeId;

    private String goodsName;

    private String goodsDetail;

    private BigDecimal goodPrice;

    private BigDecimal goodsLeft;

    private String goodsImg;

    private Date publishUp;

    private Date publishDown;

    private String sellerId;

    private BigDecimal goodsStatus;

    private String downReason;

    private String auditResult;
    
    private String goodsAdress;

    
    
    public String getGoodsAdress() {
		return goodsAdress;
	}

	public void setGoodsAdress(String goodsAdress) {
		this.goodsAdress = goodsAdress;
	}

	public BigDecimal getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(BigDecimal goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getTypeId() {
        return typeId;
    }

    public void setTypeId(BigDecimal typeId) {
        this.typeId = typeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public BigDecimal getGoodsLeft() {
        return goodsLeft;
    }

    public void setGoodsLeft(BigDecimal goodsLeft) {
        this.goodsLeft = goodsLeft;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public Date getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Date date) {
        this.publishUp = date;
    }

    public Date getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Date publishDown) {
        this.publishDown = publishDown;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public BigDecimal getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(BigDecimal goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getDownReason() {
        return downReason;
    }

    public void setDownReason(String downReason) {
        this.downReason = downReason == null ? null : downReason.trim();
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }
}