package com.example.app7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A ElectricMeter.
 */
@Entity
@Table(name = "electric_meter")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ElectricMeter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "electricity")
    private Long electricity;

    @Column(name = "status")
    private Long status;

    // @ManyToOne
    // @JsonIgnoreProperties(value = { "electricMeters" }, allowSetters = true)
    // private VIIClass vIIClass;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public ElectricMeter id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getElectricity() {
        return this.electricity;
    }

    public ElectricMeter electricity(Long electricity) {
        this.setElectricity(electricity);
        return this;
    }

    public void setElectricity(Long electricity) {
        this.electricity = electricity;
    }

    public Long getStatus() {
        return this.status;
    }

    public ElectricMeter status(Long status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    // public VIIClass getVIIClass() {
    //     return this.vIIClass;
    // }

    // public void setVIIClass(VIIClass vIIClass) {
    //     this.vIIClass = vIIClass;
    // }


    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ElectricMeter)) {
            return false;
        }
        return id != null && id.equals(((ElectricMeter) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ElectricMeter{" +
            "id=" + getId() +
            ", electricity=" + getElectricity() +
            ", status=" + getStatus() +
            "}";
    }
}
