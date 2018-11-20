package 第八章;

import java.awt.*;
import javax.swing.*;


public class demo8_实验{
    public static void main(String[] args)
    {
        RunCircle main=new RunCircle();
        main.setVisible(true);
        main.setBounds(50, 50, 800, 600);
        Thread thread=new Thread(main);
        thread.start();
    }
}

class RunCircle extends JFrame implements Runnable{
    int x=300;
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
            if(xAdd)
                x+=15;
            else
                x-=15;
            if(x>=this.getWidth()-width||x<=25)
                xAdd=!xAdd;
            repaint();
            try
            {
                Thread.sleep(400);
                i++;
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
