package com.dachen.health.pack.pack.entity.po;

import java.util.ArrayList;
import java.util.List;

public class PackDoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    public PackDoctorExample() {
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

    /**
     * @author 李淼淼
     * @version 1.0 2016-03-03
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNull() {
            addCriterion("pack_id is null");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNotNull() {
            addCriterion("pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackIdEqualTo(Integer value) {
            addCriterion("pack_id =", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotEqualTo(Integer value) {
            addCriterion("pack_id <>", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThan(Integer value) {
            addCriterion("pack_id >", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pack_id >=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThan(Integer value) {
            addCriterion("pack_id <", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThanOrEqualTo(Integer value) {
            addCriterion("pack_id <=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdIn(List<Integer> values) {
            addCriterion("pack_id in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotIn(List<Integer> values) {
            addCriterion("pack_id not in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdBetween(Integer value1, Integer value2) {
            addCriterion("pack_id between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pack_id not between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andSplitRatioIsNull() {
            addCriterion("split_ratio is null");
            return (Criteria) this;
        }

        public Criteria andSplitRatioIsNotNull() {
            addCriterion("split_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andSplitRatioEqualTo(Float value) {
            addCriterion("split_ratio =", value, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioNotEqualTo(Float value) {
            addCriterion("split_ratio <>", value, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioGreaterThan(Float value) {
            addCriterion("split_ratio >", value, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("split_ratio >=", value, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioLessThan(Float value) {
            addCriterion("split_ratio <", value, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioLessThanOrEqualTo(Float value) {
            addCriterion("split_ratio <=", value, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioIn(List<Float> values) {
            addCriterion("split_ratio in", values, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioNotIn(List<Float> values) {
            addCriterion("split_ratio not in", values, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioBetween(Float value1, Float value2) {
            addCriterion("split_ratio between", value1, value2, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andSplitRatioNotBetween(Float value1, Float value2) {
            addCriterion("split_ratio not between", value1, value2, "splitRatio");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindIsNull() {
            addCriterion("receive_remind is null");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindIsNotNull() {
            addCriterion("receive_remind is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindEqualTo(Byte value) {
            addCriterion("receive_remind =", value, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindNotEqualTo(Byte value) {
            addCriterion("receive_remind <>", value, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindGreaterThan(Byte value) {
            addCriterion("receive_remind >", value, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindGreaterThanOrEqualTo(Byte value) {
            addCriterion("receive_remind >=", value, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindLessThan(Byte value) {
            addCriterion("receive_remind <", value, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindLessThanOrEqualTo(Byte value) {
            addCriterion("receive_remind <=", value, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindIn(List<Byte> values) {
            addCriterion("receive_remind in", values, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindNotIn(List<Byte> values) {
            addCriterion("receive_remind not in", values, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindBetween(Byte value1, Byte value2) {
            addCriterion("receive_remind between", value1, value2, "receiveRemind");
            return (Criteria) this;
        }

        public Criteria andReceiveRemindNotBetween(Byte value1, Byte value2) {
            addCriterion("receive_remind not between", value1, value2, "receiveRemind");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * @author 李淼淼
     * @version 1.0 2016-03-03
     */
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