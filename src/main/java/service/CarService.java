package service;

import model.Car;
import org.springframework.ui.Model;

import java.util.List;


public interface CarService {
    public void getTable(List<Car> cars, String count);
}
