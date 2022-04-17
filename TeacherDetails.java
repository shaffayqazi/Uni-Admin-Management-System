package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TeacherDetails extends JFrame implements ActionListener{

    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","CGPA", "House No","Education","Department", "Employee Id"};
    String y[][] = new String[20][12];
    int i=0, j=0;

    TeacherDetails(){
        super("Teacher Details");
        setSize(1260,650);
        setLocationRelativeTo(null);
        setLayout(null);

        l1 = new JLabel("Enter Employee id to delete Teacher : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);

        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);

        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        add(b1);

        l2 = new JLabel("Add New Teacher");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);

        b2 = new JButton("Add");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        add(b2);

        l3 = new JLabel("Update Teacher Details");
        l3.setBounds(50,490,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);

        b3 = new JButton("Update");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 490, 150 ,30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        try{
            sqlConnecter c1  = new sqlConnecter();
            String s1 = "select * from teacher";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fName");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("cgpa");
                y[i][j++]=rs.getString("houseNo");
                y[i][j++]=rs.getString("education");
                y[i][j++]=rs.getString("department");
                y[i][j++]=rs.getString("empId");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);

        }catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);

        getContentPane().setBackground(Color.WHITE);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){

         sqlConnecter c1 = new sqlConnecter();

        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from teacher where empId = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new TeacherDetails().setVisible(true);
            }catch(Exception e){}

        }else if(ae.getSource() == b2){
            new AddTeacherData().frame.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            new AddTeacherData();
            this.setVisible(false);
        }

    }
    public static void main(String[] args){
        new TeacherDetails().setVisible(true);
    }

}

