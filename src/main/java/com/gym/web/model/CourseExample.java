package com.gym.web.model;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CourseExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursehoursIsNull() {
            addCriterion("courseHours is null");
            return (Criteria) this;
        }

        public Criteria andCoursehoursIsNotNull() {
            addCriterion("courseHours is not null");
            return (Criteria) this;
        }

        public Criteria andCoursehoursEqualTo(String value) {
            addCriterion("courseHours =", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursNotEqualTo(String value) {
            addCriterion("courseHours <>", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursGreaterThan(String value) {
            addCriterion("courseHours >", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursGreaterThanOrEqualTo(String value) {
            addCriterion("courseHours >=", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursLessThan(String value) {
            addCriterion("courseHours <", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursLessThanOrEqualTo(String value) {
            addCriterion("courseHours <=", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursLike(String value) {
            addCriterion("courseHours like", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursNotLike(String value) {
            addCriterion("courseHours not like", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursIn(List<String> values) {
            addCriterion("courseHours in", values, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursNotIn(List<String> values) {
            addCriterion("courseHours not in", values, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursBetween(String value1, String value2) {
            addCriterion("courseHours between", value1, value2, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursNotBetween(String value1, String value2) {
            addCriterion("courseHours not between", value1, value2, "coursehours");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCoursescoreIsNull() {
            addCriterion("courseScore is null");
            return (Criteria) this;
        }

        public Criteria andCoursescoreIsNotNull() {
            addCriterion("courseScore is not null");
            return (Criteria) this;
        }

        public Criteria andCoursescoreEqualTo(Integer value) {
            addCriterion("courseScore =", value, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreNotEqualTo(Integer value) {
            addCriterion("courseScore <>", value, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreGreaterThan(Integer value) {
            addCriterion("courseScore >", value, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseScore >=", value, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreLessThan(Integer value) {
            addCriterion("courseScore <", value, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreLessThanOrEqualTo(Integer value) {
            addCriterion("courseScore <=", value, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreIn(List<Integer> values) {
            addCriterion("courseScore in", values, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreNotIn(List<Integer> values) {
            addCriterion("courseScore not in", values, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreBetween(Integer value1, Integer value2) {
            addCriterion("courseScore between", value1, value2, "coursescore");
            return (Criteria) this;
        }

        public Criteria andCoursescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("courseScore not between", value1, value2, "coursescore");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("courseType is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("courseType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("courseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("courseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("courseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("courseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("courseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("courseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("courseType like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("courseType not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("courseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("courseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("courseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("courseType not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTimeplanIsNull() {
            addCriterion("timeplan is null");
            return (Criteria) this;
        }

        public Criteria andTimeplanIsNotNull() {
            addCriterion("timeplan is not null");
            return (Criteria) this;
        }

        public Criteria andTimeplanEqualTo(String value) {
            addCriterion("timeplan =", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanNotEqualTo(String value) {
            addCriterion("timeplan <>", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanGreaterThan(String value) {
            addCriterion("timeplan >", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanGreaterThanOrEqualTo(String value) {
            addCriterion("timeplan >=", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanLessThan(String value) {
            addCriterion("timeplan <", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanLessThanOrEqualTo(String value) {
            addCriterion("timeplan <=", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanLike(String value) {
            addCriterion("timeplan like", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanNotLike(String value) {
            addCriterion("timeplan not like", value, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanIn(List<String> values) {
            addCriterion("timeplan in", values, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanNotIn(List<String> values) {
            addCriterion("timeplan not in", values, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanBetween(String value1, String value2) {
            addCriterion("timeplan between", value1, value2, "timeplan");
            return (Criteria) this;
        }

        public Criteria andTimeplanNotBetween(String value1, String value2) {
            addCriterion("timeplan not between", value1, value2, "timeplan");
            return (Criteria) this;
        }

        public Criteria andCommontypeIsNull() {
            addCriterion("commonType is null");
            return (Criteria) this;
        }

        public Criteria andCommontypeIsNotNull() {
            addCriterion("commonType is not null");
            return (Criteria) this;
        }

        public Criteria andCommontypeEqualTo(String value) {
            addCriterion("commonType =", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeNotEqualTo(String value) {
            addCriterion("commonType <>", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeGreaterThan(String value) {
            addCriterion("commonType >", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeGreaterThanOrEqualTo(String value) {
            addCriterion("commonType >=", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeLessThan(String value) {
            addCriterion("commonType <", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeLessThanOrEqualTo(String value) {
            addCriterion("commonType <=", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeLike(String value) {
            addCriterion("commonType like", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeNotLike(String value) {
            addCriterion("commonType not like", value, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeIn(List<String> values) {
            addCriterion("commonType in", values, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeNotIn(List<String> values) {
            addCriterion("commonType not in", values, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeBetween(String value1, String value2) {
            addCriterion("commonType between", value1, value2, "commontype");
            return (Criteria) this;
        }

        public Criteria andCommontypeNotBetween(String value1, String value2) {
            addCriterion("commonType not between", value1, value2, "commontype");
            return (Criteria) this;
        }

        public Criteria andCountstuIsNull() {
            addCriterion("countStu is null");
            return (Criteria) this;
        }

        public Criteria andCountstuIsNotNull() {
            addCriterion("countStu is not null");
            return (Criteria) this;
        }

        public Criteria andCountstuEqualTo(String value) {
            addCriterion("countStu =", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuNotEqualTo(String value) {
            addCriterion("countStu <>", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuGreaterThan(String value) {
            addCriterion("countStu >", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuGreaterThanOrEqualTo(String value) {
            addCriterion("countStu >=", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuLessThan(String value) {
            addCriterion("countStu <", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuLessThanOrEqualTo(String value) {
            addCriterion("countStu <=", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuLike(String value) {
            addCriterion("countStu like", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuNotLike(String value) {
            addCriterion("countStu not like", value, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuIn(List<String> values) {
            addCriterion("countStu in", values, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuNotIn(List<String> values) {
            addCriterion("countStu not in", values, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuBetween(String value1, String value2) {
            addCriterion("countStu between", value1, value2, "countstu");
            return (Criteria) this;
        }

        public Criteria andCountstuNotBetween(String value1, String value2) {
            addCriterion("countStu not between", value1, value2, "countstu");
            return (Criteria) this;
        }
    }

    /**
     */
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