package ConstructorOverloadingDemo;

import javax.swing.*;

public class TestCustomButton {
    public static void main(String[] args) {
        JFrame fr = new JFrame("First Java Application");
        fr.setSize(500, 300);

        CustomButton savedButton = new CustomButton();
        fr.add(savedButton);
        fr.setVisible(true);
    }
}
