package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class VoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoteExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdIsNull() {
            addCriterion("be_review_id is null");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdIsNotNull() {
            addCriterion("be_review_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdEqualTo(String value) {
            addCriterion("be_review_id =", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdNotEqualTo(String value) {
            addCriterion("be_review_id <>", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdGreaterThan(String value) {
            addCriterion("be_review_id >", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("be_review_id >=", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdLessThan(String value) {
            addCriterion("be_review_id <", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdLessThanOrEqualTo(String value) {
            addCriterion("be_review_id <=", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdLike(String value) {
            addCriterion("be_review_id like", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdNotLike(String value) {
            addCriterion("be_review_id not like", value, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdIn(List<String> values) {
            addCriterion("be_review_id in", values, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdNotIn(List<String> values) {
            addCriterion("be_review_id not in", values, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdBetween(String value1, String value2) {
            addCriterion("be_review_id between", value1, value2, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBeReviewIdNotBetween(String value1, String value2) {
            addCriterion("be_review_id not between", value1, value2, "beReviewId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("business_id like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("business_id not like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andCoolIsNull() {
            addCriterion("cool is null");
            return (Criteria) this;
        }

        public Criteria andCoolIsNotNull() {
            addCriterion("cool is not null");
            return (Criteria) this;
        }

        public Criteria andCoolEqualTo(Boolean value) {
            addCriterion("cool =", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolNotEqualTo(Boolean value) {
            addCriterion("cool <>", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolGreaterThan(Boolean value) {
            addCriterion("cool >", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cool >=", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolLessThan(Boolean value) {
            addCriterion("cool <", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolLessThanOrEqualTo(Boolean value) {
            addCriterion("cool <=", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolIn(List<Boolean> values) {
            addCriterion("cool in", values, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolNotIn(List<Boolean> values) {
            addCriterion("cool not in", values, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolBetween(Boolean value1, Boolean value2) {
            addCriterion("cool between", value1, value2, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cool not between", value1, value2, "cool");
            return (Criteria) this;
        }

        public Criteria andFunnyIsNull() {
            addCriterion("funny is null");
            return (Criteria) this;
        }

        public Criteria andFunnyIsNotNull() {
            addCriterion("funny is not null");
            return (Criteria) this;
        }

        public Criteria andFunnyEqualTo(Boolean value) {
            addCriterion("funny =", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyNotEqualTo(Boolean value) {
            addCriterion("funny <>", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyGreaterThan(Boolean value) {
            addCriterion("funny >", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("funny >=", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyLessThan(Boolean value) {
            addCriterion("funny <", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyLessThanOrEqualTo(Boolean value) {
            addCriterion("funny <=", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyIn(List<Boolean> values) {
            addCriterion("funny in", values, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyNotIn(List<Boolean> values) {
            addCriterion("funny not in", values, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyBetween(Boolean value1, Boolean value2) {
            addCriterion("funny between", value1, value2, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("funny not between", value1, value2, "funny");
            return (Criteria) this;
        }

        public Criteria andUsefulIsNull() {
            addCriterion("useful is null");
            return (Criteria) this;
        }

        public Criteria andUsefulIsNotNull() {
            addCriterion("useful is not null");
            return (Criteria) this;
        }

        public Criteria andUsefulEqualTo(Boolean value) {
            addCriterion("useful =", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulNotEqualTo(Boolean value) {
            addCriterion("useful <>", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulGreaterThan(Boolean value) {
            addCriterion("useful >", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulGreaterThanOrEqualTo(Boolean value) {
            addCriterion("useful >=", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulLessThan(Boolean value) {
            addCriterion("useful <", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulLessThanOrEqualTo(Boolean value) {
            addCriterion("useful <=", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulIn(List<Boolean> values) {
            addCriterion("useful in", values, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulNotIn(List<Boolean> values) {
            addCriterion("useful not in", values, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulBetween(Boolean value1, Boolean value2) {
            addCriterion("useful between", value1, value2, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulNotBetween(Boolean value1, Boolean value2) {
            addCriterion("useful not between", value1, value2, "useful");
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