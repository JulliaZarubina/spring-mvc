package web.controller;


import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    Car car1 = new Car ("KIA", "red", 2011);
    Car car2 = new Car ("Toyota", "blue", 1999);
    Car car3 = new Car ("BMW", "black", 2021);
    Car car4 = new Car ("Mercedes", "white", 2007);
    Car car5 = new Car ("Nissan", "yellow", 1989);

    public List<Car> getListCar() {
        List<Car> list = new ArrayList<Car>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        return list;
    }

    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", required = false) String count, Model model) {

        model.addAttribute("cars", getListCar());

        CarServiceImpl carService=new CarServiceImpl();

        carService.getTable(getListCar(), count);

        return "cars";
    }
}
