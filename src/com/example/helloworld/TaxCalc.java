package com.example.helloworld;

public class TaxCalc {
    public static void main(String[] args) {
        double priceWithoutVat =9.99;
        System.out.println("price without VAT: "+ priceWithoutVat );
        double priceWithVat = priceWithoutVat * 1.23;
        System.out.println("price with VAT: "+ priceWithVat);
        double valueWithVat =priceWithVat * 10000;
        System.out.println("value with VAT: " + valueWithVat);
        double priceWithoutVat2 = valueWithVat/ 1.23;
        System.out.println("value without VAT :"+ priceWithoutVat2);
    }
}
