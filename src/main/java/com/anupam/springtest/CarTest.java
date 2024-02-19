package com.anupam.springtest;

import com.anupam.springtest.modal.Car;

import java.util.ArrayList;
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
//        int diffPrice = carTest.getCarLowestPriceDiffHighest();
//        System.out.println("getcarhighesttprice: \n" + diffPrice);
//        int diffPrice1 = carTest.getCarHighestPriceDifferencelowerprice();
//        System.out.println("getcarlowesttprice: \n" + diffPrice1);

        List<Car> list5 = carTest.getCarByColorAndGreaterThanPrice("Red", 5000);
        System.out.println("getCarByColorAndGreaterThanPrice: \n" + list5);
        int list9 = carTest.getCarByBrandCount("Tata");
        System.out.println("getCarByBrandCountDetails: \n" + list9);

        List<Car> list6 = carTest.getCarListGreaterThanAveragePrice();
        System.out.println("getCarListGreaterThanAveragePrice: \n" + list6);
        int difflowestandhighest = carTest.getCarDiffLowestAndHighest();
        System.out.println("getcarlowestandhighest: \n" + difflowestandhighest);
        int list7 = carTest.getCarByColorCount("Blue");
        System.out.println("getCarByColorCountDetails: \n" + list9);

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

    public List<Car> getCarByColorAndGreaterThanPrice(String color, int price) {
        List<Car> list = new ArrayList<>();
        for (Car c : carList) {
            if (c.getColor().equals(color) && c.getPrice() > price) {
                list.add(c);
            }
        }
        return list;
    }

    public List<Car> getCarListGreaterThanAveragePrice() {
        List<Car> list = new ArrayList<>();
        long average = getCarAveragePrice();
        for (Car c : carList) {
            if (average < c.getPrice()) {
                list.add(c);
            }
        }
        return list;
    }

    /**
     * Find price difference for given brand means (write api to find difference between highest and lowest car price)
     *
     * @return
     */
    public int getCarDiffLowestAndHighest() {
        return getCarHighestPrice() - getCarLowestPrice();
    }

    public int getCarByBrandCount(String brand) {
        List<Car> list = new ArrayList<>();
        int count = 0;
        for (Car b : carList) {
            if (b.getBrand().equals(brand)) {
                count++;
                list.add(b);


            }
        }
        return count;
    }

    public int getCarByColorCount(String color) {
        List<Car> list = new ArrayList<>();
        int count = 0;
        for (Car c : carList) {
            if (c.getColor().equals(color)) {
                count++;
                list.add(c);


            }
        }
        return count;

    }
}































