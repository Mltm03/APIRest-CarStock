package com.manlio.springboot.mi.api.rest.mi_api_rest.repositories;
import java.util.Arrays;
import java.util.List;

import com.manlio.springboot.mi.api.rest.mi_api_rest.models.Car;

public class CarRepository implements ICarRepository{

    private List <Car> stock;

    public CarRepository(){
        this.stock = Arrays.asList(
            new Car(1L,"Toyota", "Corolla", 2015, "black", 250000L ),
            new Car(1L,"Honda", "Civic", 2025, "Blue", 285000L ),
            new Car(1L,"MG", "Gt", 2023, "black", 467000L ),
            new Car(1L,"Toyota", "Corolla", 2015, "black", 250000L ),
            new Car(1L,"Toyota", "Corolla", 2015, "black", 250000L ),
            new Car(1L,"Toyota", "Corolla", 2015, "black", 250000L )

        );
    }



    @Override
    public List<Car> findAll() {
        return stock;
    }

    @Override
    public Car findByIdCar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdCar'");
    }

    @Override
    public Long getPricewithTax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPricewithTax'");
    }

}
