package com.example.app7.dto;

public class VIIClassDto {
    private Long id;
    private String name;
    private double electricityFrom;
    private double electricityTo;
    private int toUnit;
    private int fromUnit;

    public VIIClassDto() {
    }

    public VIIClassDto(Long id, String name, double electricityFrom, double electricityTo, int toUnit, int fromUnit) {
        this.id = id;
        this.name = name;
        this.electricityFrom = electricityFrom;
        this.electricityTo = electricityTo;
        this.toUnit = toUnit;
        this.fromUnit = fromUnit;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getElectricityFrom() {
        return this.electricityFrom;
    }

    public void setElectricityFrom(double electricityFrom) {
        // if (this.fromUnit==0){
            this.electricityFrom = electricityFrom;
        // } else {
        //     this.electricityFrom = electricityFrom * 1000;
        // }
    }

    public double getElectricityTo() {
        return this.electricityTo;
    }

    public void setElectricityTo(double electricityTo) {
        // if (this.toUnit==0){
            this.electricityTo = electricityTo;
        // } else {
        //     this.electricityTo = electricityTo * 1000;
        // }
    }

    public int getToUnit() {
        return this.toUnit;
    }

    public void setToUnit(int toUnit) {
        this.toUnit = toUnit;
    }

    public int getFromUnit() {
        return this.fromUnit;
    }

    public void setFromUnit(int fromUnit) {
        this.fromUnit = fromUnit;
    }

    public VIIClassDto id(Long id) {
        setId(id);
        return this;
    }

    public VIIClassDto name(String name) {
        setName(name);
        return this;
    }

    public VIIClassDto electricityFrom(double electricityFrom) {
        setElectricityFrom(electricityFrom);
        return this;
    }

    public VIIClassDto electricityTo(double electricityTo) {
        setElectricityTo(electricityTo);
        return this;
    }

    public VIIClassDto toUnit(int toUnit) {
        setToUnit(toUnit);
        return this;
    }

    public VIIClassDto fromUnit(int fromUnit) {
        setFromUnit(fromUnit);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", electricityFrom='" + getElectricityFrom() + "'" +
            ", electricityTo='" + getElectricityTo() + "'" +
            ", toUnit='" + getToUnit() + "'" +
            ", fromUnit='" + getFromUnit() + "'" +
            "}";
    }

}