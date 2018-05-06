package com.gym.web.model;

import java.io.Serializable;

/**
 * gx_stucourse
 * @author 
 */
public class GxStucourse implements Serializable {
    private String stuid;

    /**
     * 课程ID
     */
    private String courseid;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
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
        GxStucourse other = (GxStucourse) that;
        return (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
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
        sb.append(", stuid=").append(stuid);
        sb.append(", courseid=").append(courseid);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}