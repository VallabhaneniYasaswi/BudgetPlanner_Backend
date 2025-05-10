package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import klu.model.IncomeSource;

@Repository
public interface IncomeSourceRepository extends JpaRepository<IncomeSource, Long> {
    // Additional query methods can be defined here if needed
}
