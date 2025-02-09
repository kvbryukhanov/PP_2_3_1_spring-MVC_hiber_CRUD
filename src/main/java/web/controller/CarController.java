package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class CarController {

    @GetMapping(value = "/cars")
    public String showAll(ModelMap model, @RequestParam
            (required = false, defaultValue = "5") int count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Red"));
        cars.add(new Car(2, "Nissan", "Blue"));
        cars.add(new Car(3, "Jeep", "Green"));
        cars.add(new Car(4, "BMW", "Yellow"));
        cars.add(new Car(5, "Lada", "Pink"));

        CarServiceImpl carService = new CarServiceImpl(cars);

        model.addAttribute("cars", carService.getCars(count));

        return "cars";
    }

}
