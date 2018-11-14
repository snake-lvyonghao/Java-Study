package 第八章;
import java.awt.event.*;
import javax.swing.*;

public class demo_12 {
    public static void main(String[] args){
        JFrame frm = new JFrame("深入掌握事件处理");
        frm.setLayout(null);

        JLabel labell = new JLabel("请在窗体内移动鼠标，");
        labell.setBounds(15,5,20,25);
        frm.add(labell);
        JLabel labe12 = new JLabel("或按住鼠标左键拖动鼠标");
        labe12.setBounds(15,5,20,25);
        frm.add(labe12);

        //创建文本框对象
        JTextField text = new JTextField(30);
        text.setBounds(15,55,200,30);
        frm.getContentPane().add(text);

        //注册监听器，参数为事件处理者对象
        MouseListenerImp mouse = new MouseListenerImp(text);
        frm.addMouseListener(mouse);
        frm.addMouseListener(mouse);
        frm.addWindowListener(mouse);

        frm.setBounds(500,250,250,150);
        frm.setVisible(true);
    }
}
class MouseListenerImp implements MouseMotionListener,MouseListener,
        WindowListener{
    JTextField text;

    public MouseListenerImp(JTextField text){
        this.text = text;
    }

    public void mouseDragged(MouseEvent e){
        String s = "拖拽鼠标，坐标：X=" + e.getX() + ",Y=" + e.getY();
        text.setText(s);
    }

    public void mouseEntered(MouseEvent e){
        String s = "鼠标进入了窗体";
        text.setText(s);
    }

    public void mouseExited(MouseEvent e){
        String s = "鼠标离开了窗体";
        text.setText(s);
    }

    public void windowClosing(WindowEvent e){
        //为了能使窗口正常关闭，程序正常退出
        System.exit(1);
    }

    //不打算实现的方法，方法体为空即可
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent arg0){}
    public void windowDeactivated(WindowEvent arg0){}
}