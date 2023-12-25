package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;
     {
        cars = new ArrayList<>();
        cars.add(new Car("1", "bwm", "black"));
        cars.add(new Car("2", "audi", "white"));
        cars.add(new Car("3", "lada", "gray"));
        cars.add(new Car("4", "lada", "lada"));
        cars.add(new Car("lada", "lada", "lada"));
    }


    public List<Car> returnCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
