package de.moritz30.java.keyword;

import javax.swing.*;

/**
 * Created by moritz30 on 05.12.15.
 */
public class MainGUI implements Runnable {

    public void run() {

        JFrame frame = new JFrame("Keyword");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
