package com.sifipe.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifipe.api.models.Despesa;

public interface ProdutoRepository extends JpaRepository<Despesa, Long>{
    
}
