package ConstructorOverloadingDemo;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {
    public CustomFrame(){
        Color bgColor = new Color(128, 0, 0);
        setTitle("Order Management System");
        setSize(600, 400);
        setDefaultLookAndFeelDecorated(true);
        getContentPane().setBackground(bgColor);
        setVisible(true);
    }
    public CustomFrame(String title, int width, int height){
        setTitle(title);
        setSize(width, height);
        setVisible(true);
    }
}
