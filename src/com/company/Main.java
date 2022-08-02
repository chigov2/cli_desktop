package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            for (Desktop.Action action : Desktop.Action.values()){
                System.out.println(action);
            }
        }
    }
}
