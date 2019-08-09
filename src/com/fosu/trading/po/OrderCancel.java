package com.fosu.trading.po;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class OrderCancel {
    private BigDecimal cancelId;

    private String orderId;

    private String cancelUserid;

    private String cancelReason;

    private Date cancelTime;

    private BigDecimal payStatus;

    private BigDecimal cancelStatus;

    public BigDecimal getCancelId() {
        return cancelId;
    }

    public void setCancelId(BigDecimal cancelId) {
        this.cancelId = cancelId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCancelUserid() {
        return cancelUserid;
    }

    public void setCancelUserid(String cancelUserid) {
        this.cancelUserid = cancelUserid == null ? null : cancelUserid.trim();
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public BigDecimal getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(BigDecimal payStatus) {
        this.payStatus = payStatus;
    }

    public BigDecimal getCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(BigDecimal cancelStatus) {
        this.cancelStatus = cancelStatus;
    }
}