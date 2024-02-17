package com.anupam.springtest;

import com.anupam.springtest.modal.Car;

import java.util.ArrayList;
import java.util.List;

public class CarTest1 {
    private static List<Car> carList1 = new ArrayList<>();
    private static CarTest carTest1 = new CarTest();

    public static void main(String[] args) {
        carTest1.getAllCarDetails();
        List<Car> brandCarList = carTest1.getCarByBrand("Maruti");
        System.out.println("getCarByBrand: \n" + brandCarList);
        List<Car> colorCarList = carTest1.getCarByColor("Blue");
        System.out.println("getCarByColor: \n" + colorCarList);
        Long carAveragePrice = carTest1.getCarAveragePrice();
        System.out.println("getCarByprice: \n" + carAveragePrice);
        int lowestprice = carTest1.getCarLowestPrice();
        System.out.println("getCarlowestprice: \n" + lowestprice);
        int highestprice = carTest1.getCarHighestPrice();
        System.out.println("getCarpricehighest: \n" + highestprice);
        List<Car> colorCarList1 = carTest1.getCarByColor("silver");
        System.out.println("getCarBycolorgreater: \n" + colorCarList);


        carList1.add(new Car("a001", "Blero", 6000, "Red", "Maruti"));
        carList1.add(new Car("a002", "zen", 5000, "Blue", "Maruti"));
        carList1.add(new Car("a003", "bolero", 7000, "White", "Mahindra"));
        carList1.add(new Car("a004", "i20", 9000, "Black", "Honda"));
        carList1.add(new Car("a005", "Alto", 10000, "Silver", "mahindra"));
        carList1.add(new Car("a006", "Alto", 2000, "Red", "Maruti"));
        carList1.add(new Car("a007", "zen", 6000, "Blue", "Maruti"));
        carList1.add(new Car("a008", "Indica", 8000, "White", "maruti"));
        carList1.add(new Car("a009", "i20", 9000, "Black", "Honda"));

    }

    public List<Car> getCarByBrand(String brand) {
        List<Car> list = new ArrayList<>();
        for (Car c : carList1) {
            if (c.getBrand().equals(brand)) {
                list.add(c);
            }
        }
        return list;
    }

    public List<Car> getCarByColor(String color) {
        List<Car> list = new ArrayList<>();
        for (Car c : carList1) {
            if (c.getColor().equals(color)) {
                list.add(c);
            }
        }
        return list;
    }

    public long getCarAveragePrice() {
        int sum = 0, avg = 0;
        for (int i = 0; i < carList1.size(); i++) {
            sum += carList1.get(i).getPrice();
        }
        avg = sum / carList1.size();
        return avg;
    }

    public int getCarLowestPrice() {
        int lowest = 99999;
        for (Car c : carList1) {
            if (lowest > c.getPrice()) {
                lowest = c.getPrice();
            }
        }
        return lowest;
    }

    public int getcarhighestprice() {
        int highest = -1;
        for (Car c : carList1) {
            if (highest < c.getPrice()) {
                highest = c.getPrice();
            }
        }
        return highest;
    }

    public List<Car> getCarByColorgrearer(String color) {
        List<Car> list = new ArrayList<>();

        for (Car c : carList1) {
            if (c.getColor().equals("Red") && c.getPrice() > 5000) {
                list.add(c);
            }
        }
        return list;

    }

    public List< Car> getCargreaterprice(){
        int greater = -1, average = 0;
        for (Car c : carList1) {
            if (greater < c.getPrice()) {
                greater = c.getPrice();
            }

        }
        getCarAveragePrice();
        return List;

    }

    public double getCarAveragePrice() {
        int sum = 0, avg = 0;
        for (int i = 0; i < carList1.size(); i++) {
            sum += carList1.get(i).getPrice();
        }
        avg = sum / carList1.size();
        return avg;
    }
}

