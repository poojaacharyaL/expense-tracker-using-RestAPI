package com.expensetracker.service;

import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense getExpenseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        return repository.findById(id).map(expense -> {
            expense.setTitle(updatedExpense.getTitle());
            expense.setCategory(updatedExpense.getCategory());
            expense.setAmount(updatedExpense.getAmount());
            expense.setDate(updatedExpense.getDate());
            return repository.save(expense);
        }).orElse(null);
    }

    public String deleteExpense(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Expense deleted successfully";
        }
        return "Expense not found";
    }
}
