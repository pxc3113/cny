package com.example.app7.dto;

public class ChargeDto {
    private Long cid;
    private Long eid;
    private double delta;
    private int unit;
    private double cost;

    public ChargeDto() {
    }

    public ChargeDto(Long cid, Long eid, double delta, int unit, double cost) {
        this.cid = cid;
        this.eid = eid;
        this.delta = delta;
        this.unit = unit;
        this.cost = cost;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getEid() {
        return this.eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public double getDelta() {
        return this.delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public ChargeDto cid(Long cid) {
        setCid(cid);
        return this;
    }

    public ChargeDto eid(Long eid) {
        setEid(eid);
        return this;
    }

    public ChargeDto delta(double delta) {
        setDelta(delta);
        return this;
    }

    public ChargeDto unit(int unit) {
        setUnit(unit);
        return this;
    }

    public ChargeDto cost(double cost) {
        setCost(cost);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " cid='" + getCid() + "'" +
            ", eid='" + getEid() + "'" +
            ", delta='" + getDelta() + "'" +
            ", unit='" + getUnit() + "'" +
            ", cost='" + getCost() + "'" +
            "}";
    }
}