import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Triangleareausingswing extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4;
 JTextField t1,t2;
 JButton b1; 
 Triangleareausingswing()
 {  
  l1=new JLabel("Enter the base of triangle");
  l2=new JLabel("Enter the height of triangle");
  l3=new JLabel("Result");
  l4=new JLabel("");
  t1=new JTextField(14);
  t2=new JTextField(14);
  b1=new JButton("Calculate");
  
  add(l1);add(t1);
  add(l2);add(t2);
  add(b1);
  add(l3);
  add(l4);
  b1.addActionListener(this);
  setSize(400,400);
  setVisible(true);
  setLayout(new FlowLayout());
  setTitle("Area of Triangle");
  setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent ae)
 {
  int a=Integer.parseInt(t1.getText());
  int b=Integer.parseInt(t2.getText());  
  double result=0;
  if(ae.getSource()==b1)
  {
   result=(0.5)*a*b;
   l4.setText(""+result);
  }
  else
  {
   t1.setText("");
   t2.setText("");
   l4.setText("");
  }
 }
 public static void main(String ar[])
 {
  new Triangleareausingswing();
 }
}