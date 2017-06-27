package edu.lhub.homework1;

import lombok.Data;

@Data
public class HomeElectronic extends Technique {
    private Brand brand;
    private double price;
    private String description;

    public HomeElectronic(Brand brand, double price, String description) {
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public HomeElectronic() {
    }

    @Override
    protected void doWORK() {
        System.out.println("Work in home");
    }
}
