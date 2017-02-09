package PwpIcons.TreeModule;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ayettey on 07/02/2017.
 */
public class TreeFrame extends JFrame {


     public TreeFrame(){
        Container pane=getContentPane();
         pane.setLayout(new BorderLayout());

         JTree tree=new JTree(new getChangableTree());

         pane.add(tree,BorderLayout.WEST);
         setVisible(true);
         setSize(200,200);

    }
   public static void main(String[]agr){
       new TreeFrame();





    }


}
