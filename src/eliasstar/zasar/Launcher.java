package eliasstar.zasar;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import eliasstar.zasar.controller.MainController;
import eliasstar.zasar.gui.MainView;

public class Launcher {
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            System.err.println(e);
        }

        MainView main = new MainView();
        new MainController(main);
        main.setVisible(true);
    }
}
