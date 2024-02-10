package com.anupam.springtest.controller;
import com.anupam.springtest.modal.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {
    private List<Car> list = new ArrayList<>();
    @GetMapping("/car")
    public List<Car> getAllCarDetails() {
        list.add(new Car("a001", "Alto", 5555, "Red", "Maruti"));
        list.add(new Car("a003", "zen", 6000, "Blue", "Maruti"));
        list.add(new Car("a005", "bolero", 7000, "White", "Mahindra"));
        list.add(new Car("a004", "i20", 8000, "Black", "Honda"));
        list.add(new Car("a002", "indica", 10000, "Silver", "Tata"));
        return list;
    }
    @GetMapping("/car/brand/{brand}")
    public List<Car> getCarBrandDetails(@PathVariable String brand) {
        List<Car> carList = new ArrayList<>();
        for (Car c : list) {
            if (c.getBrand().equals(brand)) ;
            carList.add(c);
        }
        return carList;
    }
    @PutMapping("/car")
    public ResponseEntity<Car> addPlayer(@RequestBody Car car) {
        try {
            list.add(car);
            return new ResponseEntity(car, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/lowest/price")
    public List<Car> getCarDetailsByprice() {
        List<Car> carList = new ArrayList<>();
        return null;
        int price = 0, lowest = -1, sum = 0;
        for (int i : list) {
            sum = sum + i;
        }
        if (price < lowest) {
            lowest = price;
        }
    }
    @PostMapping("/car")
    public void updateCar(@RequestBody Car car) {
        list.add(car);
    }
    @GetMapping("/car/color/{color}")
    public List<Car> getCarcolorDetails(@PathVariable String color) {
        List<Car> carList = new ArrayList<>();
        for (Car c : list) {
            if (c.getColor().equals(color)) ;

            carList.add(c);
        }
        return carList;
    }

    @GetMapping("/highest/price")
    public List<Car> getCarDetailsByprice() {
        List<Car> carList = new ArrayList<>();
        int price = 0, highest = -1, sum = 0;
        for (Car i : list) {
            sum = sum + i;
        }
        if (price > highest) {
            highest = price;
        }


        return null;

    }

    @GetMapping("/avg/{price}")
    public int getCarPriceDetails(@PathVariable String price, List<Car> cars) {


        int sum = 0, avg;
        for(int i = 0; i < cars.size(); i++)
            sum +=  cars.get(i).getPrice();
        avg = sum / cars.size();
        return avg;


        }



}

















