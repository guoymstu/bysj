package com.gym.web.model;

import java.util.ArrayList;
import java.util.List;

public class PjrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PjrecordExample() {
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

        public Criteria andStunumIsNull() {
            addCriterion("stuNum is null");
            return (Criteria) this;
        }

        public Criteria andStunumIsNotNull() {
            addCriterion("stuNum is not null");
            return (Criteria) this;
        }

        public Criteria andStunumEqualTo(String value) {
            addCriterion("stuNum =", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotEqualTo(String value) {
            addCriterion("stuNum <>", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThan(String value) {
            addCriterion("stuNum >", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThanOrEqualTo(String value) {
            addCriterion("stuNum >=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThan(String value) {
            addCriterion("stuNum <", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThanOrEqualTo(String value) {
            addCriterion("stuNum <=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLike(String value) {
            addCriterion("stuNum like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotLike(String value) {
            addCriterion("stuNum not like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumIn(List<String> values) {
            addCriterion("stuNum in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotIn(List<String> values) {
            addCriterion("stuNum not in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumBetween(String value1, String value2) {
            addCriterion("stuNum between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotBetween(String value1, String value2) {
            addCriterion("stuNum not between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("courseId like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("courseId not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andContextidIsNull() {
            addCriterion("contextId is null");
            return (Criteria) this;
        }

        public Criteria andContextidIsNotNull() {
            addCriterion("contextId is not null");
            return (Criteria) this;
        }

        public Criteria andContextidEqualTo(String value) {
            addCriterion("contextId =", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidNotEqualTo(String value) {
            addCriterion("contextId <>", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidGreaterThan(String value) {
            addCriterion("contextId >", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidGreaterThanOrEqualTo(String value) {
            addCriterion("contextId >=", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidLessThan(String value) {
            addCriterion("contextId <", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidLessThanOrEqualTo(String value) {
            addCriterion("contextId <=", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidLike(String value) {
            addCriterion("contextId like", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidNotLike(String value) {
            addCriterion("contextId not like", value, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidIn(List<String> values) {
            addCriterion("contextId in", values, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidNotIn(List<String> values) {
            addCriterion("contextId not in", values, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidBetween(String value1, String value2) {
            addCriterion("contextId between", value1, value2, "contextid");
            return (Criteria) this;
        }

        public Criteria andContextidNotBetween(String value1, String value2) {
            addCriterion("contextId not between", value1, value2, "contextid");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNull() {
            addCriterion("marking is null");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNotNull() {
            addCriterion("marking is not null");
            return (Criteria) this;
        }

        public Criteria andMarkingEqualTo(String value) {
            addCriterion("marking =", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotEqualTo(String value) {
            addCriterion("marking <>", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThan(String value) {
            addCriterion("marking >", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThanOrEqualTo(String value) {
            addCriterion("marking >=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThan(String value) {
            addCriterion("marking <", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThanOrEqualTo(String value) {
            addCriterion("marking <=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLike(String value) {
            addCriterion("marking like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotLike(String value) {
            addCriterion("marking not like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingIn(List<String> values) {
            addCriterion("marking in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotIn(List<String> values) {
            addCriterion("marking not in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingBetween(String value1, String value2) {
            addCriterion("marking between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotBetween(String value1, String value2) {
            addCriterion("marking not between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andReamrkIsNull() {
            addCriterion("reamrk is null");
            return (Criteria) this;
        }

        public Criteria andReamrkIsNotNull() {
            addCriterion("reamrk is not null");
            return (Criteria) this;
        }

        public Criteria andReamrkEqualTo(String value) {
            addCriterion("reamrk =", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkNotEqualTo(String value) {
            addCriterion("reamrk <>", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkGreaterThan(String value) {
            addCriterion("reamrk >", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkGreaterThanOrEqualTo(String value) {
            addCriterion("reamrk >=", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkLessThan(String value) {
            addCriterion("reamrk <", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkLessThanOrEqualTo(String value) {
            addCriterion("reamrk <=", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkLike(String value) {
            addCriterion("reamrk like", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkNotLike(String value) {
            addCriterion("reamrk not like", value, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkIn(List<String> values) {
            addCriterion("reamrk in", values, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkNotIn(List<String> values) {
            addCriterion("reamrk not in", values, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkBetween(String value1, String value2) {
            addCriterion("reamrk between", value1, value2, "reamrk");
            return (Criteria) this;
        }

        public Criteria andReamrkNotBetween(String value1, String value2) {
            addCriterion("reamrk not between", value1, value2, "reamrk");
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