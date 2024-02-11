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

        Long carAveragePrice = carTest.getCarAveragePrice("Alto");
        System.out.println("getCarByprice: \n" + carAveragePrice);
        List<Car> lowestprice = carTest.getCarlowestprice();
        System.out.println("getcarlowestprice: \n" + lowestprice);

        List<Car> highestprice = carTest.getCarhighestprice1();
        System.out.println("getcarhighesttprice: \n" + highestprice);
    }
    public List<Car> getAllCarDetails() {
        carList.add(new Car("a001", "Alto", 5555, "Red", "Maruti"));
        carList.add(new Car("a003", "zen", 6000, "Blue", "Maruti"));
        carList.add(new Car("a005", "bolero", 7000, "White", "Mahindra"));
        carList.add(new Car("a004", "i20", 8000, "Black", "Honda"));
        carList.add(new Car("a002", "indica", 10000, "Silver", "Tata"));
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
    public List getCarlowestprice() {
        int lowest = 99999, price = 0;
        for (Car c : carList) {
            if (lowest < c.getPrice()) {
                lowest = c.getPrice();
            }

        }
        return  carList;

    }
    public List getCarhighestprice1() {

        int highest = 1000000, price = 0;
        for (Car c : carList) {
            if (highest > c.getPrice()) {
                highest = c.getPrice();
            }
            return  carList;
}
















