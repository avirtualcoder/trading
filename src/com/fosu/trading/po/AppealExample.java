package com.fosu.trading.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppealExample() {
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

        public Criteria andAppealIdIsNull() {
            addCriterion("APPEAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppealIdIsNotNull() {
            addCriterion("APPEAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppealIdEqualTo(Long value) {
            addCriterion("APPEAL_ID =", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotEqualTo(Long value) {
            addCriterion("APPEAL_ID <>", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThan(Long value) {
            addCriterion("APPEAL_ID >", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPEAL_ID >=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThan(Long value) {
            addCriterion("APPEAL_ID <", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThanOrEqualTo(Long value) {
            addCriterion("APPEAL_ID <=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdIn(List<Long> values) {
            addCriterion("APPEAL_ID in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotIn(List<Long> values) {
            addCriterion("APPEAL_ID not in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdBetween(Long value1, Long value2) {
            addCriterion("APPEAL_ID between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotBetween(Long value1, Long value2) {
            addCriterion("APPEAL_ID not between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNull() {
            addCriterion("APPEAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNotNull() {
            addCriterion("APPEAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeEqualTo(Date value) {
            addCriterion("APPEAL_TIME =", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotEqualTo(Date value) {
            addCriterion("APPEAL_TIME <>", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThan(Date value) {
            addCriterion("APPEAL_TIME >", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPEAL_TIME >=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThan(Date value) {
            addCriterion("APPEAL_TIME <", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPEAL_TIME <=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIn(List<Date> values) {
            addCriterion("APPEAL_TIME in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotIn(List<Date> values) {
            addCriterion("APPEAL_TIME not in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeBetween(Date value1, Date value2) {
            addCriterion("APPEAL_TIME between", value1, value2, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPEAL_TIME not between", value1, value2, "appealTime");
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

        public Criteria andAppealStatusIsNull() {
            addCriterion("APPEAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAppealStatusIsNotNull() {
            addCriterion("APPEAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAppealStatusEqualTo(BigDecimal value) {
            addCriterion("APPEAL_STATUS =", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusNotEqualTo(BigDecimal value) {
            addCriterion("APPEAL_STATUS <>", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusGreaterThan(BigDecimal value) {
            addCriterion("APPEAL_STATUS >", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPEAL_STATUS >=", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusLessThan(BigDecimal value) {
            addCriterion("APPEAL_STATUS <", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPEAL_STATUS <=", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusIn(List<BigDecimal> values) {
            addCriterion("APPEAL_STATUS in", values, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusNotIn(List<BigDecimal> values) {
            addCriterion("APPEAL_STATUS not in", values, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPEAL_STATUS between", value1, value2, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPEAL_STATUS not between", value1, value2, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealResultIsNull() {
            addCriterion("APPEAL_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAppealResultIsNotNull() {
            addCriterion("APPEAL_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAppealResultEqualTo(String value) {
            addCriterion("APPEAL_RESULT =", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotEqualTo(String value) {
            addCriterion("APPEAL_RESULT <>", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultGreaterThan(String value) {
            addCriterion("APPEAL_RESULT >", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultGreaterThanOrEqualTo(String value) {
            addCriterion("APPEAL_RESULT >=", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultLessThan(String value) {
            addCriterion("APPEAL_RESULT <", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultLessThanOrEqualTo(String value) {
            addCriterion("APPEAL_RESULT <=", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultLike(String value) {
            addCriterion("APPEAL_RESULT like", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotLike(String value) {
            addCriterion("APPEAL_RESULT not like", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultIn(List<String> values) {
            addCriterion("APPEAL_RESULT in", values, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotIn(List<String> values) {
            addCriterion("APPEAL_RESULT not in", values, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultBetween(String value1, String value2) {
            addCriterion("APPEAL_RESULT between", value1, value2, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotBetween(String value1, String value2) {
            addCriterion("APPEAL_RESULT not between", value1, value2, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealReasonIsNull() {
            addCriterion("APPEAL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andAppealReasonIsNotNull() {
            addCriterion("APPEAL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andAppealReasonEqualTo(String value) {
            addCriterion("APPEAL_REASON =", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotEqualTo(String value) {
            addCriterion("APPEAL_REASON <>", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonGreaterThan(String value) {
            addCriterion("APPEAL_REASON >", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonGreaterThanOrEqualTo(String value) {
            addCriterion("APPEAL_REASON >=", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonLessThan(String value) {
            addCriterion("APPEAL_REASON <", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonLessThanOrEqualTo(String value) {
            addCriterion("APPEAL_REASON <=", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonLike(String value) {
            addCriterion("APPEAL_REASON like", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotLike(String value) {
            addCriterion("APPEAL_REASON not like", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonIn(List<String> values) {
            addCriterion("APPEAL_REASON in", values, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotIn(List<String> values) {
            addCriterion("APPEAL_REASON not in", values, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonBetween(String value1, String value2) {
            addCriterion("APPEAL_REASON between", value1, value2, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotBetween(String value1, String value2) {
            addCriterion("APPEAL_REASON not between", value1, value2, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealImgIsNull() {
            addCriterion("APPEAL_IMG is null");
            return (Criteria) this;
        }

        public Criteria andAppealImgIsNotNull() {
            addCriterion("APPEAL_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andAppealImgEqualTo(String value) {
            addCriterion("APPEAL_IMG =", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgNotEqualTo(String value) {
            addCriterion("APPEAL_IMG <>", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgGreaterThan(String value) {
            addCriterion("APPEAL_IMG >", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgGreaterThanOrEqualTo(String value) {
            addCriterion("APPEAL_IMG >=", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgLessThan(String value) {
            addCriterion("APPEAL_IMG <", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgLessThanOrEqualTo(String value) {
            addCriterion("APPEAL_IMG <=", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgLike(String value) {
            addCriterion("APPEAL_IMG like", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgNotLike(String value) {
            addCriterion("APPEAL_IMG not like", value, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgIn(List<String> values) {
            addCriterion("APPEAL_IMG in", values, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgNotIn(List<String> values) {
            addCriterion("APPEAL_IMG not in", values, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgBetween(String value1, String value2) {
            addCriterion("APPEAL_IMG between", value1, value2, "appealImg");
            return (Criteria) this;
        }

        public Criteria andAppealImgNotBetween(String value1, String value2) {
            addCriterion("APPEAL_IMG not between", value1, value2, "appealImg");
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