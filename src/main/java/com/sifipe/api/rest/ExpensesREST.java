package com.sifipe.api.rest;

import java.util.Date;
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

import com.sifipe.api.dao.ExpensesDAO;
import com.sifipe.api.entity.Expenses;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/expenses")
@Api("API REST de Expenses")
@CrossOrigin(origins="*")
public class ExpensesREST {
    
    @Autowired
    private ExpensesDAO expensesDAO;

    @GetMapping
    public List<Expenses> get() {
        return expensesDAO.findAll();
    }

    @GetMapping("/today")
    public List<Expenses> getTodays() {
        return expensesDAO.findTodays();
    }

    @GetMapping("/{id}")
    public Optional<Expenses> getById(@PathVariable("id") long id) {
        return expensesDAO.findById(id);
    }

    @PostMapping
    public Expenses create(@RequestBody Expenses entity) {
        entity.setCreatedAt(new Date());
        return expensesDAO.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        expensesDAO.deleteById(id);
    }
}
