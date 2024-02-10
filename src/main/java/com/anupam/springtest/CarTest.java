package com.anupam.springtest;

import com.anupam.springtest.modal.Car;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    private static List<Car> carList = new ArrayList<>();
    private static CarTest carTest = new CarTest();

    public static void main(String[] args) {
        carTest.getAllCarDetails();
        List<Car>  brandCarList = carTest.getCarBrandDetails("Maruti");
        System.out.println(brandCarList);
    }

    public List<Car> getAllCarDetails() {
        carList.add(new Car("a001", "Alto", 5555, "Red", "Maruti"));
        carList.add(new Car("a003", "zen", 6000, "Blue", "Maruti"));
        carList.add(new Car("a005", "bolero", 7000, "White", "Mahindra"));
        carList.add(new Car("a004", "i20", 8000, "Black", "Honda"));
        carList.add(new Car("a002", "indica", 10000, "Silver", "Tata"));
        return carList;
    }

    public List<Car> getCarBrandDetails(String brand) {
        List<Car> list = new ArrayList<>();
        for (Car c : carList) {
            if (c.getBrand().equals(brand)) {
                list.add(c);
            }
        }
        return list;
    }
}
