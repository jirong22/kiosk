package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

//카테고리MenuItem 음료 음식관리
public class Menu {
    //캡슐화
    private String categoryName;
    private List<MenuItem> menuItems;


    //리스트 카테고리 이름 저장
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    //메뉴리스트
    public List<MenuItem> getMenuItems() {
        //복사본반환
        return new ArrayList<>(menuItems);
    }

    //카테고리
    public String getCategoryName() {
        return categoryName;
    }

    //메뉴출력
    public void displayMenu() {
        System.out.println("\n 🍜매-콤 속풀이 해장 목록  🌶️");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " +
                    item.getName() + " | " +
                    item.getPrice() + "원 | " +
                    item.getDescription())
            ;
        }
        System.out.println("0 입력 시 이전 메뉴");
    }
}


