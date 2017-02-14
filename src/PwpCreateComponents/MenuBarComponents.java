package PwpCreateComponents;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;


/**
 * Created by Ayettey on 03/02/2017.
 */
public class MenuBarComponents extends JMenuBar {

    private JMenuBar menuBar;
    private JMenu [] menus;
    private JPanel panel;
    private JButton  editToolWindowHandler;
    private JMenuItem items;
    private JComboBox zoomList;

    public JSeparator separator;



    public JComponent createFileComponents(){


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



        items=new JMenuItem("Setting",new ImageIcon(getClass().getResource("/PwpIcons/general/settings.png")));
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

        items=new JMenuItem("Export",new ImageIcon(getClass().getResource("/PwpIcons/graph/export.png")));
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





        items.setPreferredSize(new Dimension(200,20));



        return menus[0];
    }

    public JMenuBar menuBarList(){
        menuBar=new JMenuBar();


        JMenuBar []menuList=new JMenuBar[2];

        menuList [0]=new JMenuBar();
        menuList [0].add(createFileComponents());
        menuList [0].add(createEditFileComponents());
        menuList [0].add(createViewFileComponents());
        menuList [0].add(createToolsComponents());
        menuList [0].add(createWindowsComponents());
        menuList [0].add(createHelpComponents());


        menuList [1]=new JMenuBar();
        menuList [1].add(createEditToolWindowOpen());
        menuList [1].add(createEditToolWindowSave());


       // menuList [1].add(panel);
        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(createEditToolWindowUndo());
        menuList [1].add(createEditToolWindowRedo());



        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(createEditToolWindowCut());
        menuList [1].add(createEditToolWindowCopy());
        menuList [1].add(createEditToolWindowPaste());
        menuList [1].add(createEditToolWindowDelete());



        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(createEditToolWindowFind());
        menuList [1].add(createEditToolWindowReplace());
        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(createEditToolWindowBack());
        menuList [1].add(createEditToolWindowForward());
        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(createEditToolWindowModel());
        menuList [1].add(createEditToolWindowProperty());
        menuList [1].add(createEditToolWindowOutline());
        menuList [1].add(createEditToolWindowHintNavigator());
        menuList [1].add(createEditToolWindowVisualizer());
        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(createEditToolWindowHint());
        menuList [1].add(createEditToolWindowValidateModel());
        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(zoomList());
        menuList [1].add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(createEditToolWindowValidateAlignLift());
        menuList [1].add(createEditToolWindowValidateModelAlighnMiddle());
        menuList [1].add(createEditToolWindowValidateModelAlignCenter());
        menuList [1].add(new JSeparator(JSeparator.VERTICAL));








        panel=new JPanel(new BorderLayout());
        panel.add(new JSeparator(JSeparator.VERTICAL));
        menuList [1].add(panel);
        menuBar.setLayout(new BorderLayout());
        menuBar.add(menuList [0],BorderLayout.NORTH);
        menuBar.add(menuList [1]);




        return menuBar;
    }

    public JComboBox  zoomList(){

        Object []listOfZoom={"50%",100,150,200,250,300,350,400,450,500,550,600,650,700,750,800,"Page","Width","Height"};
        List zoomLister=new ArrayList<>();
        zoomLister.add(listOfZoom);

        zoomList=new JComboBox(listOfZoom);
        zoomList.setSelectedItem(listOfZoom[1]);
        return zoomList;
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


        items=new JMenuItem("Fill Color");
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


    public JButton createEditToolWindowOpen(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/FileIcon/welcome/openProject.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }

    public JButton createEditToolWindowSave(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-saveall.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }

    public JButton createEditToolWindowRedo(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/redo.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }

    public JButton createEditToolWindowUndo(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/undo.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }

    public JButton createEditToolWindowCut(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-cut.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }

    public JButton createEditToolWindowPaste(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-paste.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }

    public JButton createEditToolWindowCopy(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/copy.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }

    public JButton createEditToolWindowFind(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-find.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowReplace(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/menu-replace.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowBack(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/back.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowForward(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/forward.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowDelete(){


        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/delete.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowModel(){

            ImageIcon icon=new ImageIcon();

        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/models.gif")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowProperty(){

        ImageIcon icon=new ImageIcon();

        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/properties.gif")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowOutline(){

        ImageIcon icon=new ImageIcon();

        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/outline_co.gif")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowHintNavigator(){

        ImageIcon icon=new ImageIcon();

        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/navigator-16.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowVisualizer(){

        ImageIcon icon=new ImageIcon();

        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/icon.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowHint(){

        ImageIcon icon=new ImageIcon();

        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/hint-16.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModel(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/annotate.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }


    public JButton createEditToolWindowValidateAlignLift(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/alignleft.gif")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelAlignRight(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/alignright.gif")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelAlignCenter(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/aligncenter_d.gif")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelAlignTop(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/alignleft.gif")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelAlignButton(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/annotate.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelAlighnMiddle(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/annotate.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelWatchWidthOfSelectedObject(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/annotate.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelWatchHeightOfSelectedObject(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/annotate.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }
    public JButton createEditToolWindowValidateModelDefaultSize(){



        editToolWindowHandler=new JButton(new ImageIcon(getClass().getResource("/PwpIcons/actions/annotate.png")));
        EmptyBorder emptyBorder=new EmptyBorder(4,4,4,4);
        editToolWindowHandler.setBorder(emptyBorder);
        editToolWindowHandler.setBorderPainted(false);
        editToolWindowHandler.setBackground(getBackground());
        editToolWindowHandler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu");

            }
        });

        return editToolWindowHandler;

    }




}
