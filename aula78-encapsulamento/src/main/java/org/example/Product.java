package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    //GETTERS E SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    //METODOS
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
