package com.fosu.trading.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatExample() {
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

        public Criteria andChatTimeIsNull() {
            addCriterion("CHAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChatTimeIsNotNull() {
            addCriterion("CHAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChatTimeEqualTo(Date value) {
            addCriterion("CHAT_TIME =", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeNotEqualTo(Date value) {
            addCriterion("CHAT_TIME <>", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeGreaterThan(Date value) {
            addCriterion("CHAT_TIME >", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHAT_TIME >=", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeLessThan(Date value) {
            addCriterion("CHAT_TIME <", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHAT_TIME <=", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeIn(List<Date> values) {
            addCriterion("CHAT_TIME in", values, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeNotIn(List<Date> values) {
            addCriterion("CHAT_TIME not in", values, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeBetween(Date value1, Date value2) {
            addCriterion("CHAT_TIME between", value1, value2, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHAT_TIME not between", value1, value2, "chatTime");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("RECEIVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("RECEIVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(String value) {
            addCriterion("RECEIVER_ID =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(String value) {
            addCriterion("RECEIVER_ID <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(String value) {
            addCriterion("RECEIVER_ID >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(String value) {
            addCriterion("RECEIVER_ID <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLike(String value) {
            addCriterion("RECEIVER_ID like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotLike(String value) {
            addCriterion("RECEIVER_ID not like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<String> values) {
            addCriterion("RECEIVER_ID in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<String> values) {
            addCriterion("RECEIVER_ID not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("SENDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("SENDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(String value) {
            addCriterion("SENDER_ID =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(String value) {
            addCriterion("SENDER_ID <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(String value) {
            addCriterion("SENDER_ID >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("SENDER_ID >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(String value) {
            addCriterion("SENDER_ID <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(String value) {
            addCriterion("SENDER_ID <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLike(String value) {
            addCriterion("SENDER_ID like", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotLike(String value) {
            addCriterion("SENDER_ID not like", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<String> values) {
            addCriterion("SENDER_ID in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<String> values) {
            addCriterion("SENDER_ID not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(String value1, String value2) {
            addCriterion("SENDER_ID between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(String value1, String value2) {
            addCriterion("SENDER_ID not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andChatContentIsNull() {
            addCriterion("CHAT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andChatContentIsNotNull() {
            addCriterion("CHAT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andChatContentEqualTo(String value) {
            addCriterion("CHAT_CONTENT =", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotEqualTo(String value) {
            addCriterion("CHAT_CONTENT <>", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentGreaterThan(String value) {
            addCriterion("CHAT_CONTENT >", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentGreaterThanOrEqualTo(String value) {
            addCriterion("CHAT_CONTENT >=", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentLessThan(String value) {
            addCriterion("CHAT_CONTENT <", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentLessThanOrEqualTo(String value) {
            addCriterion("CHAT_CONTENT <=", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentLike(String value) {
            addCriterion("CHAT_CONTENT like", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotLike(String value) {
            addCriterion("CHAT_CONTENT not like", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentIn(List<String> values) {
            addCriterion("CHAT_CONTENT in", values, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotIn(List<String> values) {
            addCriterion("CHAT_CONTENT not in", values, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentBetween(String value1, String value2) {
            addCriterion("CHAT_CONTENT between", value1, value2, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotBetween(String value1, String value2) {
            addCriterion("CHAT_CONTENT not between", value1, value2, "chatContent");
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