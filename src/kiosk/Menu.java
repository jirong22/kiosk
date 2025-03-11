package kiosk;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import static kiosk.Main.calculateTotal;


public class Menu {
    //MenuItem 클래스를 관리하는 클래스
    // 음료메뉴 등 카테고리내 여러 MenuItem을 포함

    // 메뉴리스트
    List<MenuItem> menuItems = new ArrayList<>();

    // 장바구니 리스트
    List<MenuItem> cart = new ArrayList<>();
    public Menu(){
        //메뉴 추가
        menuItems.add(new MenuItem("얼큰순대국", 9000, "내장 순대 팍팍"));
        menuItems.add(new MenuItem("마라탕", 13000, "야채듬뿍+양고기서비스"));
        menuItems.add(new MenuItem("빨강숙주쌀국수", 10000, "면보다 많은 숙주"));
        menuItems.add(new MenuItem("하얀국물짬뽕", 16000, "제철 해산물 듬뿍"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("메뉴를 선택해주세요 🧑‍🍳 (숫자 입력 0~4): ");
            choice = scanner.nextInt();
            // 주문 목록
            if (choice > 0 && choice <= menuItems.size()) {
                MenuItem item = menuItems.get(choice -1 );
                cart.add(item);
                System.out.println(item.name + " 장바구니에 추가되었습니다!");
            } else if (choice == 0) {
                if (cart.isEmpty()) {
                    System.out.println( "주문할 메뉴를 선택해주세요");
                    continue;
                }
                System.out.println("주문 목록:");
                for (MenuItem item : cart) {
                    System.out.println("- " + item.name + " | " + item.price + "원");
                }
                System.out.println("✅ 총 결제 금액: " + calculateTotal(cart) + "원");
                break; // 프로그램 종료
            } else {
                System.out.println("삐~~잘못된 입력입니다! 다시 선택하세요");
            }
        }
    }

    public void displayMenu() {
        System.out.println("\n 🍜매-콤 속풀이 해장 목록 🍻");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " +
                    menuItems.get(i).name + " | " +
                    menuItems.get(i).price + "원 | " +
                    menuItems.get(i).description);
        }
        System.out.println("0. 주문 완료!");
    }
}