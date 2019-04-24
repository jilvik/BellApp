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

@Entity
@Table (name = "person")
public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private int id;

    @Column (name = "office_id", nullable = false)
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

    @Column (name = "document_id", nullable = false)
    private int documentId;

    @Column (name = "country_id", nullable = false)
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

    public Person() {

    }

}