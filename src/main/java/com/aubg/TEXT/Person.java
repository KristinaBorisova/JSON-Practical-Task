package com.aubg.TEXT;

public class Person {
    private String name;
    private Integer totalSales;
    private Integer salesPeriod;
    private double experienceMultiplier;

    //Zero-parameter constructor
    Person() {
        this.name = "Noname";
        this.totalSales = 0;
        this.salesPeriod = 0;
        this.experienceMultiplier = 0;
    }

    Person(String _name, Integer _totalSales, Integer _salesPeriod, double _experienceMultiplier) {
        this.name = _name;
        this.totalSales = _totalSales;
        this.salesPeriod = _salesPeriod;
        this.experienceMultiplier = _experienceMultiplier;
    }

}
