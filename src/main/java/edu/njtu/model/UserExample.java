package edu.njtu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andReviewCountIsNull() {
            addCriterion("review_count is null");
            return (Criteria) this;
        }

        public Criteria andReviewCountIsNotNull() {
            addCriterion("review_count is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCountEqualTo(Integer value) {
            addCriterion("review_count =", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotEqualTo(Integer value) {
            addCriterion("review_count <>", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountGreaterThan(Integer value) {
            addCriterion("review_count >", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_count >=", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountLessThan(Integer value) {
            addCriterion("review_count <", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountLessThanOrEqualTo(Integer value) {
            addCriterion("review_count <=", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountIn(List<Integer> values) {
            addCriterion("review_count in", values, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotIn(List<Integer> values) {
            addCriterion("review_count not in", values, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountBetween(Integer value1, Integer value2) {
            addCriterion("review_count between", value1, value2, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("review_count not between", value1, value2, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceIsNull() {
            addCriterion("yelping_since is null");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceIsNotNull() {
            addCriterion("yelping_since is not null");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceEqualTo(Date value) {
            addCriterion("yelping_since =", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceNotEqualTo(Date value) {
            addCriterion("yelping_since <>", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceGreaterThan(Date value) {
            addCriterion("yelping_since >", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceGreaterThanOrEqualTo(Date value) {
            addCriterion("yelping_since >=", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceLessThan(Date value) {
            addCriterion("yelping_since <", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceLessThanOrEqualTo(Date value) {
            addCriterion("yelping_since <=", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceIn(List<Date> values) {
            addCriterion("yelping_since in", values, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceNotIn(List<Date> values) {
            addCriterion("yelping_since not in", values, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceBetween(Date value1, Date value2) {
            addCriterion("yelping_since between", value1, value2, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceNotBetween(Date value1, Date value2) {
            addCriterion("yelping_since not between", value1, value2, "yelpingSince");
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

        public Criteria andUsefulEqualTo(Integer value) {
            addCriterion("useful =", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulNotEqualTo(Integer value) {
            addCriterion("useful <>", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulGreaterThan(Integer value) {
            addCriterion("useful >", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulGreaterThanOrEqualTo(Integer value) {
            addCriterion("useful >=", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulLessThan(Integer value) {
            addCriterion("useful <", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulLessThanOrEqualTo(Integer value) {
            addCriterion("useful <=", value, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulIn(List<Integer> values) {
            addCriterion("useful in", values, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulNotIn(List<Integer> values) {
            addCriterion("useful not in", values, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulBetween(Integer value1, Integer value2) {
            addCriterion("useful between", value1, value2, "useful");
            return (Criteria) this;
        }

        public Criteria andUsefulNotBetween(Integer value1, Integer value2) {
            addCriterion("useful not between", value1, value2, "useful");
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

        public Criteria andFunnyEqualTo(Integer value) {
            addCriterion("funny =", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyNotEqualTo(Integer value) {
            addCriterion("funny <>", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyGreaterThan(Integer value) {
            addCriterion("funny >", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("funny >=", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyLessThan(Integer value) {
            addCriterion("funny <", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyLessThanOrEqualTo(Integer value) {
            addCriterion("funny <=", value, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyIn(List<Integer> values) {
            addCriterion("funny in", values, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyNotIn(List<Integer> values) {
            addCriterion("funny not in", values, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyBetween(Integer value1, Integer value2) {
            addCriterion("funny between", value1, value2, "funny");
            return (Criteria) this;
        }

        public Criteria andFunnyNotBetween(Integer value1, Integer value2) {
            addCriterion("funny not between", value1, value2, "funny");
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

        public Criteria andCoolEqualTo(Integer value) {
            addCriterion("cool =", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolNotEqualTo(Integer value) {
            addCriterion("cool <>", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolGreaterThan(Integer value) {
            addCriterion("cool >", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("cool >=", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolLessThan(Integer value) {
            addCriterion("cool <", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolLessThanOrEqualTo(Integer value) {
            addCriterion("cool <=", value, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolIn(List<Integer> values) {
            addCriterion("cool in", values, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolNotIn(List<Integer> values) {
            addCriterion("cool not in", values, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolBetween(Integer value1, Integer value2) {
            addCriterion("cool between", value1, value2, "cool");
            return (Criteria) this;
        }

        public Criteria andCoolNotBetween(Integer value1, Integer value2) {
            addCriterion("cool not between", value1, value2, "cool");
            return (Criteria) this;
        }

        public Criteria andFansIsNull() {
            addCriterion("fans is null");
            return (Criteria) this;
        }

        public Criteria andFansIsNotNull() {
            addCriterion("fans is not null");
            return (Criteria) this;
        }

        public Criteria andFansEqualTo(Integer value) {
            addCriterion("fans =", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotEqualTo(Integer value) {
            addCriterion("fans <>", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThan(Integer value) {
            addCriterion("fans >", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans >=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThan(Integer value) {
            addCriterion("fans <", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThanOrEqualTo(Integer value) {
            addCriterion("fans <=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansIn(List<Integer> values) {
            addCriterion("fans in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotIn(List<Integer> values) {
            addCriterion("fans not in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansBetween(Integer value1, Integer value2) {
            addCriterion("fans between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotBetween(Integer value1, Integer value2) {
            addCriterion("fans not between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andAverageStarsIsNull() {
            addCriterion("average_stars is null");
            return (Criteria) this;
        }

        public Criteria andAverageStarsIsNotNull() {
            addCriterion("average_stars is not null");
            return (Criteria) this;
        }

        public Criteria andAverageStarsEqualTo(Float value) {
            addCriterion("average_stars =", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsNotEqualTo(Float value) {
            addCriterion("average_stars <>", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsGreaterThan(Float value) {
            addCriterion("average_stars >", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsGreaterThanOrEqualTo(Float value) {
            addCriterion("average_stars >=", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsLessThan(Float value) {
            addCriterion("average_stars <", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsLessThanOrEqualTo(Float value) {
            addCriterion("average_stars <=", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsIn(List<Float> values) {
            addCriterion("average_stars in", values, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsNotIn(List<Float> values) {
            addCriterion("average_stars not in", values, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsBetween(Float value1, Float value2) {
            addCriterion("average_stars between", value1, value2, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsNotBetween(Float value1, Float value2) {
            addCriterion("average_stars not between", value1, value2, "averageStars");
            return (Criteria) this;
        }

        public Criteria andComplimentHotIsNull() {
            addCriterion("compliment_hot is null");
            return (Criteria) this;
        }

        public Criteria andComplimentHotIsNotNull() {
            addCriterion("compliment_hot is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentHotEqualTo(Integer value) {
            addCriterion("compliment_hot =", value, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotNotEqualTo(Integer value) {
            addCriterion("compliment_hot <>", value, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotGreaterThan(Integer value) {
            addCriterion("compliment_hot >", value, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_hot >=", value, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotLessThan(Integer value) {
            addCriterion("compliment_hot <", value, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_hot <=", value, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotIn(List<Integer> values) {
            addCriterion("compliment_hot in", values, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotNotIn(List<Integer> values) {
            addCriterion("compliment_hot not in", values, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_hot between", value1, value2, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentHotNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_hot not between", value1, value2, "complimentHot");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreIsNull() {
            addCriterion("compliment_more is null");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreIsNotNull() {
            addCriterion("compliment_more is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreEqualTo(Integer value) {
            addCriterion("compliment_more =", value, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreNotEqualTo(Integer value) {
            addCriterion("compliment_more <>", value, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreGreaterThan(Integer value) {
            addCriterion("compliment_more >", value, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_more >=", value, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreLessThan(Integer value) {
            addCriterion("compliment_more <", value, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_more <=", value, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreIn(List<Integer> values) {
            addCriterion("compliment_more in", values, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreNotIn(List<Integer> values) {
            addCriterion("compliment_more not in", values, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreBetween(Integer value1, Integer value2) {
            addCriterion("compliment_more between", value1, value2, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentMoreNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_more not between", value1, value2, "complimentMore");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileIsNull() {
            addCriterion("compliment_profile is null");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileIsNotNull() {
            addCriterion("compliment_profile is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileEqualTo(Integer value) {
            addCriterion("compliment_profile =", value, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileNotEqualTo(Integer value) {
            addCriterion("compliment_profile <>", value, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileGreaterThan(Integer value) {
            addCriterion("compliment_profile >", value, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_profile >=", value, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileLessThan(Integer value) {
            addCriterion("compliment_profile <", value, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_profile <=", value, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileIn(List<Integer> values) {
            addCriterion("compliment_profile in", values, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileNotIn(List<Integer> values) {
            addCriterion("compliment_profile not in", values, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileBetween(Integer value1, Integer value2) {
            addCriterion("compliment_profile between", value1, value2, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentProfileNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_profile not between", value1, value2, "complimentProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteIsNull() {
            addCriterion("compliment_cute is null");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteIsNotNull() {
            addCriterion("compliment_cute is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteEqualTo(Integer value) {
            addCriterion("compliment_cute =", value, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteNotEqualTo(Integer value) {
            addCriterion("compliment_cute <>", value, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteGreaterThan(Integer value) {
            addCriterion("compliment_cute >", value, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_cute >=", value, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteLessThan(Integer value) {
            addCriterion("compliment_cute <", value, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_cute <=", value, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteIn(List<Integer> values) {
            addCriterion("compliment_cute in", values, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteNotIn(List<Integer> values) {
            addCriterion("compliment_cute not in", values, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteBetween(Integer value1, Integer value2) {
            addCriterion("compliment_cute between", value1, value2, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentCuteNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_cute not between", value1, value2, "complimentCute");
            return (Criteria) this;
        }

        public Criteria andComplimentListIsNull() {
            addCriterion("compliment_list is null");
            return (Criteria) this;
        }

        public Criteria andComplimentListIsNotNull() {
            addCriterion("compliment_list is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentListEqualTo(Integer value) {
            addCriterion("compliment_list =", value, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListNotEqualTo(Integer value) {
            addCriterion("compliment_list <>", value, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListGreaterThan(Integer value) {
            addCriterion("compliment_list >", value, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_list >=", value, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListLessThan(Integer value) {
            addCriterion("compliment_list <", value, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_list <=", value, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListIn(List<Integer> values) {
            addCriterion("compliment_list in", values, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListNotIn(List<Integer> values) {
            addCriterion("compliment_list not in", values, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListBetween(Integer value1, Integer value2) {
            addCriterion("compliment_list between", value1, value2, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentListNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_list not between", value1, value2, "complimentList");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteIsNull() {
            addCriterion("compliment_note is null");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteIsNotNull() {
            addCriterion("compliment_note is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteEqualTo(Integer value) {
            addCriterion("compliment_note =", value, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteNotEqualTo(Integer value) {
            addCriterion("compliment_note <>", value, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteGreaterThan(Integer value) {
            addCriterion("compliment_note >", value, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_note >=", value, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteLessThan(Integer value) {
            addCriterion("compliment_note <", value, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_note <=", value, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteIn(List<Integer> values) {
            addCriterion("compliment_note in", values, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteNotIn(List<Integer> values) {
            addCriterion("compliment_note not in", values, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteBetween(Integer value1, Integer value2) {
            addCriterion("compliment_note between", value1, value2, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentNoteNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_note not between", value1, value2, "complimentNote");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainIsNull() {
            addCriterion("compliment_plain is null");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainIsNotNull() {
            addCriterion("compliment_plain is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainEqualTo(Integer value) {
            addCriterion("compliment_plain =", value, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainNotEqualTo(Integer value) {
            addCriterion("compliment_plain <>", value, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainGreaterThan(Integer value) {
            addCriterion("compliment_plain >", value, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_plain >=", value, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainLessThan(Integer value) {
            addCriterion("compliment_plain <", value, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_plain <=", value, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainIn(List<Integer> values) {
            addCriterion("compliment_plain in", values, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainNotIn(List<Integer> values) {
            addCriterion("compliment_plain not in", values, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainBetween(Integer value1, Integer value2) {
            addCriterion("compliment_plain between", value1, value2, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentPlainNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_plain not between", value1, value2, "complimentPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolIsNull() {
            addCriterion("compliment_cool is null");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolIsNotNull() {
            addCriterion("compliment_cool is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolEqualTo(Integer value) {
            addCriterion("compliment_cool =", value, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolNotEqualTo(Integer value) {
            addCriterion("compliment_cool <>", value, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolGreaterThan(Integer value) {
            addCriterion("compliment_cool >", value, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_cool >=", value, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolLessThan(Integer value) {
            addCriterion("compliment_cool <", value, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_cool <=", value, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolIn(List<Integer> values) {
            addCriterion("compliment_cool in", values, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolNotIn(List<Integer> values) {
            addCriterion("compliment_cool not in", values, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolBetween(Integer value1, Integer value2) {
            addCriterion("compliment_cool between", value1, value2, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentCoolNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_cool not between", value1, value2, "complimentCool");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyIsNull() {
            addCriterion("compliment_funny is null");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyIsNotNull() {
            addCriterion("compliment_funny is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyEqualTo(Integer value) {
            addCriterion("compliment_funny =", value, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyNotEqualTo(Integer value) {
            addCriterion("compliment_funny <>", value, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyGreaterThan(Integer value) {
            addCriterion("compliment_funny >", value, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_funny >=", value, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyLessThan(Integer value) {
            addCriterion("compliment_funny <", value, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_funny <=", value, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyIn(List<Integer> values) {
            addCriterion("compliment_funny in", values, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyNotIn(List<Integer> values) {
            addCriterion("compliment_funny not in", values, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyBetween(Integer value1, Integer value2) {
            addCriterion("compliment_funny between", value1, value2, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentFunnyNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_funny not between", value1, value2, "complimentFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterIsNull() {
            addCriterion("compliment_writer is null");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterIsNotNull() {
            addCriterion("compliment_writer is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterEqualTo(Integer value) {
            addCriterion("compliment_writer =", value, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterNotEqualTo(Integer value) {
            addCriterion("compliment_writer <>", value, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterGreaterThan(Integer value) {
            addCriterion("compliment_writer >", value, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_writer >=", value, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterLessThan(Integer value) {
            addCriterion("compliment_writer <", value, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_writer <=", value, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterIn(List<Integer> values) {
            addCriterion("compliment_writer in", values, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterNotIn(List<Integer> values) {
            addCriterion("compliment_writer not in", values, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterBetween(Integer value1, Integer value2) {
            addCriterion("compliment_writer between", value1, value2, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentWriterNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_writer not between", value1, value2, "complimentWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosIsNull() {
            addCriterion("compliment_photos is null");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosIsNotNull() {
            addCriterion("compliment_photos is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosEqualTo(Integer value) {
            addCriterion("compliment_photos =", value, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosNotEqualTo(Integer value) {
            addCriterion("compliment_photos <>", value, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosGreaterThan(Integer value) {
            addCriterion("compliment_photos >", value, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliment_photos >=", value, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosLessThan(Integer value) {
            addCriterion("compliment_photos <", value, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosLessThanOrEqualTo(Integer value) {
            addCriterion("compliment_photos <=", value, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosIn(List<Integer> values) {
            addCriterion("compliment_photos in", values, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosNotIn(List<Integer> values) {
            addCriterion("compliment_photos not in", values, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosBetween(Integer value1, Integer value2) {
            addCriterion("compliment_photos between", value1, value2, "complimentPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentPhotosNotBetween(Integer value1, Integer value2) {
            addCriterion("compliment_photos not between", value1, value2, "complimentPhotos");
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