package com.manlio.springboot.mi.api.rest.mi_api_rest.repositories;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.manlio.springboot.mi.api.rest.mi_api_rest.models.Car;

@Repository //indicamos el tipo de componente
public class CarRepository implements ICarRepository{

    private List <Car> stock;

    public CarRepository(){
        this.stock = Arrays.asList(
            new Car(1L,"Toyota", "Corolla", 2015, "black", 250000L ),
            new Car(2L,"Honda", "Civic", 2025, "Blue", 285000L ),
            new Car(3L,"MG", "Gt", 2023, "black", 467000L ),
            new Car(4L,"Toyota", "Corolla", 2015, "black", 250000L ),
            new Car(5L,"Toyota", "Corolla", 2015, "black", 250000L ),
            new Car(6L,"Toyota", "Corolla", 2015, "black", 250000L )

        );
    }



    @Override
    public List<Car> findAll() {
        return stock;
    }

    @Override
    public Car findByIdCar(Long id) {
        for (int i = 0; i < stock.size(); i++) {
            Car coche = stock.get(i);
            if(coche.getId().equals(id)){
                return coche;
            }
        }
        return null;
    }

}
