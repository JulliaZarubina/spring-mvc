package service;

import model.Car;
import org.springframework.ui.Model;

import java.util.List;


public interface CarService {
    public List<Car> getCars(List<Car> cars, int count);
}
