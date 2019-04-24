package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table (name = "person")
public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private int id;

    @Version
    private int version;

    private int officeId;

    @Column (name = "last_name", length = 20, nullable = false)
    private String lastName;

    @Column (name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column (name = "middle_name", length = 20)
    private String middleName;

    @Column (name = "post", length = 30, nullable = false)
    private String post;

    @Column (name = "phone", length = 20, nullable = false)
    private String phone;

    private int documentId;

    private int countryId;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "country_id")
    private Country country;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "office_id")
    private Office office;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "document_id")
    private Document document;


    public int getId() {
        return id;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}