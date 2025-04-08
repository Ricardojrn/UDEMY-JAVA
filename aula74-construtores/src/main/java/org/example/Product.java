package org.example;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double totalValueInStrock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return "Product data: "+ name +
                ", $"+ price +
                ", "+ quantity +
                " units, Total: $"+ totalValueInStrock();
    }
}
