package klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import klu.repository.ExpenseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseManager {

    @Autowired
    private ExpenseRepository expenseRepository;

    public String addExpenses(List<Expense> expenses) {
        expenseRepository.saveAll(expenses);
        return "200::Expenses saved successfully";
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public String deleteExpense(Long id) {
        if (expenseRepository.existsById(id)) {
            expenseRepository.deleteById(id);
            return "200::Expense deleted successfully";
        } else {
            return "404::Expense not found";
        }
    }

    public String updateExpense(Long id, Expense updatedExpense) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);

        if (optionalExpense.isPresent()) {
            Expense existing = optionalExpense.get();
            existing.setName(updatedExpense.getName());
            existing.setCategory(updatedExpense.getCategory());
            existing.setDate(updatedExpense.getDate());
            existing.setPaymentMode(updatedExpense.getPaymentMode());
            existing.setAmount(updatedExpense.getAmount());

            expenseRepository.save(existing);
            return "200::Expense updated successfully";
        } else {
            return "404::Expense not found";
        }
    }
}
