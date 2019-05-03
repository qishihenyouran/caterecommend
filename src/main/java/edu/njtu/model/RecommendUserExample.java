package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class RecommendUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecommendUserExample() {
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

        public Criteria andBusinessIdIntIsNull() {
            addCriterion("business_id_int is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntIsNotNull() {
            addCriterion("business_id_int is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntEqualTo(Long value) {
            addCriterion("business_id_int =", value, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntNotEqualTo(Long value) {
            addCriterion("business_id_int <>", value, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntGreaterThan(Long value) {
            addCriterion("business_id_int >", value, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntGreaterThanOrEqualTo(Long value) {
            addCriterion("business_id_int >=", value, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntLessThan(Long value) {
            addCriterion("business_id_int <", value, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntLessThanOrEqualTo(Long value) {
            addCriterion("business_id_int <=", value, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntIn(List<Long> values) {
            addCriterion("business_id_int in", values, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntNotIn(List<Long> values) {
            addCriterion("business_id_int not in", values, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntBetween(Long value1, Long value2) {
            addCriterion("business_id_int between", value1, value2, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIntNotBetween(Long value1, Long value2) {
            addCriterion("business_id_int not between", value1, value2, "businessIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntIsNull() {
            addCriterion("user_id_int is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIntIsNotNull() {
            addCriterion("user_id_int is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdIntEqualTo(Long value) {
            addCriterion("user_id_int =", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntNotEqualTo(Long value) {
            addCriterion("user_id_int <>", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntGreaterThan(Long value) {
            addCriterion("user_id_int >", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id_int >=", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntLessThan(Long value) {
            addCriterion("user_id_int <", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntLessThanOrEqualTo(Long value) {
            addCriterion("user_id_int <=", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntIn(List<Long> values) {
            addCriterion("user_id_int in", values, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntNotIn(List<Long> values) {
            addCriterion("user_id_int not in", values, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntBetween(Long value1, Long value2) {
            addCriterion("user_id_int between", value1, value2, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntNotBetween(Long value1, Long value2) {
            addCriterion("user_id_int not between", value1, value2, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andRecommendValueIsNull() {
            addCriterion("recommend_value is null");
            return (Criteria) this;
        }

        public Criteria andRecommendValueIsNotNull() {
            addCriterion("recommend_value is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendValueEqualTo(Float value) {
            addCriterion("recommend_value =", value, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueNotEqualTo(Float value) {
            addCriterion("recommend_value <>", value, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueGreaterThan(Float value) {
            addCriterion("recommend_value >", value, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueGreaterThanOrEqualTo(Float value) {
            addCriterion("recommend_value >=", value, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueLessThan(Float value) {
            addCriterion("recommend_value <", value, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueLessThanOrEqualTo(Float value) {
            addCriterion("recommend_value <=", value, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueIn(List<Float> values) {
            addCriterion("recommend_value in", values, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueNotIn(List<Float> values) {
            addCriterion("recommend_value not in", values, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueBetween(Float value1, Float value2) {
            addCriterion("recommend_value between", value1, value2, "recommendValue");
            return (Criteria) this;
        }

        public Criteria andRecommendValueNotBetween(Float value1, Float value2) {
            addCriterion("recommend_value not between", value1, value2, "recommendValue");
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