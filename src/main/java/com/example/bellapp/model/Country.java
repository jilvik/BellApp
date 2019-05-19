package com.example.bellapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


/**
 * Country
 * It contains name and code of country
 */
@Entity
@Table (name = "country")
public class Country {

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
     * Country code
     */
    @Column (name = "code", length = 3, nullable = false, unique = true)
    private String code;

    /**
     * Country name
     */
    @Column (name = "name", length = 30, nullable = false, unique = true)
    private String name;


    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}