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


    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", required = false) Integer count, Model model) {
        Car car1 = new Car ("KIA", "red", 2011);
        Car car2 = new Car ("Toyota", "blue", 1999);
        Car car3 = new Car ("BMW", "black", 2021);
        Car car4 = new Car ("Mercedes", "white", 2007);
        Car car5 = new Car ("Nissan", "yellow", 1989);

        List<Car> list = new ArrayList<Car>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        if (count == null || count > 5) {
            model.addAttribute("cars", list);
        } else {
            model.addAttribute("cars", new CarServiceImpl().getCars(list, count));
        }
        return "cars";
    }
}
