package com.example.kiosk;

//이름, 가격, 설명 개별항목
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
