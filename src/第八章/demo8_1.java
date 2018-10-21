package 第八章;
import javax.swing.*;
import java.awt.*;
public class demo8_1 {
    public static void main(String[] args){
        JFrame frm = new JFrame();

        //设置标题
        frm.setTitle("理解GUI编程");
        //设置布局
        frm.setLayout(new BorderLayout());
        //设置按钮
        JButton myBtn = new JButton("按钮");
        //将按钮组件对象添加到容器中
        frm.add(myBtn);

        //该示例未显示事件

        //设置窗口初始位置和大小并显示
        frm.setBounds(500,200,200,100);
        //设置窗体关闭方式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //让窗体显示
        frm.setVisible(true);
    }
}
