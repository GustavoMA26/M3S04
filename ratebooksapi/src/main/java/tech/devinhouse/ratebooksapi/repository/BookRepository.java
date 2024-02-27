package tech.devinhouse.ratebooksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.ratebooksapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
