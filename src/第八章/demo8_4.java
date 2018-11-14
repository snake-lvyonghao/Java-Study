package 第八章;
import javax.swing.*;
public class demo8_4 {
    public static void main(String[] args){
        //创建窗体设置窗体标题和窗体关闭方式
        JFrame frm = new JFrame();
        frm.setTitle("带滚动条的窗体");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //创建一个5行32列的文本框，并设置默认内容
        JTextArea ta = new JTextArea();
        ta.setRows(5);
        ta.setColumns(32);
        ta.setText("5行32列的文本框");

        //创建一个按钮
        JButton btn = new JButton("按钮");

        //创建一个放置组件的面板，并添加文本框和按钮
        JPanel p = new JPanel();
        p.add(ta);
        p.add(btn);

        //创建滚动面板，并设置上面的创建的面板为组件
        JScrollPane sp = new JScrollPane();
        sp.setViewportView(p);
        //将滚动面板设置为窗体的内容面板
        frm.setContentPane(sp);

        frm.setBounds(450,230,300,150);
        frm.setVisible(true);
    }
}
