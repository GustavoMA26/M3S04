package tech.devinhouse.ratebooksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.ratebooksapi.model.Rate;

public interface RateRepository extends JpaRepository<Rate, Long> {

}
