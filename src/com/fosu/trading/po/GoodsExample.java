package com.fosu.trading.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("TYPE_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("TYPE_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("TYPE_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TYPE_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("TYPE_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("TYPE_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("TYPE_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("TYPE_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("TYPE_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("TYPE_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNull() {
            addCriterion("GOODS_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNotNull() {
            addCriterion("GOODS_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailEqualTo(String value) {
            addCriterion("GOODS_DETAIL =", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotEqualTo(String value) {
            addCriterion("GOODS_DETAIL <>", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThan(String value) {
            addCriterion("GOODS_DETAIL >", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_DETAIL >=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThan(String value) {
            addCriterion("GOODS_DETAIL <", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThanOrEqualTo(String value) {
            addCriterion("GOODS_DETAIL <=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLike(String value) {
            addCriterion("GOODS_DETAIL like", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotLike(String value) {
            addCriterion("GOODS_DETAIL not like", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIn(List<String> values) {
            addCriterion("GOODS_DETAIL in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotIn(List<String> values) {
            addCriterion("GOODS_DETAIL not in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailBetween(String value1, String value2) {
            addCriterion("GOODS_DETAIL between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotBetween(String value1, String value2) {
            addCriterion("GOODS_DETAIL not between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("GOOD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("GOOD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(BigDecimal value) {
            addCriterion("GOOD_PRICE >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(BigDecimal value) {
            addCriterion("GOOD_PRICE <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<BigDecimal> values) {
            addCriterion("GOOD_PRICE in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOOD_PRICE not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_PRICE between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_PRICE not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftIsNull() {
            addCriterion("GOODS_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftIsNotNull() {
            addCriterion("GOODS_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftEqualTo(Integer value) {
            addCriterion("GOODS_LEFT =", value, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftNotEqualTo(Integer value) {
            addCriterion("GOODS_LEFT <>", value, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftGreaterThan(Integer value) {
            addCriterion("GOODS_LEFT >", value, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_LEFT >=", value, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftLessThan(Integer value) {
            addCriterion("GOODS_LEFT <", value, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_LEFT <=", value, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftIn(List<Integer> values) {
            addCriterion("GOODS_LEFT in", values, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftNotIn(List<Integer> values) {
            addCriterion("GOODS_LEFT not in", values, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_LEFT between", value1, value2, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_LEFT not between", value1, value2, "goodsLeft");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("GOODS_IMG is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("GOODS_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("GOODS_IMG =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("GOODS_IMG <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("GOODS_IMG >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_IMG >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("GOODS_IMG <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("GOODS_IMG <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("GOODS_IMG like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("GOODS_IMG not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("GOODS_IMG in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("GOODS_IMG not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("GOODS_IMG between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("GOODS_IMG not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andPublishUpIsNull() {
            addCriterion("PUBLISH_UP is null");
            return (Criteria) this;
        }

        public Criteria andPublishUpIsNotNull() {
            addCriterion("PUBLISH_UP is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUpEqualTo(Date value) {
            addCriterion("PUBLISH_UP =", value, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpNotEqualTo(Date value) {
            addCriterion("PUBLISH_UP <>", value, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpGreaterThan(Date value) {
            addCriterion("PUBLISH_UP >", value, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_UP >=", value, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpLessThan(Date value) {
            addCriterion("PUBLISH_UP <", value, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpLessThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_UP <=", value, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpIn(List<Date> values) {
            addCriterion("PUBLISH_UP in", values, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpNotIn(List<Date> values) {
            addCriterion("PUBLISH_UP not in", values, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_UP between", value1, value2, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishUpNotBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_UP not between", value1, value2, "publishUp");
            return (Criteria) this;
        }

        public Criteria andPublishDownIsNull() {
            addCriterion("PUBLISH_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andPublishDownIsNotNull() {
            addCriterion("PUBLISH_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDownEqualTo(Date value) {
            addCriterion("PUBLISH_DOWN =", value, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownNotEqualTo(Date value) {
            addCriterion("PUBLISH_DOWN <>", value, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownGreaterThan(Date value) {
            addCriterion("PUBLISH_DOWN >", value, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_DOWN >=", value, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownLessThan(Date value) {
            addCriterion("PUBLISH_DOWN <", value, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownLessThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_DOWN <=", value, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownIn(List<Date> values) {
            addCriterion("PUBLISH_DOWN in", values, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownNotIn(List<Date> values) {
            addCriterion("PUBLISH_DOWN not in", values, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_DOWN between", value1, value2, "publishDown");
            return (Criteria) this;
        }

        public Criteria andPublishDownNotBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_DOWN not between", value1, value2, "publishDown");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("SELLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("SELLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("SELLER_ID =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("SELLER_ID <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("SELLER_ID >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_ID >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("SELLER_ID <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_ID <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("SELLER_ID like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("SELLER_ID not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("SELLER_ID in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("SELLER_ID not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("SELLER_ID between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_ID not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("GOODS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("GOODS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(BigDecimal value) {
            addCriterion("GOODS_STATUS =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_STATUS <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(BigDecimal value) {
            addCriterion("GOODS_STATUS >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_STATUS >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(BigDecimal value) {
            addCriterion("GOODS_STATUS <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_STATUS <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<BigDecimal> values) {
            addCriterion("GOODS_STATUS in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_STATUS not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_STATUS between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_STATUS not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andDownReasonIsNull() {
            addCriterion("DOWN_REASON is null");
            return (Criteria) this;
        }

        public Criteria andDownReasonIsNotNull() {
            addCriterion("DOWN_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andDownReasonEqualTo(String value) {
            addCriterion("DOWN_REASON =", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotEqualTo(String value) {
            addCriterion("DOWN_REASON <>", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonGreaterThan(String value) {
            addCriterion("DOWN_REASON >", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonGreaterThanOrEqualTo(String value) {
            addCriterion("DOWN_REASON >=", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonLessThan(String value) {
            addCriterion("DOWN_REASON <", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonLessThanOrEqualTo(String value) {
            addCriterion("DOWN_REASON <=", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonLike(String value) {
            addCriterion("DOWN_REASON like", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotLike(String value) {
            addCriterion("DOWN_REASON not like", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonIn(List<String> values) {
            addCriterion("DOWN_REASON in", values, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotIn(List<String> values) {
            addCriterion("DOWN_REASON not in", values, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonBetween(String value1, String value2) {
            addCriterion("DOWN_REASON between", value1, value2, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotBetween(String value1, String value2) {
            addCriterion("DOWN_REASON not between", value1, value2, "downReason");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("AUDIT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("AUDIT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(String value) {
            addCriterion("AUDIT_RESULT =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(String value) {
            addCriterion("AUDIT_RESULT <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(String value) {
            addCriterion("AUDIT_RESULT >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_RESULT >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(String value) {
            addCriterion("AUDIT_RESULT <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_RESULT <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLike(String value) {
            addCriterion("AUDIT_RESULT like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotLike(String value) {
            addCriterion("AUDIT_RESULT not like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<String> values) {
            addCriterion("AUDIT_RESULT in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<String> values) {
            addCriterion("AUDIT_RESULT not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(String value1, String value2) {
            addCriterion("AUDIT_RESULT between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(String value1, String value2) {
            addCriterion("AUDIT_RESULT not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressIsNull() {
            addCriterion("GOODS_ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressIsNotNull() {
            addCriterion("GOODS_ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressEqualTo(String value) {
            addCriterion("GOODS_ADRESS =", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressNotEqualTo(String value) {
            addCriterion("GOODS_ADRESS <>", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressGreaterThan(String value) {
            addCriterion("GOODS_ADRESS >", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_ADRESS >=", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressLessThan(String value) {
            addCriterion("GOODS_ADRESS <", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressLessThanOrEqualTo(String value) {
            addCriterion("GOODS_ADRESS <=", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressLike(String value) {
            addCriterion("GOODS_ADRESS like", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressNotLike(String value) {
            addCriterion("GOODS_ADRESS not like", value, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressIn(List<String> values) {
            addCriterion("GOODS_ADRESS in", values, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressNotIn(List<String> values) {
            addCriterion("GOODS_ADRESS not in", values, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressBetween(String value1, String value2) {
            addCriterion("GOODS_ADRESS between", value1, value2, "goodsAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsAdressNotBetween(String value1, String value2) {
            addCriterion("GOODS_ADRESS not between", value1, value2, "goodsAdress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}