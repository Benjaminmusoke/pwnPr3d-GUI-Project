package EventHandlers;

import PwpCreateComponents.Models;

import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Ayettey on 13/02/2017.
 */
public class ProjectModelHandler implements MouseListener,TreeModelListener,TreeSelectionListener {

    private Models models;
    private JMenuItem eventModelHandlerItems;
    private JPopupMenu eventModelHandlerPopupMenu;
    private JMenu    eventModelHandlerMenu;



    public ProjectModelHandler(Models models){

        this.models=models;



    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }



    @Override
    public void mousePressed(MouseEvent e) {




        if((e.getModifiers() & InputEvent.BUTTON3_MASK )!=0  && models.treeNodes.getSelectionCount() !=0){


            BuildModelEventComponents(e.getX(),e.getY());


        }


    }

    public void BuildModelEventComponents(int x,int y){


        eventModelHandlerPopupMenu=new JPopupMenu();
        eventModelHandlerMenu=new JMenu("New");
        eventModelHandlerPopupMenu.add(eventModelHandlerMenu);

        eventModelHandlerPopupMenu.add(new JSeparator());

        eventModelHandlerItems=new JMenuItem("Folder",new ImageIcon(getClass().getResource("/PwpIcons/OtherImages/fldr_obj.gif")));
        eventModelHandlerMenu.add(eventModelHandlerItems);

        eventModelHandlerMenu.add(new JSeparator());

        eventModelHandlerItems=new JMenuItem("New");
        eventModelHandlerMenu.add(eventModelHandlerItems);

        eventModelHandlerItems=new JMenuItem("New");
        eventModelHandlerMenu.add(eventModelHandlerItems);

        eventModelHandlerItems=new JMenuItem("New");
        eventModelHandlerMenu.add(eventModelHandlerItems);

        eventModelHandlerItems=new JMenuItem("New");
        eventModelHandlerMenu.add(eventModelHandlerItems);

        eventModelHandlerItems=new JMenuItem("New");
        eventModelHandlerMenu.add(eventModelHandlerItems);

        eventModelHandlerItems=new JMenuItem("New");
        eventModelHandlerPopupMenu.add(eventModelHandlerItems);

        eventModelHandlerItems=new JMenuItem("New");
        eventModelHandlerPopupMenu.add(eventModelHandlerItems);


        TreePath  path=models.treeNodes.getSelectionPath();
        Object node=path.getLastPathComponent();
        if(node==models.treeNodes.getModel().getRoot()){
            eventModelHandlerPopupMenu.setEnabled(false);
        }else {
            eventModelHandlerPopupMenu.show(models.treeNodes,x,y);
        }




    }



    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void treeNodesChanged(TreeModelEvent e) {

    }

    @Override
    public void treeNodesInserted(TreeModelEvent e) {

    }

    @Override
    public void treeNodesRemoved(TreeModelEvent e) {

    }

    @Override
    public void treeStructureChanged(TreeModelEvent e) {

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        System.out.println("Selected");
    }


}
