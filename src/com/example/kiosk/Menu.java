package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

import static com.example.kiosk.Main.calculateTotal;


public class Menu {

    private String categoryName;
    private List<MenuItem> menuItems;


    //리스트 카테고리 이름 저장
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    //메뉴리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    //카테고리 반환
    public String getCategoryName() {
        return categoryName;
    }

    //메뉴출력
    public void displayMenu() {
        System.out.println("\n 🍜매-콤 속풀이 해장 목록  🌶️");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " +
                    menuItems.get(i).name + " | " +
                    menuItems.get(i).price + "원 | " +
                    menuItems.get(i).description);
        }
        System.out.println("0. 주문 완료!");
    }
}


