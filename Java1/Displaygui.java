import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Fischl implements ActionListener{
    JLabel label3;
    JTextField t1,t2;
    void Oz()
    {
        JFrame frame=new JFrame();
        Container c=frame.getContentPane();
        c.setLayout(null);

        JLabel label=new JLabel("Enter the first number:");
        JLabel label1=new JLabel("Enter the second number:");
        label3=new JLabel();

        label.setBounds(10,10,150,20);
        label1.setBounds(10,30,150,20);
        label3.setBounds(10,90,150,20);

        t1=new JTextField();
        t2=new JTextField();

        t1.setBounds(170,10,100,20);
        t2.setBounds(170,30,100,20);

        JButton button=new JButton("Click");
        button.setBounds(10,60,70,20);
        button.addActionListener(this);

        c.add(label);
        c.add(label1);
        c.add(t1);
        c.add(t2);
        c.add(button);
        c.add(label3);
        

        frame.setSize(500,500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());

        int c=a+b;
        
        label3.setText("The result is:"+c);
    } 
    
}

public class Displaygui {
    public static void main(String[] args) {
        Fischl character=new Fischl();
        character.Oz();
    }
}
