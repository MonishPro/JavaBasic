import javax.swing.*;
import java.awt.*;

public class ProgressBar {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Monish");
        frame.setLayout(new FlowLayout());
        JProgressBar bar=new JProgressBar(0,100);
        frame.add(bar);
        bar.setStringPainted(true);
        frame.setSize(400,400);
        frame.setVisible(true);
       // bar.setOrientation(SwingConstants.VERTICAL);
        //I used this Orientation Keyword only just to make the progress bar Verticle,If you want to keep it Horizontal then dont use 
        //this Syntax 
        for(int i=0;i<=100;i++)
        {
            bar.setValue(i);
            //Your Throughput is usually fast so this below Syntax helps you to reduce the Throughput
            //The Loop Executed very Fast so I use this Thread class to slow the Throughput 
            try {
                i=i+1;
                Thread.sleep(500);
               
            } catch (Exception e) {
        }
        

    }
}
}

