package ConstructorOverloadingDemo;

public class TestCustomFrame {
    public static void main(String[] args) {
        CustomFrame customFrame1 = new CustomFrame();
        customFrame1.setVisible(true);

        CustomFrame customFrame2 = new CustomFrame("My Custom Frame", 500, 500);
        customFrame2.setVisible(true);
    }
}
