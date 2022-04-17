package com.company;

import javax.swing.*;
import java.awt.*;

public class StudentFeeStructure extends JFrame{

    JLabel l1,l2,l3,l4,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb13,bb14,bb17,bb18;
    JLabel crp7, crp8, bs7, bs8;

    public StudentFeeStructure(){

        setTitle("View Fee Structure");
        setSize(850,680);
        setLocationRelativeTo(null);
        setLayout(null);

        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(250,10,400,70);
        add(i1);

        l1 = new JLabel("Program");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        add(l1);



        // Semester
        l10 = new JLabel("Semester 1");
        l10.setBounds(80,180,150,40);
        l10.setFont(new Font("serif",Font.BOLD,20));
        add(l10);

        l11 = new JLabel("Semester 2");
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,20));
        add(l11);

        l12 = new JLabel("Semester 3");
        l12.setBounds(80,300,150,40);
        l12.setFont(new Font("serif",Font.BOLD,20));
        add(l12);

        l13 = new JLabel("Semester 4");
        l13.setBounds(80,360,150,40);
        l13.setFont(new Font("serif",Font.BOLD,20));
        add(l13);

        l14 = new JLabel("Semester 5");
        l14.setBounds(80,420,150,40);
        l14.setFont(new Font("serif",Font.BOLD,20));
        add(l14);

        l15 = new JLabel("Semester 6");
        l15.setBounds(80,480,150,40);
        l15.setFont(new Font("serif",Font.BOLD,20));
        add(l15);

        l16 = new JLabel("Semester 7");
        l16.setBounds(80,540,150,40);
        l16.setFont(new Font("serif",Font.BOLD,20));
        add(l16);

        l17 = new JLabel("Semester 8");
        l17.setBounds(80,600,150,40);
        l17.setFont(new Font("serif",Font.BOLD,20));
        add(l17);


        // BE Fee

        l2 = new JLabel("BE");
        l2.setBounds(280,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        add(l2);

        b1 = new JLabel("Rs 43000");
        b1.setBounds(280,180,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,20));
        add(b1);

        b2 = new JLabel("Rs 43000");
        b2.setBounds(280,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,20));
        add(b2);

        b3 = new JLabel("Rs 43000");
        b3.setBounds(280,300,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,20));
        add(b3);

        b4 = new JLabel("Rs 43000");
        b4.setBounds(280,360,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,20));
        add(b4);

        b5 = new JLabel("Rs 43000");
        b5.setBounds(280,420,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,20));
        add(b5);

        b6 = new JLabel("Rs 43000");
        b6.setBounds(280,480,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,20));
        add(b6);

        b7 = new JLabel("Rs 43000");
        b7.setBounds(280,540,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,20));
        add(b7);

        b8 = new JLabel("Rs 43000");
        b8.setBounds(280,600,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,20));
        add(b8);


        // BS Fee

        l3 = new JLabel("BS");
        l3.setBounds(480,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,26));
        add(l3);

        bb1 = new JLabel("Rs 32000");
        bb1.setBounds(480,180,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,20));
        add(bb1);

        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(480,240,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,20));
        add(bb2);

        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(480,300,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,20));
        add(bb3);

        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(480,360,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,20));
        add(bb4);

        bb17 = new JLabel("Rs 32000");
        bb17.setBounds(480,420,100,40);
        bb17.setFont(new Font("serif",Font.PLAIN,20));
        add(bb17);

        bb18 = new JLabel("Rs 32000");
        bb18.setBounds(480,480,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,20));
        add(bb18);

        bs7 = new JLabel("Rs 32000");
        bs7.setBounds(480,540,100,40);
        bs7.setFont(new Font("serif",Font.PLAIN,20));
        add(bs7);

        bs8 = new JLabel("Rs 32000");
        bs8.setBounds(480,600,100,40);
        bs8.setFont(new Font("serif",Font.PLAIN,20));
        add(bs8);


        // CRP Fee

        l4 = new JLabel("B-CRP");
        l4.setBounds(680,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,26));
        add(l4);

        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(680,180,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,20));
        add(bb5);

        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(680,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,20));
        add(bb6);

        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(680,300,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,20));
        add(bb7);

        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(680,360,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,20));
        add(bb8);

        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(680,420,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,20));
        add(bb13);

        bb14 = new JLabel("Rs 25000");
        bb14.setBounds(680,480,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,20));
        add(bb14);

        crp7 = new JLabel("Rs 25000");
        crp7.setBounds(680,540,150,40);
        crp7.setFont(new Font("serif",Font.PLAIN,20));
        add(crp7);

        crp8 = new JLabel("Rs 25000");
        crp8.setBounds(680,600,150,40);
        crp8.setFont(new Font("serif",Font.PLAIN,20));
        add(crp8);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args){
        new StudentFeeStructure().setVisible(true);
    }
}
