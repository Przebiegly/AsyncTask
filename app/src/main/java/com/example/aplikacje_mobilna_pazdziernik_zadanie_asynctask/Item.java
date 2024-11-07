package com.example.aplikacje_mobilna_pazdziernik_zadanie_asynctask;

public class Item {
    private String title;
    private String price;
    private String description;

    public Item(String title, String price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
