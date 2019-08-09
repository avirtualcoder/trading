package com.fosu.trading.po;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Appeal {
    private BigDecimal appealId;

    private Date appealTime;

    private String orderId;

    private BigDecimal appealStatus;

    private String appealResult;

    private String appealReason;

    private String appealImg;

    public BigDecimal getAppealId() {
        return appealId;
    }

    public void setAppealId(BigDecimal appealId) {
        this.appealId = appealId;
    }

    public Date getAppealTime() {
        return appealTime;
    }

    public void setAppealTime(Date appealTime) {
        this.appealTime = appealTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public BigDecimal getAppealStatus() {
        return appealStatus;
    }

    public void setAppealStatus(BigDecimal appealStatus) {
        this.appealStatus = appealStatus;
    }

    public String getAppealResult() {
        return appealResult;
    }

    public void setAppealResult(String appealResult) {
        this.appealResult = appealResult == null ? null : appealResult.trim();
    }

    public String getAppealReason() {
        return appealReason;
    }

    public void setAppealReason(String appealReason) {
        this.appealReason = appealReason == null ? null : appealReason.trim();
    }
    	
    public String getAppealImg() {
        return appealImg;
    }

    public void setAppealImg(String appealImg) {
        this.appealImg = appealImg == null ? null : appealImg.trim();
    }
}