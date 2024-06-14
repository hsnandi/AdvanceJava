package com.hotel;

public class MainMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int choice = menu.printMenu();

        switch (choice) {
            case 1 -> System.out.println("Add");
            case 2 -> System.out.println("Update");
            case 3 -> System.out.println("Select");
            case 4 -> System.out.println("Select All");
            case 5 -> System.out.println("Delete");
            case 6 -> System.out.println("Exit");
            default ->  System.out.println("Invalid Input");
        }
    }
}

