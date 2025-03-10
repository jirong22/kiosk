package kiosk;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import kiosk.MenuItem;


public class MenuItem {
    //세부 메뉴 속성 이름, 가격, 설명 필드
    String name;
    String description;
    int price;

    //생성자
    MenuItem(String name,int priceString,String description) {
        this.name = name;
        this.price = priceString;
        this.description = description;
    }






}
