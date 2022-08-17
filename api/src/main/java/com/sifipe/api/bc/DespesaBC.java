package com.sifipe.api.bc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifipe.api.entity.Despesa;

public interface DespesaBC extends JpaRepository<Despesa, Long>{
    
}
