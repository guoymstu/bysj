package com.gym.web.model;

import java.io.Serializable;

/**
 * Tb_pjRecord
 * @author 
 */
public class Pjrecord implements Serializable {
    private String id;

    /**
     * 学号
     */
    private String stunum;

    /**
     * 课程ID
     */
    private String courseid;

    /**
     * 系统评教ID
     */
    private String contextid;

    /**
     * 打分
     */
    private String marking;

    private String reamrk;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getContextid() {
        return contextid;
    }

    public void setContextid(String contextid) {
        this.contextid = contextid;
    }

    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    public String getReamrk() {
        return reamrk;
    }

    public void setReamrk(String reamrk) {
        this.reamrk = reamrk;
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
        Pjrecord other = (Pjrecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStunum() == null ? other.getStunum() == null : this.getStunum().equals(other.getStunum()))
            && (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getContextid() == null ? other.getContextid() == null : this.getContextid().equals(other.getContextid()))
            && (this.getMarking() == null ? other.getMarking() == null : this.getMarking().equals(other.getMarking()))
            && (this.getReamrk() == null ? other.getReamrk() == null : this.getReamrk().equals(other.getReamrk()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStunum() == null) ? 0 : getStunum().hashCode());
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getContextid() == null) ? 0 : getContextid().hashCode());
        result = prime * result + ((getMarking() == null) ? 0 : getMarking().hashCode());
        result = prime * result + ((getReamrk() == null) ? 0 : getReamrk().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stunum=").append(stunum);
        sb.append(", courseid=").append(courseid);
        sb.append(", contextid=").append(contextid);
        sb.append(", marking=").append(marking);
        sb.append(", reamrk=").append(reamrk);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}