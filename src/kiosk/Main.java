package kiosk;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.displayMenu();
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

