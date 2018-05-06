package com.gym.web.model;

import java.util.ArrayList;
import java.util.List;

public class DicScopeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DicScopeExample() {
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

        public Criteria andYuanxiIsNull() {
            addCriterion("yuanxi is null");
            return (Criteria) this;
        }

        public Criteria andYuanxiIsNotNull() {
            addCriterion("yuanxi is not null");
            return (Criteria) this;
        }

        public Criteria andYuanxiEqualTo(String value) {
            addCriterion("yuanxi =", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiNotEqualTo(String value) {
            addCriterion("yuanxi <>", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiGreaterThan(String value) {
            addCriterion("yuanxi >", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiGreaterThanOrEqualTo(String value) {
            addCriterion("yuanxi >=", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiLessThan(String value) {
            addCriterion("yuanxi <", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiLessThanOrEqualTo(String value) {
            addCriterion("yuanxi <=", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiLike(String value) {
            addCriterion("yuanxi like", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiNotLike(String value) {
            addCriterion("yuanxi not like", value, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiIn(List<String> values) {
            addCriterion("yuanxi in", values, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiNotIn(List<String> values) {
            addCriterion("yuanxi not in", values, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiBetween(String value1, String value2) {
            addCriterion("yuanxi between", value1, value2, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andYuanxiNotBetween(String value1, String value2) {
            addCriterion("yuanxi not between", value1, value2, "yuanxi");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("zhuanye is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("zhuanye is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("zhuanye =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("zhuanye <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("zhuanye >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("zhuanye >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("zhuanye <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("zhuanye <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("zhuanye like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("zhuanye not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("zhuanye in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("zhuanye not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("zhuanye between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("zhuanye not between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andNianjiIsNull() {
            addCriterion("nianji is null");
            return (Criteria) this;
        }

        public Criteria andNianjiIsNotNull() {
            addCriterion("nianji is not null");
            return (Criteria) this;
        }

        public Criteria andNianjiEqualTo(String value) {
            addCriterion("nianji =", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiNotEqualTo(String value) {
            addCriterion("nianji <>", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiGreaterThan(String value) {
            addCriterion("nianji >", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiGreaterThanOrEqualTo(String value) {
            addCriterion("nianji >=", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiLessThan(String value) {
            addCriterion("nianji <", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiLessThanOrEqualTo(String value) {
            addCriterion("nianji <=", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiLike(String value) {
            addCriterion("nianji like", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiNotLike(String value) {
            addCriterion("nianji not like", value, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiIn(List<String> values) {
            addCriterion("nianji in", values, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiNotIn(List<String> values) {
            addCriterion("nianji not in", values, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiBetween(String value1, String value2) {
            addCriterion("nianji between", value1, value2, "nianji");
            return (Criteria) this;
        }

        public Criteria andNianjiNotBetween(String value1, String value2) {
            addCriterion("nianji not between", value1, value2, "nianji");
            return (Criteria) this;
        }

        public Criteria andBanjiIsNull() {
            addCriterion("banji is null");
            return (Criteria) this;
        }

        public Criteria andBanjiIsNotNull() {
            addCriterion("banji is not null");
            return (Criteria) this;
        }

        public Criteria andBanjiEqualTo(String value) {
            addCriterion("banji =", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotEqualTo(String value) {
            addCriterion("banji <>", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThan(String value) {
            addCriterion("banji >", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThanOrEqualTo(String value) {
            addCriterion("banji >=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThan(String value) {
            addCriterion("banji <", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThanOrEqualTo(String value) {
            addCriterion("banji <=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLike(String value) {
            addCriterion("banji like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotLike(String value) {
            addCriterion("banji not like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiIn(List<String> values) {
            addCriterion("banji in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotIn(List<String> values) {
            addCriterion("banji not in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiBetween(String value1, String value2) {
            addCriterion("banji between", value1, value2, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotBetween(String value1, String value2) {
            addCriterion("banji not between", value1, value2, "banji");
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