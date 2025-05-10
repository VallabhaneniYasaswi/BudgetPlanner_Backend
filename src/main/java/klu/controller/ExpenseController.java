package klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import klu.model.Expense;
import klu.model.ExpenseManager;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "http://localhost:5173/")  // Adjust based on your frontend URL
public class ExpenseController {

    @Autowired
    private ExpenseManager expenseManager;

    // Add expenses
    @PostMapping("/add")
    public String addExpenses(@RequestBody List<Expense> expenses) {
        return expenseManager.addExpenses(expenses);
    }

    // Get all expenses
    @GetMapping("/all")
    public List<Expense> getAllExpenses() {
        return expenseManager.getAllExpenses();
    }

    // Delete an expense
    @DeleteMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        return expenseManager.deleteExpense(id);
    }

    // Update an existing expense
    @PutMapping("/update/{id}")
    public String updateExpense(@PathVariable Long id, @RequestBody Expense updatedExpense) {
        return expenseManager.updateExpense(id, updatedExpense);
    }
}
