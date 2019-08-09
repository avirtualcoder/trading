package com.fosu.trading.po;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class OrderTb {
    private String orderId;

    private Date orderTime;

    private String buyerId;

    private BigDecimal payPrice;

    private BigDecimal orderStatus;

    private BigDecimal receiptId;

    private BigDecimal payment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(BigDecimal orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(BigDecimal receiptId) {
        this.receiptId = receiptId;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }
}