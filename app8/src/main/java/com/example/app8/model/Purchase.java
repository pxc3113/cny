package com.example.app8.model;

import java.util.Date;

public class Purchase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.id
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.grade_case
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private String gradeCase;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.order_date
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private String orderDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.order_id
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.provider
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private String provider;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.purchase_amount
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private Double purchaseAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.purchase_date
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private String purchaseDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.status_id
     *
     * @mbggenerated Wed Feb 02 14:15:26 CST 2022
     */
    private Status status;

    public Purchase() {
    }

    public Purchase(Long id, String gradeCase, String orderDate, Long orderId, String provider, Double purchaseAmount, String purchaseDate, Status status) {
        this.id = id;
        this.gradeCase = gradeCase;
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.provider = provider;
        this.purchaseAmount = purchaseAmount;
        this.purchaseDate = purchaseDate;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGradeCase() {
        return this.gradeCase;
    }

    public void setGradeCase(String gradeCase) {
        this.gradeCase = gradeCase;
    }

    public String getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Double getPurchaseAmount() {
        return this.purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Purchase id(Long id) {
        setId(id);
        return this;
    }

    public Purchase gradeCase(String gradeCase) {
        setGradeCase(gradeCase);
        return this;
    }

    public Purchase orderDate(String orderDate) {
        setOrderDate(orderDate);
        return this;
    }

    public Purchase orderId(Long orderId) {
        setOrderId(orderId);
        return this;
    }

    public Purchase provider(String provider) {
        setProvider(provider);
        return this;
    }

    public Purchase purchaseAmount(Double purchaseAmount) {
        setPurchaseAmount(purchaseAmount);
        return this;
    }

    public Purchase purchaseDate(String purchaseDate) {
        setPurchaseDate(purchaseDate);
        return this;
    }

    public Purchase status(Status status) {
        setStatus(status);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", gradeCase='" + getGradeCase() + "'" +
            ", orderDate='" + getOrderDate() + "'" +
            ", orderId='" + getOrderId() + "'" +
            ", provider='" + getProvider() + "'" +
            ", purchaseAmount='" + getPurchaseAmount() + "'" +
            ", purchaseDate='" + getPurchaseDate() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}