package com.sifipe.api.bc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifipe.api.entity.CategoriaDespesa;

public interface CategoriaDespesaBC extends JpaRepository<CategoriaDespesa, Long>{
    
}
