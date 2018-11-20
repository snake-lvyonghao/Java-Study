package 第八章;

import javax.swing.*;
import java.awt.*;


public class demo8_实验1{
    public static void main(String[] args)
    {
        RunCircle1 main=new RunCircle1();
        main.setVisible(true);
        main.setBounds(50, 50, 800, 600);
        Thread thread=new Thread(main);
        thread.start();
    }
}

class RunCircle1 extends JFrame implements Runnable{
    int x=350;
    int y=200;
    int width=50;
    int height=50;
    boolean xAdd=true;
    boolean yAdd=true;
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, width, height);
    }
    int i=1;

    public void run()
    {
        while(true)
        {
            if(yAdd)
                y+=15;
            else
                y-=15;
            if(y>=this.getHeight()-height||y<=25)
                yAdd=!yAdd;
            repaint();
            try
            {
                Thread.sleep(200);
                i++;
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
