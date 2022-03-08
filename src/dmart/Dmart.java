package dmart;

import javax.swing.UIManager;

public class Dmart {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (Exception e) {
        }
        new SplashScreen().setVisible(true);
    }
}
