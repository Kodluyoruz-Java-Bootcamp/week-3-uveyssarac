package com.emlakcepte.controller;

import com.emlakcepte.model.Realty;
import com.emlakcepte.model.User;
import com.emlakcepte.service.RealtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;
@RestController
@RequestMapping(value = "/realties")
public class RealtyController {

    @Autowired
    private RealtyService service;

    @GetMapping
    public List<Realty> getAll() {
        System.out.println("getAll - realtyService :: " + service);
        return service.getAll();
    }
    @PostMapping
    // @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Realty> create(@RequestBody Realty realty) {
        service.createRealty(realty);
        System.out.println("create - realtyService :: " + service);
        return new ResponseEntity<>(realty, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{province}/{district}") //Şehir ve ilçe bazlı ilan arama / Endpoint
    public List<Realty> getByDistrict(@PathVariable String province, @PathVariable String district){
        service.getAllByProvinceDistrict(province, district);
        return service.getAllByProvinceDistrictList(province, district);
    }
}
