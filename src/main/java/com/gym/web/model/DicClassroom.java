package com.gym.web.model;

import java.io.Serializable;

/**
 * dic_classroom
 * @author 
 */
public class DicClassroom implements Serializable {
    private String id;

    /**
     * 地点
     */
    private String address;

    /**
     * 楼号
     */
    private String floorpie;

    /**
     * 座位总数
     */
    private String seatcount;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFloorpie() {
        return floorpie;
    }

    public void setFloorpie(String floorpie) {
        this.floorpie = floorpie;
    }

    public String getSeatcount() {
        return seatcount;
    }

    public void setSeatcount(String seatcount) {
        this.seatcount = seatcount;
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
        DicClassroom other = (DicClassroom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getFloorpie() == null ? other.getFloorpie() == null : this.getFloorpie().equals(other.getFloorpie()))
            && (this.getSeatcount() == null ? other.getSeatcount() == null : this.getSeatcount().equals(other.getSeatcount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getFloorpie() == null) ? 0 : getFloorpie().hashCode());
        result = prime * result + ((getSeatcount() == null) ? 0 : getSeatcount().hashCode());
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
        sb.append(", address=").append(address);
        sb.append(", floorpie=").append(floorpie);
        sb.append(", seatcount=").append(seatcount);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}