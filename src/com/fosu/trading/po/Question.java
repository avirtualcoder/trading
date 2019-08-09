package com.fosu.trading.po;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
@Component
public class Question {
    private BigDecimal questionId;

    private String questionContent;

    private String answerContent;

    private String buyerId;

    private BigDecimal goodsId;

    public BigDecimal getQuestionId() {
        return questionId;
    }

    public void setQuestionId(BigDecimal questionId) {
        this.questionId = questionId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public BigDecimal getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(BigDecimal goodsId) {
        this.goodsId = goodsId;
    }
}