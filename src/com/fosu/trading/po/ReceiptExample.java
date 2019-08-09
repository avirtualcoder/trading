package com.fosu.trading.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiptExample() {
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

        public Criteria andReceiptIdIsNull() {
            addCriterion("RECEIPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIsNotNull() {
            addCriterion("RECEIPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdEqualTo(Long value) {
            addCriterion("RECEIPT_ID =", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotEqualTo(Long value) {
            addCriterion("RECEIPT_ID <>", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThan(Long value) {
            addCriterion("RECEIPT_ID >", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECEIPT_ID >=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThan(Long value) {
            addCriterion("RECEIPT_ID <", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThanOrEqualTo(Long value) {
            addCriterion("RECEIPT_ID <=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIn(List<Long> values) {
            addCriterion("RECEIPT_ID in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotIn(List<Long> values) {
            addCriterion("RECEIPT_ID not in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdBetween(Long value1, Long value2) {
            addCriterion("RECEIPT_ID between", value1, value2, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotBetween(Long value1, Long value2) {
            addCriterion("RECEIPT_ID not between", value1, value2, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonIsNull() {
            addCriterion("RECEIPT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonIsNotNull() {
            addCriterion("RECEIPT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonEqualTo(String value) {
            addCriterion("RECEIPT_PERSON =", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotEqualTo(String value) {
            addCriterion("RECEIPT_PERSON <>", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonGreaterThan(String value) {
            addCriterion("RECEIPT_PERSON >", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_PERSON >=", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonLessThan(String value) {
            addCriterion("RECEIPT_PERSON <", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_PERSON <=", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonLike(String value) {
            addCriterion("RECEIPT_PERSON like", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotLike(String value) {
            addCriterion("RECEIPT_PERSON not like", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonIn(List<String> values) {
            addCriterion("RECEIPT_PERSON in", values, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotIn(List<String> values) {
            addCriterion("RECEIPT_PERSON not in", values, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonBetween(String value1, String value2) {
            addCriterion("RECEIPT_PERSON between", value1, value2, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_PERSON not between", value1, value2, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNull() {
            addCriterion("RECEIPT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNotNull() {
            addCriterion("RECEIPT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelEqualTo(String value) {
            addCriterion("RECEIPT_TEL =", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotEqualTo(String value) {
            addCriterion("RECEIPT_TEL <>", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThan(String value) {
            addCriterion("RECEIPT_TEL >", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_TEL >=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThan(String value) {
            addCriterion("RECEIPT_TEL <", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_TEL <=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLike(String value) {
            addCriterion("RECEIPT_TEL like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotLike(String value) {
            addCriterion("RECEIPT_TEL not like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIn(List<String> values) {
            addCriterion("RECEIPT_TEL in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotIn(List<String> values) {
            addCriterion("RECEIPT_TEL not in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelBetween(String value1, String value2) {
            addCriterion("RECEIPT_TEL between", value1, value2, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_TEL not between", value1, value2, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNull() {
            addCriterion("RECEIPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNotNull() {
            addCriterion("RECEIPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeEqualTo(Date value) {
            addCriterion("RECEIPT_TIME =", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotEqualTo(Date value) {
            addCriterion("RECEIPT_TIME <>", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThan(Date value) {
            addCriterion("RECEIPT_TIME >", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIPT_TIME >=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThan(Date value) {
            addCriterion("RECEIPT_TIME <", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIPT_TIME <=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIn(List<Date> values) {
            addCriterion("RECEIPT_TIME in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotIn(List<Date> values) {
            addCriterion("RECEIPT_TIME not in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIPT_TIME between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIPT_TIME not between", value1, value2, "receiptTime");
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