import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Sets{
    JButton button;
    JFrame frame;
    Container c;
    JLabel label,label1,label2,label3;
    JTextField text,text1;
    int a,b,d;
}

class Inter extends Sets implements ActionListener
{
    void button()
    {
        button=new JButton("Click");
        button.setBounds(5, 125, 70, 30);
        button.addActionListener(this);
    }

    void hide()
    {
        frame=new JFrame("Monish");

        c=frame.getContentPane();
        c.setLayout(null);

        allLabels();
        button();
        allTexts();

        c.add(label);
        c.add(label1);
        c.add(label2);
        c.add(label3);

        c.add(button);

        c.add(text);
        c.add(text1);

        frame.setSize(500,500);
        frame.setVisible(true);
    }

    void allTexts()
    {
        text=new JTextField();
        text.setBounds(103, 12, 100, 20);

        text1=new JTextField();
        text1.setBounds(103, 52, 100, 20);
    }

    void allLabels()
    {
        label=new JLabel("Enter a Number :");
        label.setBounds(5,2,100,40);

        label1=new JLabel("Enter a Number :");
        label1.setBounds(5,43,100,40);

        label2=new JLabel("KUCH BHI");
        label2.setBounds(5,84,120,40);

        label3=new JLabel();
        label3.setBounds(5, 125, 100, 40);
    }

    public void actionPerformed(ActionEvent e)
    {
        c.setBackground(Color.CYAN);
        Actions();
    }
    public void Actions()
    {
        a=Integer.parseInt(text.getText());
        System.out.println("The entered Text is :" +a);

        b=Integer.parseInt(text1.getText());
        System.out.println("The entered Text is :" +b);

        d=a+b;

        label3.setText("The result is :" +d);
        label3.setBounds(5, 166, 100, 40);
    }
}

public class swingnumberaddition {
    public static void main(String[] args) {
        Inter in=new Inter();
        in.hide();
    }
}