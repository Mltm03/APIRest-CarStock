package com.manlio.springboot.mi.api.rest.mi_api_rest.services;

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
    public Long getPricewithTax(Long id) {
        Car actualCar=repository.findByIdCar(id);
        return actualCar.getPrice()+235;

    }

}
