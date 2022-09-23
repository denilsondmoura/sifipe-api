package com.sifipe.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sifipe.api.dao.ExpenseCategoriesDAO;
import com.sifipe.api.entity.ExpenseCategories;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/expenseCategories")
@Api("API REST of Expense's Categories")
@CrossOrigin(origins="*")
public class ExpenseCategoriesREST {
    
    @Autowired
    private ExpenseCategoriesDAO expenseCategoriesDAO;

    @GetMapping
    public List<ExpenseCategories> get() {
        return expenseCategoriesDAO.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ExpenseCategories> getById(@PathVariable("id") long id) {
        return expenseCategoriesDAO.findById(id);
    }

    @PostMapping
    public ExpenseCategories create(@RequestBody ExpenseCategories entity) {
        return expenseCategoriesDAO.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        expenseCategoriesDAO.deleteById(id);
    }
}
