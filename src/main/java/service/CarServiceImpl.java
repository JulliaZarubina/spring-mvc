package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarServiceImpl implements CarService {
    @Override
    public void getTable(List<Car> cars, String count) {

        int count2 = 0;
        if (count != null) {
            count2 = Integer.parseInt(count.replaceAll("[^0-9]", ""));
        }
        if (count2 >= 5) {
            count2 = 5;
        }
        Stream streamCar = cars.stream();
        streamCar.limit(count2)
                .forEach(s -> System.out.println(s));
    }
}
