package tech.devinhouse.ratebooksapi.model;

import jakarta.persistence.*;

@Entity
public class  Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guid;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false, unique = true)
    private String email;

    @Column (nullable = false)
    private String password;

    public Person() {

    }

    public Person(Long guid, String name, String email, String password) {
        this.guid = guid;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getGuid() {
        return guid;
    }

    public void setId(Long id) {
        this.guid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
