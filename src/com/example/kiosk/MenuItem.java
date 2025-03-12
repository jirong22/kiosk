package com.example.kiosk;


public class MenuItem {
    //속성
    String name;
    String description;
    int price;

    //생성자
    MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
