package com.example.kiosk;

//이름, 가격, 설명 개별항목
public class MenuItem {

    //속성 필드 캡슐화
    private String name;
    private String description;
    private int price;


    //생성자
    public MenuItem(String name, int price, String description) {
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


