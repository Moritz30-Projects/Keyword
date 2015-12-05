package de.moritz30.java.keyword;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;

/**
 * Created by moritz30 on 05.12.15.
 */
public class MainGUI implements Runnable {

    @Override
    public void run() {

        //Frame
        final JFrame frame = new JFrame("Keyword");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        //FileChooser
        final JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSize(800, 600);

        //Menubar
        JMenuBar menubar = new JMenuBar();

        frame.setJMenuBar(menubar);

        //Menus
        JMenu menuFile = new JMenu("File");
        menuFile.setVisible(true);

        menubar.add(menuFile);

        //MenuItems
        JMenuItem itemOpenFile = new JMenuItem(new AbstractAction("Open File") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int returnVal = fileChooser.showOpenDialog(frame);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    //This is where a real application would open the file.
                    System.out.println("Opening: " + file.getPath() + ".");
                } else {
                    System.out.println("Open command cancelled by user." );
                }

            }
        });

        menuFile.add(itemOpenFile);

    }

}
