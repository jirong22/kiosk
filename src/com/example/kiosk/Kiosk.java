package com.example.kiosk;

import com.example.kiosk.Menu;
import com.example.kiosk.MenuItem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


class Kiosk {
    // 필드
    private List<Menu> menus;
    private List<MenuItem> cart = new ArrayList<>();


    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public List<MenuItem> getCart() {
        return new ArrayList<>(cart);
    }

    // 장바구니에 메뉴 추가
    public void addToCart(MenuItem item) {
        cart.add(item);
        System.out.println(item.getName() + " 메뉴 추가 완료");
    }

    // 총 합계 계산
    public int calculateTotal() {
        int total = 0;
        for (MenuItem item : cart) {
            total += item.getPrice();
        }
        return total;
    }
    //해장국, 사리추가, 음료/주류 관리
    public void placeOrder() {
        System.out.println(" 장바구니 목록:");
        if (cart.isEmpty()) {
            System.out.println("\n💁장바구니가 비어 있습니다");
            return;
        }
        int total = calculateTotal();
        Order order = new Order(cart, total);
        System.out.println("\n 주문내역 불러오기 🏃‍♂️💨");
        order.displayOrder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n 주문을 완료하시겠습니까? (1: 계속 2: 취소)");
        int con = scanner.nextInt();

        if (con == 1) {
            System.out.println(" 주문이 완료되었습니다!");
            cart.clear();
        } else {
            System.out.println("주문이 취소되었습니다!");
        }
    }
        // 시작
        public void start() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            while (true) {
                System.out.println("\n 🍜 메인 해장 메뉴🌶️");
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
                }
                System.out.println("0. 종료");
                System.out.println("11. 주문하기");

                System.out.println("번호를 선택하세요‍ (0~3 11: 주문하기)");
                choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("0.주문 종료!");
                    break;
                } else if (choice == 11) {
                    System.out.println("11.주문하기!");
                    placeOrder();
                    continue;
                }

                if (choice > 0 && choice <= menus.size()) {
                    Menu selectedMenu = menus.get(choice - 1);
                    System.out.println("\n 🍜 선택한 메뉴 : " + selectedMenu.getCategoryName());
                    selectedMenu.displayMenu();
                    System.out.println("메뉴를 선택하세요 (0 입력 시 이전)");

                    int menuChoice = scanner.nextInt();

                    if (menuChoice == 0) {
                        System.out.println("이전 메뉴로 돌아갑니다!");
                        continue;
                    }

                    if (menuChoice > 0 && menuChoice <= selectedMenu.getMenuItems().size()) {
                        MenuItem selectedItem = selectedMenu.getMenuItems().get(menuChoice - 1);
                        System.out.println("\n" + selectedItem.getName() + " | " + selectedItem.getPrice() + "원 | " + selectedItem.getDescription());
                        System.out.println("장바구니에 추가하시겠습니까🧑‍🍳");
                        System.out.println("1. 추가    2. 취소");

                        int confirm = scanner.nextInt();
                        if (confirm == 1) {
                            addToCart(selectedItem);
                            System.out.println("장바구니 담은 메뉴: " + selectedItem.getName());
                        } else {
                            System.out.println("추가 취소");
                        }
                    }
                }
            }
        }
    }






