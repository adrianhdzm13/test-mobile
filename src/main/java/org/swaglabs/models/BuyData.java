package org.swaglabs.models;

public class BuyData {
    private static String products;

    public BuyData(String products) {
        this.products = products;
    }

    public static String getProducts() {
        return products;
    }

    public static void setProducts(String products) {
        BuyData.products = products;
    }
}
