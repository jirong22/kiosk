package com.example.kiosk;

import com.example.kiosk.Menu;
import com.example.kiosk.MenuItem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Kiosk {

    List<Menu> menus = new ArrayList<>();

    public Kiosk() {

        List<MenuItem> haejangItems = new ArrayList<>();
        haejangItems.add(new MenuItem("얼큰순대국", 9000, "내장 순대 팍팍"));
        haejangItems.add(new MenuItem("마라탕", 13000, "야채듬뿍+양고기서비스"));
        haejangItems.add(new MenuItem("빨강숙주쌀국수", 10000, "면보다 많은 숙주"));
        haejangItems.add(new MenuItem("하얀국물짬뽕", 16000, "제철 해산물 듬뿍"));

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("순대추가", 3000, "순대만"));
        menuItems.add(new MenuItem("고기추가", 3000, "고기만"));
        menuItems.add(new MenuItem("야채추가", 3000, "고기만"));

        List<MenuItem> drinkItems = new ArrayList<>();
        drinkItems.add(new MenuItem("콜라", 2000, "제로콜라"));
        drinkItems.add(new MenuItem("사이다", 2000, "제로사이다"));
        drinkItems.add(new MenuItem("소주", 3000, "소주는 역시 참이슬"));
        drinkItems.add(new MenuItem("맥주", 3000, "맥주는 역시 카스"));

        //카테고리
        menus.add(new Menu("해장국", haejangItems));
        menus.add(new Menu("사리추가", menuItems));
        menus.add(new Menu("음료/주류", drinkItems));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // 한줄씩
        while (true) {
            //카테고리 출력
            System.out.println("\n 메뉴를선택하세요 🧑‍🍳");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". 메뉴 " + (i + 1));
            }
            System.out.println("0. 종료");

            //사용자입력하기
            System.out.println("메뉴를 선택하세요‍🍳");
            choice = scanner.nextInt();

            //0을입력하면 나가기
            if (choice == 0) {
                System.out.println("주문 종료!");
                break;
            }
            //맞는 카테고리 선택시
            if (choice > 0 && choice <= menus.size()) {
                    Menu selectedMenu = menus.get(choice - 1);
                    selectedMenu.displayMenu();
                } else {
                    System.out.println("다시선택하세요!💦");
                }
            }
        }
    }