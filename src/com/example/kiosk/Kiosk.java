package com.example.kiosk;

import com.example.kiosk.Menu;
import com.example.kiosk.MenuItem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


 class Kiosk {


    List<Menu> menus;
    List<MenuItem> cart = new ArrayList<>();

    //해장국, 사리추가, 음료/주류 관리
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // 한줄씩
        while (true) {
            //카테고리 출력
            System.out.println("\n 🍜 메인 해장 메뉴🌶️");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");

            //사용자입력하기
            System.out.println("번호를 선택하세요‍ (0~3)");
            choice = scanner.nextInt();

            //0을입력하면 나가기
            if (choice == 0) {
                System.out.println("주문 종료!");
                break;
            }
            //카테고리 선택시
            if (choice > 0 && choice <= menus.size()) {
                Menu selectedMenu = menus.get(choice - 1);
                //선택한 메뉴출력
                System.out.println("\n 🍜 선택한 메뉴 : " + selectedMenu.getCategoryName());
                selectedMenu.displayMenu();  // 메뉴리스트

                System.out.println("메뉴를 선택하세요 (0 입력 시 이전)");
                int menuChoice = scanner.nextInt();

                if (menuChoice == 0) {
                    System.out.println("이전 메뉴");
                    continue; // 이전 메뉴로 돌아가기
                }
                //장바구니넣기
                if (menuChoice > 0 && menuChoice <= selectedMenu.getMenuItems().size()) {
                    MenuItem selectedItem = selectedMenu.getMenuItems().get(menuChoice - 1);
                    cart.add(selectedItem);
                    System.out.println(selectedItem.name + " 메뉴 추가 완료");
                    System.out.println("계속 선택하려면 번호를 입력하세요. (0: 이전 메뉴)");

                } else {
                    System.out.println("잘못된 선택입니다!💦");
                }
            } else {
                System.out.println("다시선택하세요!💦");
            }
        }
    }
}
