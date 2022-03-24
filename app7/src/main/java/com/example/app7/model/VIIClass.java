package com.example.app7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A VIIClass.
 */
@Entity
@Table(name = "vii_class")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class VIIClass implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "credit")
    private double credit;

    private ElectricMeter electricMeter;

    // @OneToMany(mappedBy = "vIIClass")
    // @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    // @JsonIgnoreProperties(value = { "vIIClass" }, allowSetters = true)
    // private Set<ElectricMeter> electricMeters = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public VIIClass() {
    }

    public VIIClass(Long id, String name, double credit, ElectricMeter electricMeter) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.electricMeter = electricMeter;
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

    public double getCredit() {
        return this.credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public ElectricMeter getElectricMeter() {
        return this.electricMeter;
    }

    public void setElectricMeter(ElectricMeter electricMeter) {
        this.electricMeter = electricMeter;
    }

    public VIIClass id(Long id) {
        setId(id);
        return this;
    }

    public VIIClass name(String name) {
        setName(name);
        return this;
    }

    public VIIClass credit(double credit) {
        setCredit(credit);
        return this;
    }

    public VIIClass electricMeter(ElectricMeter electricMeter) {
        setElectricMeter(electricMeter);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VIIClass)) {
            return false;
        }
        VIIClass vIIClass = (VIIClass) o;
        return Objects.equals(id, vIIClass.id) && Objects.equals(name, vIIClass.name) && credit == vIIClass.credit && Objects.equals(electricMeter, vIIClass.electricMeter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, credit, electricMeter);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", credit='" + getCredit() + "'" +
            ", electricMeter='" + getElectricMeter() + "'" +
            "}";
    }

}