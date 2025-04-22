package ConstructorOverloadingDemo;

import javax.swing.*;

public class CustomButton extends JButton {
    public CustomButton(){
        setText("Save");
        setVisible(true);
    }
    public CustomButton(String text){
        setText(text);
    }
}
