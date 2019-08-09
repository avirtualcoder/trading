package com.fosu.trading.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCancelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCancelExample() {
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

        public Criteria andCancelIdIsNull() {
            addCriterion("CANCEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNotNull() {
            addCriterion("CANCEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelIdEqualTo(Long value) {
            addCriterion("CANCEL_ID =", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotEqualTo(Long value) {
            addCriterion("CANCEL_ID <>", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThan(Long value) {
            addCriterion("CANCEL_ID >", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CANCEL_ID >=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThan(Long value) {
            addCriterion("CANCEL_ID <", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThanOrEqualTo(Long value) {
            addCriterion("CANCEL_ID <=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdIn(List<Long> values) {
            addCriterion("CANCEL_ID in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotIn(List<Long> values) {
            addCriterion("CANCEL_ID not in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdBetween(Long value1, Long value2) {
            addCriterion("CANCEL_ID between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotBetween(Long value1, Long value2) {
            addCriterion("CANCEL_ID not between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCancelUseridIsNull() {
            addCriterion("CANCEL_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCancelUseridIsNotNull() {
            addCriterion("CANCEL_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelUseridEqualTo(String value) {
            addCriterion("CANCEL_USERID =", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridNotEqualTo(String value) {
            addCriterion("CANCEL_USERID <>", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridGreaterThan(String value) {
            addCriterion("CANCEL_USERID >", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_USERID >=", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridLessThan(String value) {
            addCriterion("CANCEL_USERID <", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_USERID <=", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridLike(String value) {
            addCriterion("CANCEL_USERID like", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridNotLike(String value) {
            addCriterion("CANCEL_USERID not like", value, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridIn(List<String> values) {
            addCriterion("CANCEL_USERID in", values, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridNotIn(List<String> values) {
            addCriterion("CANCEL_USERID not in", values, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridBetween(String value1, String value2) {
            addCriterion("CANCEL_USERID between", value1, value2, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelUseridNotBetween(String value1, String value2) {
            addCriterion("CANCEL_USERID not between", value1, value2, "cancelUserid");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("CANCEL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("CANCEL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("CANCEL_REASON =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("CANCEL_REASON <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("CANCEL_REASON >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_REASON >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("CANCEL_REASON <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_REASON <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("CANCEL_REASON like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("CANCEL_REASON not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("CANCEL_REASON in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("CANCEL_REASON not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("CANCEL_REASON between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("CANCEL_REASON not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("CANCEL_TIME =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("CANCEL_TIME <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("CANCEL_TIME >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("CANCEL_TIME <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("CANCEL_TIME in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("CANCEL_TIME not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Short value) {
            addCriterion("PAY_STATUS =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Short value) {
            addCriterion("PAY_STATUS <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Short value) {
            addCriterion("PAY_STATUS >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_STATUS >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Short value) {
            addCriterion("PAY_STATUS <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("PAY_STATUS <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Short> values) {
            addCriterion("PAY_STATUS in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Short> values) {
            addCriterion("PAY_STATUS not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Short value1, Short value2) {
            addCriterion("PAY_STATUS between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("PAY_STATUS not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusIsNull() {
            addCriterion("CANCEL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCancelStatusIsNotNull() {
            addCriterion("CANCEL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCancelStatusEqualTo(Short value) {
            addCriterion("CANCEL_STATUS =", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusNotEqualTo(Short value) {
            addCriterion("CANCEL_STATUS <>", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusGreaterThan(Short value) {
            addCriterion("CANCEL_STATUS >", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CANCEL_STATUS >=", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusLessThan(Short value) {
            addCriterion("CANCEL_STATUS <", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusLessThanOrEqualTo(Short value) {
            addCriterion("CANCEL_STATUS <=", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusIn(List<Short> values) {
            addCriterion("CANCEL_STATUS in", values, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusNotIn(List<Short> values) {
            addCriterion("CANCEL_STATUS not in", values, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusBetween(Short value1, Short value2) {
            addCriterion("CANCEL_STATUS between", value1, value2, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusNotBetween(Short value1, Short value2) {
            addCriterion("CANCEL_STATUS not between", value1, value2, "cancelStatus");
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