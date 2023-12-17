package com.exam1.coffee;

public class Coffee {
    private Boolean milk;
    private String syrup;
    private int price;

    public Coffee() {
    }

    public Coffee(Boolean milk, String syrup, int price) {
        this.milk = milk;
        this.syrup = syrup;
        this.price = price;
    }

    public Boolean getMilk() {
        return milk;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public String getSyrup() {
        return syrup;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

