package com.example.bellapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


/**
 * Organization
 * Information about organization
 */
@Entity
@Table (name = "organization")
public class Organization {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private Integer id;

    /**
     * Utility box of "Hibernate"
     */
    @Version
    private Integer version;

    /**
     * Full organization name
     */
    @Column (name = "full_name", length = 100, nullable = false)
    private String fullName;

    /**
     * INN (tax payer number)
     */
    @Column (name = "inn", length = 12, nullable = false, unique = true)
    private String inn;

    /**
     * KPP (tax reason code)
     */
    @Column (name = "kpp", length = 9, nullable = false)
    private String kpp;


    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }
}