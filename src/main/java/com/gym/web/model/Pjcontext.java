package com.gym.web.model;

import java.io.Serializable;

/**
 * tb_pjContext
 * @author 
 */
public class Pjcontext implements Serializable {
    private String id;

    private String coursetype;

    private String pjtype;

    /**
     * 最高分
     */
    private String maxscore;

    private String block;

    private  String contentstr;

    /**
     * 排序
     */
    private String sort;


    public String getContentstr() {
        return contentstr;
    }

    public void setContentstr(String contentstr) {
        this.contentstr = contentstr;
    }


    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Pjcontext() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    public String getPjtype() {
        return pjtype;
    }

    public void setPjtype(String pjtype) {
        this.pjtype = pjtype;
    }

    public String getMaxscore() {
        return maxscore;
    }

    public void setMaxscore(String maxscore) {
        this.maxscore = maxscore;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
        Pjcontext other = (Pjcontext) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCoursetype() == null ? other.getCoursetype() == null : this.getCoursetype().equals(other.getCoursetype()))
            && (this.getPjtype() == null ? other.getPjtype() == null : this.getPjtype().equals(other.getPjtype()))
            && (this.getMaxscore() == null ? other.getMaxscore() == null : this.getMaxscore().equals(other.getMaxscore()))
            && (this.getBlock() == null ? other.getBlock() == null : this.getBlock().equals(other.getBlock()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCoursetype() == null) ? 0 : getCoursetype().hashCode());
        result = prime * result + ((getPjtype() == null) ? 0 : getPjtype().hashCode());
        result = prime * result + ((getMaxscore() == null) ? 0 : getMaxscore().hashCode());
        result = prime * result + ((getBlock() == null) ? 0 : getBlock().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coursetype=").append(coursetype);
        sb.append(", pjtype=").append(pjtype);
        sb.append(", maxvalue=").append(maxscore);
        sb.append(", block=").append(block);
        sb.append(", sort=").append(sort);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}