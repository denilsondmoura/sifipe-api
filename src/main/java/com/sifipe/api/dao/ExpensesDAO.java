package com.sifipe.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sifipe.api.entity.Expenses;

public interface ExpensesDAO extends JpaRepository<Expenses, Long>{
    
    @Query("SELECT d FROM Expenses d WHERE d.createdAt > current_date")
    public List<Expenses> findTodays();
}
