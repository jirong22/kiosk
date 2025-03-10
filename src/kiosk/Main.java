package kiosk;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();//메뉴리스트
        List<MenuItem> cart = new ArrayList<>();  // 장바구니 리스트

        //메뉴 추가
        menuItems.add(new MenuItem("얼큰순대국", 9000, "내장 순대 팍팍"));
        menuItems.add(new MenuItem("마라탕", 13000, "야채듬뿍+양고기서비스"));
        menuItems.add(new MenuItem("빨강숙주쌀국수", 10000, "면보다 많은 숙주"));
        menuItems.add(new MenuItem("하얀국물짬뽕", 16000, "제철 해산물 듬뿍"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        // 올바른 답이 나올때까지 반복문
        while (true) {
            System.out.println("\n 🍜매-콤 속풀이 해장 목록 🍻");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " +
                        menuItems.get(i).name + " | " +
                        menuItems.get(i).price + "원 | " +
                        menuItems.get(i).description);
            }
            System.out.println("0. 주문 완료!");

            // 사용자 입력
            System.out.println("메뉴를 선택해주세요 🧑‍🍳 (숫자 입력 0~4): ");
            choice = scanner.nextInt();

            // 주문완료 목록 0번입력시
            if (choice == 0) {
                System.out.println("주문목록 : ");
                //MenuItem 타입의 item 변수 사용
                for (MenuItem item : cart) {
                    System.out.println("- " + item.name + " | " + item.price + "원");
                }
                System.out.println("✅ 총 결제 금액: " + calculateTotal(cart) + "원");
                break;
            }

            // 올바른 선택인지 확인
            if (choice > 0 && choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1); // 리스트에서 메뉴 가져오기
                cart.add(selectedItem); // 장바구니 추가
                System.out.println(selectedItem.name + "장바구니 추가 완료!");
            } else {
                System.out.println("삐~~잘못된 입력입니다! 다시 선택하세요");
            }
        }
        scanner.close();
    }
    public static int calculateTotal(List<MenuItem> cart) {
        int total = 0;
        for (MenuItem item : cart) {
            total += item.price;
        }
        return total;
    }
}

