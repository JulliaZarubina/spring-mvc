package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, int count) {

        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }
        return carList;
    }
}
