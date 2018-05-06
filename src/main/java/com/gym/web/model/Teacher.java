package com.gym.web.model;

import java.io.Serializable;

/**
 * tb_teacher
 * @author 
 */
public class Teacher implements Serializable {
    /**
     * 教师工号
     */
    private String id;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 教师职称
     */
    private String tealevel;

    /**
     * 院系
     */
    private String yuanxi;

    /**
     * 教师电话
     */
    private String telnum;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String mail;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTealevel() {
        return tealevel;
    }

    public void setTealevel(String tealevel) {
        this.tealevel = tealevel;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
        Teacher other = (Teacher) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTealevel() == null ? other.getTealevel() == null : this.getTealevel().equals(other.getTealevel()))
            && (this.getYuanxi() == null ? other.getYuanxi() == null : this.getYuanxi().equals(other.getYuanxi()))
            && (this.getTelnum() == null ? other.getTelnum() == null : this.getTelnum().equals(other.getTelnum()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTealevel() == null) ? 0 : getTealevel().hashCode());
        result = prime * result + ((getYuanxi() == null) ? 0 : getYuanxi().hashCode());
        result = prime * result + ((getTelnum() == null) ? 0 : getTelnum().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", tealevel=").append(tealevel);
        sb.append(", yuanxi=").append(yuanxi);
        sb.append(", telnum=").append(telnum);
        sb.append(", sex=").append(sex);
        sb.append(", address=").append(address);
        sb.append(", mail=").append(mail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}