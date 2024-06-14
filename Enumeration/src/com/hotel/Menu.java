package com.hotel;
import java.util.Scanner;

public class Menu {

    public int printMenu() {
        Scanner scanner = new Scanner(System.in);
        for(MenuOption menuOption : MenuOption.values()) {
            System.out.println(menuOption.getSerialNo() + "." + menuOption.name()  + "(" + menuOption.getMenuDescription() + ")");
        }
        return scanner.nextInt();
    }
}
