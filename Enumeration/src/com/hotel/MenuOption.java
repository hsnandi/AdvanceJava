package com.hotel;

public enum MenuOption {

    ADD(1, "Add Data." ),
    UPDATE(2,"Update Record"),
    SELECT(3, "Select Record"),
    SELECTALL(4, "Select All Record"),
    DELETE(5, "Delete Record"),
    EXIT(6, "Exit the Program");
    
    private MenuOption(int serialNo, String menuDescription) {
        this.serialNo = serialNo;
        this.menuDescription = menuDescription;
    }
    
    public int getSerialNo() {
        return serialNo;
    }
    
    public String getMenuDescription() {
        return menuDescription;
    }
    
    private int serialNo;
    private String menuDescription;
}
