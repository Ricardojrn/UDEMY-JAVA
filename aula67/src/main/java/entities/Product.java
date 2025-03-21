package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
