package com.gym.web.model;

import java.io.Serializable;

/**
 * tb_user
 * @author 
 */
public class User implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * student,teacher的ID
     */
    private String uid;

    /**
     * 1，管理员；2，教师；3，学生
     */
    private String role;

    /**
     * 用户账号；
     */
    private String username;

    /**
     * 密码
     */
    private String userpwd;

    /**
     * 用户锁定 1，锁定 0解锁
     */
    private String block;

    /**
     * 是否有管理员权限
     */
    private String isadmin;

    /**
     * 是否是学生用户 
     */
    private String isstudent;

    /**
     * 是否有教师权限
     */
    private String isteacher;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public String getIsstudent() {
        return isstudent;
    }

    public void setIsstudent(String isstudent) {
        this.isstudent = isstudent;
    }

    public String getIsteacher() {
        return isteacher;
    }

    public void setIsteacher(String isteacher) {
        this.isteacher = isteacher;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserpwd() == null ? other.getUserpwd() == null : this.getUserpwd().equals(other.getUserpwd()))
            && (this.getBlock() == null ? other.getBlock() == null : this.getBlock().equals(other.getBlock()))
            && (this.getIsadmin() == null ? other.getIsadmin() == null : this.getIsadmin().equals(other.getIsadmin()))
            && (this.getIsstudent() == null ? other.getIsstudent() == null : this.getIsstudent().equals(other.getIsstudent()))
            && (this.getIsteacher() == null ? other.getIsteacher() == null : this.getIsteacher().equals(other.getIsteacher()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserpwd() == null) ? 0 : getUserpwd().hashCode());
        result = prime * result + ((getBlock() == null) ? 0 : getBlock().hashCode());
        result = prime * result + ((getIsadmin() == null) ? 0 : getIsadmin().hashCode());
        result = prime * result + ((getIsstudent() == null) ? 0 : getIsstudent().hashCode());
        result = prime * result + ((getIsteacher() == null) ? 0 : getIsteacher().hashCode());
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
        sb.append(", uid=").append(uid);
        sb.append(", role=").append(role);
        sb.append(", username=").append(username);
        sb.append(", userpwd=").append(userpwd);
        sb.append(", block=").append(block);
        sb.append(", isadmin=").append(isadmin);
        sb.append(", isstudent=").append(isstudent);
        sb.append(", isteacher=").append(isteacher);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}