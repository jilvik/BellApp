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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Integer id;

    /**
     * Utility box of "Hibernate"
     */
    @Version
    private Integer version;

    /**
     * Organization name
     */
    @Column (name = "name", length = 50, nullable = false)
    private String name;

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

    /**
     * Organization address
     */
    @Column (name = "address", length = 250, nullable = false)
    private String address;

    /**
     * Organization phone
     */
    @Column (name = "phone", length = 30)
    private String phone;

    /**
     * Organization active
     */
    @Column (name = "is_active", nullable = false)
    private boolean isActive;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}