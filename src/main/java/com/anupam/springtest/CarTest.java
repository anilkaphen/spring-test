package com.anupam.springtest;

import com.anupam.springtest.modal.Car;

import java.util.*;
import java.util.stream.Collectors;

public class CarTest {
    private static List<Car> unsoldInventory = new ArrayList<>();
    private static List<Car> soldInventory = new ArrayList<>();

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        carTest.getAllCarDetails();

        List<Car> brandCarList = carTest.getCarByBrand("Maruti");
        System.out.println("getCarByBrand: \n" + brandCarList);

        List<Car> colorCarList = carTest.getCarByColor("Blue");
        System.out.println("getCarByColor: \n" + colorCarList);

        Long carAveragePrice = carTest.getCarAveragePrice();
        System.out.println("getCarByprice: \n" + carAveragePrice);

        int lowestprice = carTest.getCarLowestPrice(unsoldInventory);
        System.out.println("getcarlowestprice: \n" + lowestprice);

        int highestprice = carTest.getCarHighestPrice(unsoldInventory);
        System.out.println("getcarhighesttprice: \n" + highestprice);

        List<Car> list5 = carTest.getCarByColorAndGreaterThanPrice("Red", 5000);
        System.out.println("getCarByColorAndGreaterThanPrice: \n" + list5);

        int list9 = carTest.getCarByBrandCount("Tata");
        System.out.println("getCarByBrandCountDetails: \n" + list9);

        List<Car> list6 = carTest.getCarListGreaterThanAveragePrice();
        System.out.println("getCarListGreaterThanAveragePrice: \n" + list6);

        int difflowestandhighest = carTest.getCarDiffLowestAndHighest();
        System.out.println("getcarlowestandhighest: \n" + difflowestandhighest);

        int list7 = carTest.getCarByColorCount("Blue");
        System.out.println("getCarByColorCount: \n" + list7);

        int list8 = carTest.getCarPriceDifferenceByBrand("Maruti");
        System.out.println("getCarPriceDifferenceByBrand: \n" + list8);
        List<Car> list10 = carTest.getCarPriceIncreasigOrder();

        System.out.println("PriceIncreasigOrder: \n" + list10);
        List<Car> list11 = carTest.getCarPriceDcreasigOrder();
        System.out.println("PriceIncreasigOrder: \n" + list11);


        carTest.sellCar("a001");
        carTest.sellCar("a003");
        carTest.sellCar("a005");
        carTest.sellCar("a002");
        carTest.sellCar("a004");
        carTest.sellCar("a006");
        System.out.println("sold car: " + soldInventory);

