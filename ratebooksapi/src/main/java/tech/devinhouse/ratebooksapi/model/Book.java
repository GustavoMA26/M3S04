package tech.devinhouse.ratebooksapi.model;

import jakarta.persistence.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Title;

    @ManyToOne
    @JoinColumn(name="person_id", referencedColumnName = "guid", nullable = false)
    private Person person;

    private Year yearRelease;

    @OneToMany(mappedBy = "id")
    private List<Rate> rate = new ArrayList<>();

    public Book() {
    }


    public Book(Long id, String title, Person person, Year yearRelease, List<Rate> rate) {
        this.id = id;
        Title = title;
        this.person = person;
        this.yearRelease = yearRelease;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Year getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(Year yearRelease) {
        this.yearRelease = yearRelease;
    }

    public List<Rate> getRate() {
        return rate;
    }

    public void setRate(List<Rate> rate) {
        this.rate = rate;
    }
}
