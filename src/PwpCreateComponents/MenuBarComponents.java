package PwpCreateComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


/**
 * Created by Ayettey on 03/02/2017.
 */
public class MenuBarComponents extends JMenuBar {

    private JMenuBar menuBar;
    private JMenu [] menus;
    private JMenuItem items;
    public JSeparator separator;



    public JMenuBar createFileComponents(){



        menuBar=new JMenuBar();
        menus=new JMenu[4];


        //main menu
        menus[0]=new JMenu("Files");
        menus[0].setMnemonic(KeyEvent.VK_F);
        menus[0].getAccessibleContext().setAccessibleDescription("Files Handler");


        //new file menu
        menus[1]=new JMenu("New");
        menus[1].setMnemonic(KeyEvent.VK_N);
        menus[1].getAccessibleContext().setAccessibleDescription("Files Handler");

        //new file items;


        items=new JMenuItem("Empty Model");
        items.getAccessibleContext().setAccessibleDescription("Create empty model");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,KeyEvent.VK_C));
        menus[1].add(items);

        items=new JMenuItem("Model From Template");
        menus[1].add(items);

        items=new JMenuItem("Model From Canvas") ;

        menus[1].add(items);
        menus[0].add(menus[1]);



        items=new JMenuItem("Open",new ImageIcon(getClass().getResource("/PwpIcons/FileIcon/welcome/openProject.png")));
        menus[0].add(items);



        menus[1]=new JMenu("Open Recently");
        menus[1].setMnemonic(KeyEvent.VK_R);

        items=new JMenuItem("Clear Model");
        menus[1].add(items);
        menus[0].add(menus[1]);

        items=new JMenuItem("Close Project");
        menus[0].add(items);

        separator=new JSeparator();
        menus[0].add(separator);



        items=new JMenuItem("Setting",new ImageIcon(getClass().getResource("/PwpIcons/actions/copy.png")));
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.VK_S,getAutoscrolls()));
        menus[0].add(items);

        items=new JMenuItem("Project Structure",new ImageIcon(getClass().getResource("/PwpIcons/general/projectStructure.png")));
        menus[0].add(items);



        menus[1]=new JMenu("Other Settings");
        menus[1].setMnemonic(KeyEvent.VK_O);
        items=new JMenuItem("Default Setting",new ImageIcon(getClass().getResource("/PwpIcons/general/projectStructure.png")));
        menus[1].add(items);
        menus[0].add(menus[1]);

        separator=new JSeparator();
        menus[0].add(separator);



        items=new JMenuItem("Open View");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.VK_S,getAutoscrolls()));
        menus[0].add(items);

        items=new JMenuItem("Close Mode");
        menus[0].add(items);

        items=new JMenuItem("Close View");
        menus[0].add(items);

        items=new JMenuItem("Close AllView");
        menus[0].add(items);



        separator=new JSeparator();
        menus[0].add(separator);

        items=new JMenuItem("Save");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.ALT_DOWN_MASK,getAutoscrolls()));
        menus[0].add(items);

        items=new JMenuItem("Save As");
        menus[0].add(items);

        items=new JMenuItem("Save All",new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-saveall.png")));
        menus[0].add(items);

        items=new JMenuItem("Save A Template");
        menus[0].add(items);


        separator=new JSeparator();
        menus[0].add(separator);

        items=new JMenuItem("Import",new ImageIcon(getClass().getResource("/PwpIcons/FileIcon/welcome/importProject.png")));
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,KeyEvent.VK_S,getAutoscrolls()));
        menus[0].add(items);

        items=new JMenuItem("Export",new ImageIcon(getClass().getResource("/PwpIcons/actions/export.png")));
        menus[0].add(items);

        items=new JMenuItem("Setting Repository");
        menus[0].add(items);

        items=new JMenuItem("Invalidate Caches");
        menus[0].add(items);


        separator=new JSeparator();
        menus[0].add(separator);

        items=new JMenuItem("Export As Html",new ImageIcon(getClass().getResource("/PwpIcons/graph/fitContent.png")));
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.VK_S,getAutoscrolls()));
        menus[0].add(items);

        items=new JMenuItem("Print",new ImageIcon(getClass().getResource("/PwpIcons/graph/print.png")));
        menus[0].add(items);



        separator=new JSeparator();
        menus[0].add(separator);

        items=new JMenuItem("Exit");
        menus[0].add(items);


        menuBar.add(menus[0]);
        menuBar.add(createEditFileComponents());
        menuBar.add(createViewFileComponents());
        menuBar.add(createToolsComponents());
        menuBar.add(createWindowsComponents());
        menuBar.add(createHelpComponents());

        items.setPreferredSize(new Dimension(200,20));



        return menuBar;
    }

    public JMenu createViewFileComponents(){
        //main menu
        menus[0]=new JMenu("View");
        menus[0].setMnemonic(KeyEvent.VK_F);
        menus[0].getAccessibleContext().setAccessibleDescription("Edit Handler");


        //new Edit menu
        menus[1]=new JMenu("View");
        menus[1].setMnemonic(KeyEvent.VK_N);
        menus[1].getAccessibleContext().setAccessibleDescription("Edit Handler");

        //new Edit items;


        items=new JMenuItem("Content Info",new ImageIcon(getClass().getResource("/PwpIcons/actions/undo.png")));
        items.getAccessibleContext().setAccessibleDescription("Undo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("ToolBar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/redo.png")));
        items.getAccessibleContext().setAccessibleDescription("Redo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.VK_R));
        menus[1].add(items);

        separator=new JSeparator();
        menus[1].add(separator);


        items=new JMenuItem("Tool Buttons",new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-cut.png")));
        items.getAccessibleContext().setAccessibleDescription("Cut");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Copy",new ImageIcon(getClass().getResource("/PwpIcons/actions/copy.png")));
        items.getAccessibleContext().setAccessibleDescription("Copy");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Status Bar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-paste.png")));
        items.getAccessibleContext().setAccessibleDescription("paste");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        menus[1].add(items);



        return menus[1];

    }


    public JMenu createToolsComponents(){
        //main menu
        menus[0]=new JMenu("Tool");
        menus[0].setMnemonic(KeyEvent.VK_F);
        menus[0].getAccessibleContext().setAccessibleDescription("Tool Handler");


        //new Edit menu
        menus[1]=new JMenu("Tool");
        menus[1].setMnemonic(KeyEvent.VK_N);
        menus[1].getAccessibleContext().setAccessibleDescription("Tool Handler");

        //new Edit items;


        items=new JMenuItem("Content Info",new ImageIcon(getClass().getResource("/PwpIcons/actions/undo.png")));
        items.getAccessibleContext().setAccessibleDescription("Undo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("ToolBar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/redo.png")));
        items.getAccessibleContext().setAccessibleDescription("Redo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.VK_R));
        menus[1].add(items);

        separator=new JSeparator();
        menus[1].add(separator);


        items=new JMenuItem("Tool Buttons",new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-cut.png")));
        items.getAccessibleContext().setAccessibleDescription("Cut");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Copy",new ImageIcon(getClass().getResource("/PwpIcons/actions/copy.png")));
        items.getAccessibleContext().setAccessibleDescription("Copy");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Status Bar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-paste.png")));
        items.getAccessibleContext().setAccessibleDescription("paste");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        menus[1].add(items);



        return menus[1];

    }


    public JMenu createWindowsComponents(){
        //main menu
        menus[0]=new JMenu("Windows");
        menus[0].setMnemonic(KeyEvent.VK_F);
        menus[0].getAccessibleContext().setAccessibleDescription("Windows Handler");


        //new Edit menu
        menus[1]=new JMenu("Window");
        menus[1].setMnemonic(KeyEvent.VK_N);
        menus[1].getAccessibleContext().setAccessibleDescription("Edit Handler");

        //new Edit items;


        items=new JMenuItem("Content Info",new ImageIcon(getClass().getResource("/PwpIcons/actions/undo.png")));
        items.getAccessibleContext().setAccessibleDescription("Undo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("ToolBar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/redo.png")));
        items.getAccessibleContext().setAccessibleDescription("Redo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.VK_R));
        menus[1].add(items);

        separator=new JSeparator();
        menus[1].add(separator);


        items=new JMenuItem("Tool Buttons",new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-cut.png")));
        items.getAccessibleContext().setAccessibleDescription("Cut");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Copy",new ImageIcon(getClass().getResource("/PwpIcons/actions/copy.png")));
        items.getAccessibleContext().setAccessibleDescription("Copy");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Status Bar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-paste.png")));
        items.getAccessibleContext().setAccessibleDescription("paste");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        menus[1].add(items);



        return menus[1];

    }


    public JMenu createHelpComponents(){
        //main menu
        menus[0]=new JMenu("Help");
        menus[0].setMnemonic(KeyEvent.VK_F);
        menus[0].getAccessibleContext().setAccessibleDescription("Edit Handler");


        //new Edit menu
        menus[1]=new JMenu("Help");
        menus[1].setMnemonic(KeyEvent.VK_N);
        menus[1].getAccessibleContext().setAccessibleDescription("Edit Handler");

        //new Edit items;


        items=new JMenuItem("Content Info",new ImageIcon(getClass().getResource("/PwpIcons/actions/undo.png")));
        items.getAccessibleContext().setAccessibleDescription("Undo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("ToolBar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/redo.png")));
        items.getAccessibleContext().setAccessibleDescription("Redo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.VK_R));
        menus[1].add(items);

        separator=new JSeparator();
        menus[1].add(separator);


        items=new JMenuItem("Tool Buttons",new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-cut.png")));
        items.getAccessibleContext().setAccessibleDescription("Cut");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Copy",new ImageIcon(getClass().getResource("/PwpIcons/actions/copy.png")));
        items.getAccessibleContext().setAccessibleDescription("Copy");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Status Bar" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-paste.png")));
        items.getAccessibleContext().setAccessibleDescription("paste");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        menus[1].add(items);



        return menus[1];

    }


    public JMenu createEditFileComponents(){
        //main menu
        menus[0]=new JMenu("Edit");
        menus[0].setMnemonic(KeyEvent.VK_F);
        menus[0].getAccessibleContext().setAccessibleDescription("Edit Handler");


        //new Edit menu
        menus[1]=new JMenu("Edit");
        menus[1].setMnemonic(KeyEvent.VK_N);
        menus[1].getAccessibleContext().setAccessibleDescription("Edit Handler");

        //new Edit items;


        items=new JMenuItem("Undo",new ImageIcon(getClass().getResource("/PwpIcons/actions/undo.png")));
        items.getAccessibleContext().setAccessibleDescription("Undo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Redo" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/redo.png")));
        items.getAccessibleContext().setAccessibleDescription("Redo");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.VK_R));
        menus[1].add(items);

        separator=new JSeparator();
        menus[1].add(separator);


        items=new JMenuItem("Cut",new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-cut.png")));
        items.getAccessibleContext().setAccessibleDescription("Cut");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Copy",new ImageIcon(getClass().getResource("/PwpIcons/actions/copy.png")));
        items.getAccessibleContext().setAccessibleDescription("Copy");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Paste" ,new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-paste.png")));
        items.getAccessibleContext().setAccessibleDescription("paste");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        menus[1].add(items);

        items=new JMenuItem("Delete",new ImageIcon(getClass().getResource("/PwpIcons/actions/delete.png")));
        items.getAccessibleContext().setAccessibleDescription("Delete");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,KeyEvent.ALT_DOWN_MASK));
        menus[1].add(items);




        separator=new JSeparator();
        menus[1].add(separator);

        items=new JMenuItem("Select");
        items.getAccessibleContext().setAccessibleDescription("Select");
        menus[1].add(items);



        items=new JMenuItem("Select  All");
        items.getAccessibleContext().setAccessibleDescription("Select");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.VK_S));
        menus[1].add(items);


        items=new JMenuItem("Duplicate");
        items.getAccessibleContext().setAccessibleDescription("Duplicate");
        items.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        menus[1].add(items);


        items=new JMenuItem("Find And Replace");
        items.getAccessibleContext().setAccessibleDescription("Find And Replace");
        menus[1].add(items);

        separator=new JSeparator();
        menus[1].add(separator);



        items=new JMenuItem("Preferences");
        items.getAccessibleContext().setAccessibleDescription("Preference");
        items.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_P,KeyEvent.ALT_DOWN_MASK));
        menus[1].add(items);

        return menus[1];

    }
}
