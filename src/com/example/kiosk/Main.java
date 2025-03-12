package com.example.kiosk;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //인스턴스화
        Kiosk kiosk = new Kiosk();

        kiosk.start();

    }
    public static int calculateTotal(List<MenuItem> cart) {
        int total = 0;
        for (MenuItem item : cart) {
            total += item.price;
        }
        return total;
    }
}

