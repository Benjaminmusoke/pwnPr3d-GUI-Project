package com.company;

import PwpCreateComponents.MenuBarComponents;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ayettey on 02/02/2017.
 */
public class PwpFrame extends JFrame {

   public PwpFrame()  {



       MenuBarComponents menuBar=new MenuBarComponents();
       Container pane=getContentPane();
       pane.setLayout(new BorderLayout());
       setJMenuBar(menuBar.createFileComponents());
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

          // UIManager.setLookAndFeel(new NimbusLookAndFeel());

        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);

       }




}
