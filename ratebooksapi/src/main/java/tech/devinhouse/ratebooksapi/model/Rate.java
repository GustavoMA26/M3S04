package tech.devinhouse.ratebooksapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    @Size(min = 0, max = 5)
    private Double rate;

    @ManyToOne
    @JoinColumn(name = "owner_guid", referencedColumnName = "guid", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name="book_id", referencedColumnName = "id", nullable = false)
    private Book book;

    public Rate() {
    }

    public Rate(Long id, Double rate, Person person, Book book) {
        this.id = id;
        this.rate = rate;
        this.person = person;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
