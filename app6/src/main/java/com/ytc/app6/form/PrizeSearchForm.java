package com.ytc.app6.form;

public class PrizeSearchForm {
    String name;
    Long type;
    Long stockFrom;
    Long stockTo;

    public PrizeSearchForm() {
    }

    public PrizeSearchForm(String name, Long type, Long stockFrom, Long stockTo) {
        this.name = name;
        this.type = type;
        this.stockFrom = stockFrom;
        this.stockTo = stockTo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getStockFrom() {
        return this.stockFrom;
    }

    public void setStockFrom(Long stockFrom) {
        this.stockFrom = stockFrom;
    }

    public Long getStockTo() {
        return this.stockTo;
    }

    public void setStockTo(Long stockTo) {
        this.stockTo = stockTo;
    }

    public PrizeSearchForm name(String name) {
        setName(name);
        return this;
    }

    public PrizeSearchForm type(Long type) {
        setType(type);
        return this;
    }

    public PrizeSearchForm stockFrom(Long stockFrom) {
        setStockFrom(stockFrom);
        return this;
    }

    public PrizeSearchForm stockTo(Long stockTo) {
        setStockTo(stockTo);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", stockFrom='" + getStockFrom() + "'" +
            ", stockTo='" + getStockTo() + "'" +
            "}";
    }

}