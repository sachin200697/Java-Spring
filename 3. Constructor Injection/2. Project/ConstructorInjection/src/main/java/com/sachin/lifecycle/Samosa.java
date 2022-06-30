package com.sachin.lifecycle;
 
public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setter method of Samosa");
        this.price = price;
    }

    public Samosa() {
        System.out.println("Constructor of Samosa");
    }

    @Override
    public String toString() {
        return "Samosa{" + "price=" + price + '}';
    }
    
    public void init(){
        System.out.println("Inside init method of Samosa");
    }
    
    public void destroy(){
        System.out.println("Inside destroy method of Samosa");
    }
    
}
