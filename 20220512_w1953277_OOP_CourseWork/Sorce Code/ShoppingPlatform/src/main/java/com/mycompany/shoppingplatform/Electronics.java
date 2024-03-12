/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingplatform;

public class Electronics extends Product {
    
    private String brand;
    private int warrantyPeriod;

//    public Electronics(String productId, String productName, int noOfAvailableItems, float price) {
//        super(productId, productName, noOfAvailableItems, price);
//
//    }

    public Electronics(String productId, String productName, int noOfAvailableItems, double price , String brand, int warrantyPeriod) {
        super(productId, productName, noOfAvailableItems, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }


    @Override
    public String getProductType() {
        return "Electronics";
    }


    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public int getWarrantyPeriod() {

        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {

        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %.2f, %s, %d",
                getProductId(), getProductName(), getNoOfAvailableItems(), getPrice(), getBrand(), getWarrantyPeriod());
    }
    
}
