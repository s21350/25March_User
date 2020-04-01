package com.company;

public class Product {
    private String Name;
    private int Price;
    private int id;
    private int Quantity;

    Product(String name, int price, int id) {
        this.Name = name;
        this.Price = price;
        this.id = id;
        this.Quantity = 0;
    }

    Product(String name, int price, int id, int Quantity) {
        this.Name = name;
        this.Price = price;
        this.id = id;
        this.Quantity  = Quantity;
    }

    public void setPrice() {
        this.Price = Price;
    }

    public void setQuantity() {
        this.Quantity = Quantity ;
    }

    public int getQuantity () {
        return Quantity ;
    }

    public int getPrice() {
        return Price;
    }

    public int id() {
        return id;
    }

    public String getName() {
        return Name;
    }
}

