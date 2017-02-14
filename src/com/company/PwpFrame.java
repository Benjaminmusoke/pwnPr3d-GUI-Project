package com.company;

import PwpCreateComponents.MenuBarComponents;
import PwpCreateComponents.Models;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ayettey on 02/02/2017.
 */
public class PwpFrame extends JFrame {

   public PwpFrame()  {


       /*Create MenuBarComponent instance
         JScrollPane,JSplitPane,JTabbedPane and put Component on their instance
        */

       MenuBarComponents menuBar=new MenuBarComponents();
       Container pane=getContentPane();
       pane.setLayout(new BorderLayout());

       setJMenuBar(menuBar.menuBarList());
       JTabbedPane tabbedPane=new JTabbedPane();

       Models models=new Models();
       tabbedPane.addTab("Project",new ImageIcon(getClass().getResource("/PwpIcons/actions/module.png")),models.modelTree());
       JScrollPane scrollPane=new JScrollPane(tabbedPane);

       JSplitPane  splitPane=new JSplitPane();
       splitPane.setLayout(new BorderLayout());
       splitPane.add(scrollPane,BorderLayout.EAST);

       pane.add(scrollPane,BorderLayout.WEST);




       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

          // UIManager.setLookAndFeel(new NimbusLookAndFeel());

        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);

       }




}
