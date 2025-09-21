package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    // Updated getPrice() method to override and return total price
    @Override
    public double getPrice() {
        double totalPrice = super.getPrice();
        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
        }

        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }
}