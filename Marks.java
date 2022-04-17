package com.company;

import java.awt.*;

import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

    JTextArea t1;
    JPanel p1;

    Marks(){}
    Marks(String str){
        setSize(500,600);
        setLayout(new BorderLayout());

        p1 = new JPanel();


        t1 = new JTextArea(50,15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));
        t1.setBackground(Color.CYAN);
        t1.setForeground(Color.BLUE);

        add(p1,"North");

        add(jsp,"Center");

        setLocationRelativeTo(null);
        mark(str);
    }

    public void mark(String s){
        try{
            sqlConnecter c = new sqlConnecter();

            t1.append("\tResult of Examination\n\n");
            t1.append("*****************************************************\n");
            t1.append("\tSubject\tMarks");
            t1.append("\n*****************************************************");

            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno="+s);

            int marks1 =0, marks2=0 , marks3=0 , marks4=0 , marks5=0 , total_marks=0;
            double perc = 0.0;
            if(rs2.next()){

                 marks1 = Integer.parseInt(rs2.getString("marks1"));
                 marks2 = Integer.parseInt(rs2.getString("marks2"));
                 marks3 = Integer.parseInt(rs2.getString("marks3"));
                 marks4 = Integer.parseInt(rs2.getString("marks4"));
                 marks5 = Integer.parseInt(rs2.getString("marks5"));
                 total_marks = marks1+marks2+marks3+marks4+marks5;
                 perc =(double) (total_marks*100)/500;

//                t1.append("\nMarks\n\n\t"+rs2.getString("marks1"));
//                t1.append("\n\t"+rs2.getString("marks2"));
//                t1.append("\n\t"+rs2.getString("marks3"));
//                t1.append("\n\t"+rs2.getString("marks4"));
//                t1.append("\n\t"+rs2.getString("marks5"));
//                t1.append("\n-----------------------------------------");
//

            }
            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno="+s);

            if(rs1.next()){
                t1.append("\n\t"+rs1.getString("subject1")+"\t"+marks1);
                t1.append("\n\t"+rs1.getString("subject2")+"\t"+marks2);
                t1.append("\n\t"+rs1.getString("subject3")+"\t"+marks3);
                t1.append("\n\t"+rs1.getString("subject4")+"\t"+marks4);
                t1.append("\n\t"+rs1.getString("subject5")+"\t"+marks5);
                t1.append("\n*****************************************************");
                t1.append("\n");
                t1.append("\n");
                t1.append("Total Marks\t");
                t1.append(total_marks+" / 500");
                t1.append("\n\nPercentage\t"+perc + "%");

            }



        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new Marks().setVisible(true);
    }
}