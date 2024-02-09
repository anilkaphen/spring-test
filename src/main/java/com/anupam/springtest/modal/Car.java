package com.anupam.springtest.modal;
public class Car {
    private String id;
    private String name;
    private Integer price;
    private String color;
    private String brand;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price=" + price + ", color='" + color + '\'' + ", brand='" + brand + '\'' + '}';
    }
    public Car(String id, String name, Integer price, String color, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.brand = brand;
    }}
