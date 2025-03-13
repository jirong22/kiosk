package com.example.kiosk;


import java.util.ArrayList;
import java.util.List;



public class Order {

    private List<MenuItem> orderedItems;
    private Kiosk kiosk;
    private int totalPrice;

    //장바구니 데이터 관리
    public Order(List<MenuItem> cart,int totalPrice){
        this.orderedItems = new ArrayList<>(cart);
        this.totalPrice = totalPrice;
    }

    public List<MenuItem> getOrderedItems() {
        return orderedItems;
        }


    public int getTotalPrice() {  //
        return totalPrice;
    }

    public void displayOrder() {  //
        System.out.println(" 주문 내역:");


        if (orderedItems.isEmpty()) {
            System.out.println("주문 내역이 비어 있습니다.");
            return;
        }

        // 장바구니의  메뉴 출력
        for (MenuItem item : orderedItems) {
            System.out.println("- " + item.getName() + " | " + item.getPrice() + "원");
        }

        System.out.println(" 총 결제 금액: " + totalPrice + "원");
        System.out.println("🎉 주문이 완료되었습니다!");
    }
}




