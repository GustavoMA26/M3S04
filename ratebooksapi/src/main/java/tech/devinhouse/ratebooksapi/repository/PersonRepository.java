package tech.devinhouse.ratebooksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.ratebooksapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
