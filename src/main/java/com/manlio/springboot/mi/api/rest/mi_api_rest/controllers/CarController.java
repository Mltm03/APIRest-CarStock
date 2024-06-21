package com.manlio.springboot.mi.api.rest.mi_api_rest.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.manlio.springboot.mi.api.rest.mi_api_rest.models.Car;
import com.manlio.springboot.mi.api.rest.mi_api_rest.services.ICarService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private ICarService service;


    @GetMapping
    public List <Car> list(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Car show(@PathVariable Long id){
        return service.findByIdCar(id);
    }
    @GetMapping("/tax/{id}")
    public Long ShowTax(@PathVariable Long id){
        return service.getPricewithTax(id);
    }




}
