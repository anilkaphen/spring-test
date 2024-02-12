package com.anupam.springtest;

import com.anupam.springtest.modal.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarTest {
    private static List<Car> carList = new ArrayList<>();
    private static CarTest carTest = new CarTest();

    public static void main(String[] args) {
        carTest.getAllCarDetails();

        List<Car> brandCarList = carTest.getCarByBrand("Maruti");
        System.out.println("getCarByBrand: \n" + brandCarList);

        List<Car> colorCarList = carTest.getCarByColor("Blue");
        System.out.println("getCarByColor: \n" + colorCarList);

        Long carAveragePrice = carTest.getCarAveragePrice();
        System.out.println("getCarByprice: \n" + carAveragePrice);

        int lowestprice = carTest.getCarLowestPrice();
        System.out.println("getcarlowestprice: \n" + lowestprice);

        int highestprice = carTest.getCarHighestPrice();
        System.out.println("getcarhighesttprice: \n" + highestprice);
    }

    public List<Car> getAllCarDetails() {
        carList.add(new Car("a001", "Alto", 5000, "Red", "Maruti"));
        carList.add(new Car("a002", "zen", 6000, "Blue", "Maruti"));
        carList.add(new Car("a003", "bolero", 7000, "White", "Mahindra"));
        carList.add(new Car("a004", "i20", 8000, "Black", "Honda"));
        carList.add(new Car("a005", "indica", 10000, "Silver", "Tata"));
        carList.add(new Car("a006", "Alto", 2000, "Red", "Maruti"));
        carList.add(new Car("a007", "zen", 6000, "Blue", "Maruti"));
        carList.add(new Car("a008", "bolero", 7000, "White", "Mahindra"));
        carList.add(new Car("a009", "i20", 8000, "Black", "Honda"));
        carList.add(new Car("a010", "indica", 10000, "Silver", "Tata"));
        carList.add(new Car("a011", "Alto", 18000, "Red", "Maruti"));
        carList.add(new Car("a012", "zen", 6000, "Blue", "Maruti"));

        return carList;
    }

    public List<Car> getCarByBrand(String brand) {
        List<Car> list = new ArrayList<>();
        for (Car c : carList) {
            if (c.getBrand().equals(brand)) {
                list.add(c);
            }
        }
        return list;
    }

    public List<Car> getCarByColor(String color) {
        List<Car> list = new ArrayList<>();
        for (Car c : carList) {
            if (c.getColor().equals(color)) {
                list.add(c);
            }
        }
        return list;
    }

    public long getCarAveragePrice() {
        int sum = 0, avg = 0;
        for (int i = 0; i < carList.size(); i++) {
            sum += carList.get(i).getPrice();
        }
        avg = sum / carList.size();
        return avg;
    }

    public int getCarLowestPrice() {
        int lowest = 99999;
        for (Car c : carList) {
            if (lowest > c.getPrice()) {
                lowest = c.getPrice();
            }
        }
        return lowest;
    }

    public int getCarHighestPrice() {
        int highest = -1;
        for (Car c : carList) {
            if (highest < c.getPrice()) {
                highest = c.getPrice();
            }
        }
        return highest;
    }
}
















