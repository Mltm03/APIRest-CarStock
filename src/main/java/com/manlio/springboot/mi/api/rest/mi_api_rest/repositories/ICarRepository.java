package com.manlio.springboot.mi.api.rest.mi_api_rest.repositories;

import java.util.List;

import com.manlio.springboot.mi.api.rest.mi_api_rest.models.Car;

public interface ICarRepository {

    List <Car> findAll();
    Car findByIdCar(Long id);
    Long getPricewithTax();






}
