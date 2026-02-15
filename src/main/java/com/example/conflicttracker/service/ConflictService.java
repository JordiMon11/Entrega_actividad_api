package com.example.conflicttracker.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.example.conflicttracker.repository.*;
import com.example.conflicttracker.model.*;

@Service
public class ConflictService {
    private final ConflictRepository repo;
    private final CountryRepository countryRepo;

    public ConflictService(ConflictRepository r, CountryRepository c){
        this.repo=r; this.countryRepo=c;
    }

    public List<Conflict> findAll(){return repo.findAll();}
    public Conflict findById(Long id){return repo.findById(id).orElseThrow();}
    public Conflict save(Conflict c){return repo.save(c);}
    public void delete(Long id){repo.deleteById(id);}
    public List<Conflict> findByStatus(ConflictStatus s){return repo.findByStatus(s);}

    public List<Conflict> findByCountryCode(String code){
        Country c = countryRepo.findByCode(code).orElseThrow();
        return repo.findAll().stream().filter(cf->cf.getCountries().contains(c)).toList();
    }
}
