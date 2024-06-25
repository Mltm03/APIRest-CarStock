package com.manlio.springboot.mi.api.rest.mi_api_rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manlio.springboot.mi.api.rest.mi_api_rest.models.Car;
import com.manlio.springboot.mi.api.rest.mi_api_rest.repositories.ICarRepository;

@Service
public class CarService implements ICarService {

    @Autowired //IoD with interface
    private ICarRepository repository;


    @Override
    public List<Car> findAll() {
        return repository.findAll();
    }

    @Override
    public Car findByIdCar(Long id) {
       return repository.findByIdCar(id);
    }

    @Override
    public List <Car> getPricewithTax(Long id) {
       List <Car> carsWithTax = new ArrayList<>();
       carsWithTax.add(repository.findByIdCar(id));
       Long newPrice = carsWithTax.get(0).getPrice()+250L;
       carsWithTax.get(0).setPrice(newPrice); 
       return carsWithTax;


       //falta aplicar inmutabilidad con la clase cloneable
    }

}
