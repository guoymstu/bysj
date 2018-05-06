package com.gym.web.model;

import java.io.Serializable;

/**
 * dic_scope
 * @author 
 */
public class DicScope implements Serializable {
    /**
     * 学生班级id
     */
    private String id;

    /**
     * 院系
     */
    private String yuanxi;

    /**
     * 专业
     */
    private String zhuanye;

    /**
     * 年级
     */
    private String nianji;

    /**
     * 班级
     */
    private String banji;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getNianji() {
        return nianji;
    }

    public void setNianji(String nianji) {
        this.nianji = nianji;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
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
        DicScope other = (DicScope) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYuanxi() == null ? other.getYuanxi() == null : this.getYuanxi().equals(other.getYuanxi()))
            && (this.getZhuanye() == null ? other.getZhuanye() == null : this.getZhuanye().equals(other.getZhuanye()))
            && (this.getNianji() == null ? other.getNianji() == null : this.getNianji().equals(other.getNianji()))
            && (this.getBanji() == null ? other.getBanji() == null : this.getBanji().equals(other.getBanji()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYuanxi() == null) ? 0 : getYuanxi().hashCode());
        result = prime * result + ((getZhuanye() == null) ? 0 : getZhuanye().hashCode());
        result = prime * result + ((getNianji() == null) ? 0 : getNianji().hashCode());
        result = prime * result + ((getBanji() == null) ? 0 : getBanji().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", yuanxi=").append(yuanxi);
        sb.append(", zhuanye=").append(zhuanye);
        sb.append(", nianji=").append(nianji);
        sb.append(", banji=").append(banji);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}