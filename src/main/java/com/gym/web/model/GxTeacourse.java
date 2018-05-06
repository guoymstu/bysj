package com.gym.web.model;

import java.io.Serializable;

/**
 * gx_teacourse
 * @author 
 */
public class GxTeacourse implements Serializable {
    /**
     * 教师ID
     */
    private String teaid;

    /**
     * 课程id
     */
    private String courseid;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getTeaid() {
        return teaid;
    }

    public void setTeaid(String teaid) {
        this.teaid = teaid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        GxTeacourse other = (GxTeacourse) that;
        return (this.getTeaid() == null ? other.getTeaid() == null : this.getTeaid().equals(other.getTeaid()))
            && (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeaid() == null) ? 0 : getTeaid().hashCode());
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teaid=").append(teaid);
        sb.append(", courseid=").append(courseid);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}