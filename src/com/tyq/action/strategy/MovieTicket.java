package com.tyq.action.strategy;

public class MovieTicket {
    private double price;
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return discount.calculate(this.price);
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
