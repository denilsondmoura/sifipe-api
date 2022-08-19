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
import com.sifipe.api.bc.DespesaBC;
import com.sifipe.api.entity.Despesa;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/despesa")
@Api("API REST de Despesas")
@CrossOrigin(origins="*")
public class DespesaREST {
    
    @Autowired
    private DespesaBC despesaBC;

    @GetMapping
    public List<Despesa> get() {
        return despesaBC.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Despesa> getById(@PathVariable("id") long id) {
        return despesaBC.findById(id);
    }

    @PostMapping
    public Despesa create(@RequestBody Despesa entity) {
        entity.setData(new Date());
        return despesaBC.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        despesaBC.deleteById(id);
    }
}
