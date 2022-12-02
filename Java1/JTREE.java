import javax.swing.*;

import javax.swing.tree.DefaultMutableTreeNode;

public class JTREE {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        DefaultMutableTreeNode tree1=new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode tree2=new DefaultMutableTreeNode("Sub-Root");
        DefaultMutableTreeNode tree3=new DefaultMutableTreeNode("Sub-Sub-Root");
        JTree tree=new JTree(tree1);
        frame.add(tree);
        tree1.add(tree2);
        tree2.add(tree3);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
