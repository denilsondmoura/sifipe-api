package com.sifipe.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifipe.api.entity.ExpenseCategories;

public interface ExpenseCategoriesDAO extends JpaRepository<ExpenseCategories, Long>{
    
}
