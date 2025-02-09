package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0 || cars.size() < count) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
