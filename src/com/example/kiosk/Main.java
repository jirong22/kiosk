package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //메뉴불러오기
        List<Menu> menus = buildMenu();
        //kiosk 객체생성  menus 전달
        Kiosk kiosk = new Kiosk(menus);
        //키오스크 실행
        kiosk.start();

    }

    // 메서드 선언 (카테고리 객체를 저장할 저장할 리스트)
    public static List<Menu> buildMenu() {
        // 새로운 List를 생성 menus에 저장
        List<Menu> menus = new ArrayList<>();

        List<MenuItem> haejangItems = new ArrayList<>();
        haejangItems.add(new MenuItem("얼큰순대국", 9000, "내장 순대 팍팍"));
        haejangItems.add(new MenuItem("마라탕", 13000, "야채듬뿍+양고기서비스"));
        haejangItems.add(new MenuItem("빨강숙주쌀국수", 10000, "면보다 많은 숙주"));
        haejangItems.add(new MenuItem("하얀국물짬뽕", 16000, "제철 해산물 듬뿍"));
        menus.add(new Menu("해장국", haejangItems));

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("순대추가", 3000, "순대만"));
        menuItems.add(new MenuItem("고기추가", 3000, "고기만"));
        menuItems.add(new MenuItem("야채추가", 3000, "고기만"));
        menus.add(new Menu("사리추가", menuItems));

        List<MenuItem> drinkItems = new ArrayList<>();
        drinkItems.add(new MenuItem("콜라", 2000, "제로콜라"));
        drinkItems.add(new MenuItem("사이다", 2000, "제로사이다"));
        drinkItems.add(new MenuItem("소주", 3000, "소주는 역시 참이슬"));
        drinkItems.add(new MenuItem("맥주", 3000, "맥주는 역시 카스"));
        menus.add(new Menu("음료/주류", drinkItems));

        return menus;
    }
}

