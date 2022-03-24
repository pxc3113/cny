package com.example.app8.dto;

public class PurchaseDto {
    private Long statusId;
    private String purchaseDateFrom;
    private String purchaseDateTo;
    private String provider;

    public PurchaseDto() {
    }

    public PurchaseDto(Long statusId, String purchaseDateFrom, String purchaseDateTo, String provider) {
        this.statusId = statusId;
        this.purchaseDateFrom = purchaseDateFrom;
        this.purchaseDateTo = purchaseDateTo;
        this.provider = provider;
    }

    public Long getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getPurchaseDateFrom() {
        return this.purchaseDateFrom;
    }

    public void setPurchaseDateFrom(String purchaseDateFrom) {
        this.purchaseDateFrom = purchaseDateFrom;
    }

    public String getPurchaseDateTo() {
        return this.purchaseDateTo;
    }

    public void setPurchaseDateTo(String purchaseDateTo) {
        this.purchaseDateTo = purchaseDateTo;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public PurchaseDto statusId(Long statusId) {
        setStatusId(statusId);
        return this;
    }

    public PurchaseDto purchaseDateFrom(String purchaseDateFrom) {
        setPurchaseDateFrom(purchaseDateFrom);
        return this;
    }

    public PurchaseDto purchaseDateTo(String purchaseDateTo) {
        setPurchaseDateTo(purchaseDateTo);
        return this;
    }

    public PurchaseDto provider(String provider) {
        setProvider(provider);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " statusId='" + getStatusId() + "'" +
            ", purchaseDateFrom='" + getPurchaseDateFrom() + "'" +
            ", purchaseDateTo='" + getPurchaseDateTo() + "'" +
            ", provider='" + getProvider() + "'" +
            "}";
    }
}