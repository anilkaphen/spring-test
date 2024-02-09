package com.anupam.springtest.controller;

import com.anupam.springtest.modal.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    public List<Car> getCarDetailsBycolor() {
        return null;

    }

    @PostMapping("/car")
    public void updateCar(@RequestBody Car car) {
        list.add(car);
    }

}






















