package com.fosu.trading.po;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
@Component
public class Delivery {
    private BigDecimal deliveryId;

    private String orderId;

    private String senderId;

    private String deliveryPlace;

    public BigDecimal getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(BigDecimal deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId == null ? null : senderId.trim();
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace == null ? null : deliveryPlace.trim();
    }
}