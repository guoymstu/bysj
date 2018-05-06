package com.gym.web.model;

import java.io.Serializable;

/**
 * tb_course
 * @author 
 */
public class Course implements Serializable {
    /**
     * 课程id
     */
    private String id;

    /**
     * 课程名
     */
    private String coursename;

    /**
     * 课时
     */
    private String coursehours;

    /**
     * 上课地址
     */
    private String address;

    /**
     * 学分
     */
    private String coursescore;

    /**
     * 年度
     */
    private String year;

    /**
     * 上下学期  上，下
     */
    private String term;

    /**
     * 课程类型，1艺术实践类，2理论课，3理论+实践
     */
    private String coursetype;

    /**
     * 备注
     */
    private String remark;

    /**
     * 课程时间安排   前4位为开设周，1位单双周，之后每5位表示一个时间安排
     */
    private String timeplan;

    /**
     * 公共选修，公共必修，专业必修，专业选修
     */
    private String commontype;

    /**
     * 上课人数
     */
    private String countstu;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursehours() {
        return coursehours;
    }

    public void setCoursehours(String coursehours) {
        this.coursehours = coursehours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCoursescore() {
        return coursescore;
    }

    public void setCoursescore(String coursescore) {
        this.coursescore = coursescore;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTimeplan() {
        return timeplan;
    }

    public void setTimeplan(String timeplan) {
        this.timeplan = timeplan;
    }

    public String getCommontype() {
        return commontype;
    }

    public void setCommontype(String commontype) {
        this.commontype = commontype;
    }

    public String getCountstu() {
        return countstu;
    }

    public void setCountstu(String countstu) {
        this.countstu = countstu;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCoursename() == null ? other.getCoursename() == null : this.getCoursename().equals(other.getCoursename()))
            && (this.getCoursehours() == null ? other.getCoursehours() == null : this.getCoursehours().equals(other.getCoursehours()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getCoursescore() == null ? other.getCoursescore() == null : this.getCoursescore().equals(other.getCoursescore()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getCoursetype() == null ? other.getCoursetype() == null : this.getCoursetype().equals(other.getCoursetype()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTimeplan() == null ? other.getTimeplan() == null : this.getTimeplan().equals(other.getTimeplan()))
            && (this.getCommontype() == null ? other.getCommontype() == null : this.getCommontype().equals(other.getCommontype()))
            && (this.getCountstu() == null ? other.getCountstu() == null : this.getCountstu().equals(other.getCountstu()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCoursename() == null) ? 0 : getCoursename().hashCode());
        result = prime * result + ((getCoursehours() == null) ? 0 : getCoursehours().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getCoursescore() == null) ? 0 : getCoursescore().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getCoursetype() == null) ? 0 : getCoursetype().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTimeplan() == null) ? 0 : getTimeplan().hashCode());
        result = prime * result + ((getCommontype() == null) ? 0 : getCommontype().hashCode());
        result = prime * result + ((getCountstu() == null) ? 0 : getCountstu().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coursename=").append(coursename);
        sb.append(", coursehours=").append(coursehours);
        sb.append(", address=").append(address);
        sb.append(", coursescore=").append(coursescore);
        sb.append(", year=").append(year);
        sb.append(", term=").append(term);
        sb.append(", coursetype=").append(coursetype);
        sb.append(", remark=").append(remark);
        sb.append(", timeplan=").append(timeplan);
        sb.append(", commontype=").append(commontype);
        sb.append(", countstu=").append(countstu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}