package com.manlio.springboot.mi.api.rest.mi_api_rest.services;

import java.util.List;

import com.manlio.springboot.mi.api.rest.mi_api_rest.models.Car;

public interface ICarService {

    List <Car> findAll();
    Car findByIdCar(Long id);
    List <Car> getPricewithTax(Long id);


}