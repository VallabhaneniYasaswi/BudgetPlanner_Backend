package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import klu.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
