package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping(value = "/cars")
    public String cars(ModelMap model, HttpServletRequest request) {
        int count = 5;
        try {
            count = Integer.parseInt(request.getParameter("count"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        carService = new CarServiceImpl();
        List<Car> cars = carService.returnCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
