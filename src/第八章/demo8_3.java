package 第八章;
import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class demo8_3 {
	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame();
		frm.setTitle("使用JScrollPane");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//创建3个输出框，均为2行32列，并设置默认内容
		JTextArea toutpout = new JTextArea();
		toutpout.setRows(2);
		toutpout.setColumns(32);
		toutpout.setText("这是。。。。使用实例\n\r请输入一行较多的文字进行观察");

		JTextArea coutpout = new JTextArea();
		coutpout.setRows(2);
		coutpout.setColumns(32);
		coutpout.setText("这是。。。。使用实例\n\r请输入一行较多的文字进行观察");

		JTextArea boutpout = new JTextArea();
		boutpout.setRows(2);
		boutpout.setColumns(32);
		boutpout.setText("这是。。。。使用实例\n\r请输入一行较多的文字进行观察");

		//创建三个滚动面板
		JScrollPane toutputScrollPane = new JScrollPane();
		JScrollPane coutputScrollPane = new JScrollPane();
		JScrollPane boutputScrollPane = new JScrollPane();

		//为各自面板添加各自组件
		toutputScrollPane.setViewportView(toutpout);
		coutputScrollPane.setViewportView(coutpout);
		boutputScrollPane.setViewportView(boutpout);

	//为每个滚动面板设置水平和垂直显示策略
		toutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		coutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		boutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		toutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		coutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		boutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		//在窗体中添加3个滚动面板
		frm.add(toutputScrollPane,BorderLayout.NORTH);
		frm.add(coutputScrollPane,BorderLayout.CENTER);
		frm.add(boutputScrollPane,BorderLayout.SOUTH);

		//设置结构（JFrame）的位置与大小并显示
		frm.setBounds(450,230,400,180);
		frm.setVisible(true);
	}
}
