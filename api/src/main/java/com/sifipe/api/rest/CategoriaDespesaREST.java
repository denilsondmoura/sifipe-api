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

import com.sifipe.api.bc.CategoriaDespesaBC;
import com.sifipe.api.entity.CategoriaDespesa;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/categoriaDespesa")
@Api("API REST de Categorias de despesas")
@CrossOrigin(origins="*")
public class CategoriaDespesaREST {
    
    @Autowired
    private CategoriaDespesaBC categoriaDespesaBC;

    @GetMapping
    public List<CategoriaDespesa> get() {
        return categoriaDespesaBC.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CategoriaDespesa> getById(@PathVariable("id") long id) {
        return categoriaDespesaBC.findById(id);
    }

    @PostMapping
    public CategoriaDespesa create(@RequestBody CategoriaDespesa entity) {
        return categoriaDespesaBC.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        categoriaDespesaBC.deleteById(id);
    }
}
