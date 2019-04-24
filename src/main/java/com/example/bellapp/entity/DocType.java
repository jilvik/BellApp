package com.example.bellapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


/**
 * Documents type
 * It contains name and code of document
 */
@Entity
@Table (name = "doc_type")
public class DocType {

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
     * Document code
     */
    @Column (name = "code", length = 2, nullable = false, unique = true)
    private String code;

    /**
     * Document name
     */
    @Column (name = "name", length = 115, nullable = false, unique = true)
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