        String maxSoldBrand = carTest.getMaxCarBrand(soldInventory);
        System.out.println("maxUnSoldBrand: " + maxSoldBrand);
        Integer maxSoldPrice = carTest.getMaxCarPrice(soldInventory);
        System.out.println("getMaxCarPrice: " + maxSoldPrice);
        int avgPriceofSoldcar = carTest.getAvgPriceOfSoldCar(soldInventory);
        System.out.println( " avgPriceofSoldcar :" +avgPriceofSoldcar );

    }

    public List<Car> getAllCarDetails() {
        unsoldInventory.add(new Car("a001", "Alto", 5000, "Red", "Maruti"));
        unsoldInventory.add(new Car("a002", "zen", 6000, "Blue", "Maruti"));
        unsoldInventory.add(new Car("a003", "bolero", 7000, "White", "Mahindra"));
        unsoldInventory.add(new Car("a004", "i20", 8000, "Black", "Honda"));
        unsoldInventory.add(new Car("a005", "indica", 10000, "Silver", "Tata"));
        unsoldInventory.add(new Car("a006", "Alto", 2000, "Red", "Maruti"));
        unsoldInventory.add(new Car("a007", "zen", 6000, "Blue", "Maruti"));
        unsoldInventory.add(new Car("a008", "bolero", 17000, "White", "Mahindra"));
        unsoldInventory.add(new Car("a009", "i20", 8000, "Black", "Honda"));
        unsoldInventory.add(new Car("a010", "indica", 20000, "Silver", "Tata"));
        unsoldInventory.add(new Car("a011", "E SERIES", 18000, "Red", "BMW"));
        unsoldInventory.add(new Car("a012", "C SERIES", 16000, "Blue", "BMW"));
        unsoldInventory.add(new Car("a013", "seltos", 8978, "Red", "kia"));
        unsoldInventory.add(new Car("a014", "seltosp", 789, "Blue", "kia"));

        return unsoldInventory;
    }

    public List<Car> getCarByBrand(String brand) {
        List<Car> list = new ArrayList<>();
        for (Car c : unsoldInventory) {
            if (c.getBrand().equals(brand)) {
                list.add(c);
            }
        }
        return list;
    }

    public List<Car> getCarByColor(String color) {
        List<Car> list = new ArrayList<>();
        for (Car c : unsoldInventory) {
            if (c.getColor().equals(color)) {
                list.add(c);
            }
        }
        return list;
    }

    public long getCarAveragePrice() {
        int sum = 0, avg = 0;
        for (int i = 0; i < unsoldInventory.size(); i++) {
            sum += unsoldInventory.get(i).getPrice();
        }
        avg = sum / unsoldInventory.size();
        return avg;
    }

    public int getCarLowestPrice(List<Car> carList) {
        int lowest = 99999;
        for (Car c : carList) {
            if (lowest > c.getPrice()) {
                lowest = c.getPrice();
            }
        }
        return lowest;
    }

    public int getCarHighestPrice(List<Car> carList) {
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
        for (Car c : unsoldInventory) {
            if (c.getColor().equals(color) && c.getPrice() > price) {
                list.add(c);
            }
        }
        return list;
    }

    public List<Car> getCarListGreaterThanAveragePrice() {
        List<Car> list = new ArrayList<>();
        long average = getCarAveragePrice();
        for (Car c : unsoldInventory) {
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
        return getCarHighestPrice(unsoldInventory) - getCarLowestPrice(unsoldInventory);
    }

    public int getCarByBrandCount(String brand) {
        int count = 0;
        for (Car b : unsoldInventory) {
            if (b.getBrand().equals(brand)) {
                count++;
            }
        }
        return count;
    }

    public int getCarByColorCount(String color) {
        int count = 0;
        for (Car c : unsoldInventory) {
            if (c.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }

    public int getCarPriceDifferenceByBrand(String brand) {
        List<Car> list = new ArrayList<>();
        for (Car c : unsoldInventory) {
            if (c.getBrand().equals(brand)) {
                list.add(c);
            }
        }
        return getCarHighestPrice(list) - getCarLowestPrice(list);
    }

    public void sellCar(String id) {
        Optional<Car> car = unsoldInventory.stream().filter(e -> e.getId().equals(id)).findFirst();
        soldInventory.add(car.get());
        for (int i = 0; i < unsoldInventory.size(); ++i) {
            if (id.equals(unsoldInventory.get(i).getId())) {
                unsoldInventory.remove(i);
                break;
            }
        }
        System.out.println("Id: " + id + "\t sold");
    }

    public List<Car> getCarPriceIncreasigOrder() {
        List<Car> list = unsoldInventory.stream()
                .sorted(Comparator.comparingLong(Car::getPrice)).collect(Collectors.toList());
        System.out.println(list);
        return list;
    }


    public List<Car> getCarPriceDcreasigOrder() {
        List<Car> list = unsoldInventory.stream()
                .sorted(Comparator.comparingLong(Car::getPrice).reversed()).collect(Collectors.toList());
        System.out.println(list);
        return list;
    }

    public String getMaxCarBrand(List<Car> carList) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < carList.size(); i++) {
            if (map.containsKey(carList.get(i).getBrand())) {
                map.put(carList.get(i).getBrand(), map.get(carList.get(0).getBrand()) + 1);
            } else {
                map.put(carList.get(i).getBrand(), 1);
            }
        }

        int count = -1;
        String brand = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                brand = entry.getKey();
            }
        }
        return brand;
    }
public  Integer getMaxCarPrice(List<Car> carList){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < carList.size(); i++) {
            if (map.containsKey(carList.get(i).getPrice())){
                map.put(carList.get(i).getPrice(), map.get(carList.get(0).getBrand()) + 1);
            } else {
               map.put(carList.get(i).getPrice(),1);
            }
        }
    int count = -1;
    int price =0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() > count) {
            count = entry.getValue();
            price = entry.getKey();
        }
    }
    return price;
}
    public int getAvgPriceOfSoldCar(Map<Integer, Car> map) {
        int sum = 0;
        for (Map.Entry<Integer, Car> e : map.entrySet()) {
            sum = sum + e.getValue().getPrice();
        }
        return sum / map.size();


    }

}


























