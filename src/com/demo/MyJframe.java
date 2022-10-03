package com.demo;

import javax.swing.*;
import java.awt.*;

class MyJframe extends JFrame {
    public MyJframe(){


        MyJpanel myJpanel = new MyJpanel();
        myJpanel.setBackground(Color.white);

        getContentPane().add(myJpanel);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("系统");
        JMenuItem item = new JMenuItem("重新开始");
        JMenuItem item2 = new JMenuItem("悔棋");
        JMenuItem item3 = new JMenuItem("退出");
        menu.add(item);
        menu.add(item2);
        menu.add(item3);
        bar.add(menu);

        setJMenuBar(bar);

        //工具面板
        JPanel toolbar = new JPanel();
        //三个按钮
        JButton button1 = new JButton("重新开始");
        JButton button2 = new JButton("悔棋");
        JButton button3 = new JButton("退出");
        //使用FlowLayout布局
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
        //添加按钮
        Component component = toolbar.add(button1);
        System.out.println(component==button1);
        toolbar.add(button2);
        toolbar.add(button3);

        add(toolbar, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        setTitle("单机版五子棋");
        setBackground(Color.black);
//        setSize(1000,1000);
        setBounds(100,100,700,700);
    }
}


