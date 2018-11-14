package 第八章;
import javax.swing.*;
import java.awt.*;

public class demo8_2 {
	public static void main(String args[]) {
		JFrame frm = new JFrame("使用JPanel");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		frm.add(topPanel,BorderLayout.NORTH);
		
		JLabel show = new JLabel();
		
		show.setText("请输入姓名：");
		
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(20);

		JButton myBtn = new JButton("提交");

        //添加显示标签，输入框，和按钮
		topPanel.add(show);
		topPanel.add(input);
		topPanel.add(myBtn);

		//创建面板下半部分
		JPanel bottomPanel = new JPanel();
		frm.add(bottomPanel,BorderLayout.CENTER);

		//创建提示标签
		JLabel againshow = new JLabel();
		againshow.setText("显示输入所有的姓名");

		//创建输出框
		JTextArea output = new JTextArea();
		output.setRows(5);
		output.setColumns(32);
		output.setEditable(false);

		//添加提示标签和输出框
		bottomPanel.add(againshow);
		bottomPanel.add(output);

		//设置窗体位置和大小并显示
		frm.setBounds(400,200,400,200);
		frm.setVisible(true);
		}
}
