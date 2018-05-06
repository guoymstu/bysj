package com.gym.web.model;

import java.util.ArrayList;
import java.util.List;

public class PjcontextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PjcontextExample() {
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

        public Criteria andPjtypeIsNull() {
            addCriterion("pjType is null");
            return (Criteria) this;
        }

        public Criteria andPjtypeIsNotNull() {
            addCriterion("pjType is not null");
            return (Criteria) this;
        }

        public Criteria andPjtypeEqualTo(String value) {
            addCriterion("pjType =", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeNotEqualTo(String value) {
            addCriterion("pjType <>", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeGreaterThan(String value) {
            addCriterion("pjType >", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeGreaterThanOrEqualTo(String value) {
            addCriterion("pjType >=", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeLessThan(String value) {
            addCriterion("pjType <", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeLessThanOrEqualTo(String value) {
            addCriterion("pjType <=", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeLike(String value) {
            addCriterion("pjType like", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeNotLike(String value) {
            addCriterion("pjType not like", value, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeIn(List<String> values) {
            addCriterion("pjType in", values, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeNotIn(List<String> values) {
            addCriterion("pjType not in", values, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeBetween(String value1, String value2) {
            addCriterion("pjType between", value1, value2, "pjtype");
            return (Criteria) this;
        }

        public Criteria andPjtypeNotBetween(String value1, String value2) {
            addCriterion("pjType not between", value1, value2, "pjtype");
            return (Criteria) this;
        }

        public Criteria andMaxscoreIsNull() {
            addCriterion("maxscore is null");
            return (Criteria) this;
        }

        public Criteria andMaxscoreIsNotNull() {
            addCriterion("maxscore is not null");
            return (Criteria) this;
        }

        public Criteria andMaxscoreEqualTo(String value) {
            addCriterion("maxscore =", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreNotEqualTo(String value) {
            addCriterion("maxscore <>", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreGreaterThan(String value) {
            addCriterion("maxscore >", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreGreaterThanOrEqualTo(String value) {
            addCriterion("maxscore >=", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreLessThan(String value) {
            addCriterion("maxscore <", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreLessThanOrEqualTo(String value) {
            addCriterion("maxscore <=", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreLike(String value) {
            addCriterion("maxscore like", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreNotLike(String value) {
            addCriterion("maxscore not like", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreIn(List<String> values) {
            addCriterion("maxscore in", values, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreNotIn(List<String> values) {
            addCriterion("maxscore not in", values, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreBetween(String value1, String value2) {
            addCriterion("maxscore between", value1, value2, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreNotBetween(String value1, String value2) {
            addCriterion("maxscore not between", value1, value2, "maxscore");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("block is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("block is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(String value) {
            addCriterion("block =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(String value) {
            addCriterion("block <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(String value) {
            addCriterion("block >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(String value) {
            addCriterion("block >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(String value) {
            addCriterion("block <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(String value) {
            addCriterion("block <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLike(String value) {
            addCriterion("block like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotLike(String value) {
            addCriterion("block not like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<String> values) {
            addCriterion("block in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<String> values) {
            addCriterion("block not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(String value1, String value2) {
            addCriterion("block between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(String value1, String value2) {
            addCriterion("block not between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
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