package com.example.conflicttracker.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.conflicttracker.service.*;
import com.example.conflicttracker.model.*;

@RestController
@RequestMapping("/api/v1")
public class ConflictController {

    private final ConflictService service;

    public ConflictController(ConflictService s){this.service=s;}

    @GetMapping("/conflicts")
    public List<Conflict> getAll(@RequestParam(required=false) ConflictStatus status){
        if(status!=null) return service.findByStatus(status);
        return service.findAll();
    }

    @GetMapping("/conflicts/{id}")
    public Conflict getOne(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping("/conflicts")
    public Conflict create(@RequestBody Conflict c){
        return service.save(c);
    }

    @PutMapping("/conflicts/{id}")
    public Conflict update(@PathVariable Long id,@RequestBody Conflict c){
        c.setCountries(service.findById(id).getCountries());
        return service.save(c);
    }

    @DeleteMapping("/conflicts/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/countries/{code}/conflicts")
    public List<Conflict> byCountry(@PathVariable String code){
        return service.findByCountryCode(code);
    }
}
