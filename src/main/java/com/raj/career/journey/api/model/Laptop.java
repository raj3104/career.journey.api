package com.raj.career.journey.api.model;

public class Laptop {

    private String brand;
    private String processor;
    private int ram;
    private double price;

    public Laptop(String brand,String processor, int ram,double price){
        this.brand=brand;
        this.processor=processor;
        this.ram=ram;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }
}
