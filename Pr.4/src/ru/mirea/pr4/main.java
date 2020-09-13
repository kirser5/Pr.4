package ru.mirea.pr4;

import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    int milanS=0;
    int madridS=0;
    JButton n1=new JButton("AC Milan");
    JButton n2=new JButton("Real Madrid");
    JLabel t1=new JLabel("Result 0 X 0");
    JLabel t2=new JLabel("Last Scorer:N/A");
    JLabel t3=new JLabel("Winner:N/A");
    void printR() {
        t1.setText(String.format("Result: %d X %d",milanS, madridS));
        if (milanS > madridS) t3.setText("Winner AC Milan");
        if (milanS < madridS) t3.setText("Winner Real Madrid");
        else t3.setText("Winner: Draw");

    }
    public Main(){
        super ("Match result");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(150,150);
        setLayout(new FlowLayout());
        add(n1);
        add(n2);
        add(t1);
        add(t2);
        add(t3);
        n1.addActionListener(ae -> {
            milanS++;
            t2.setText("Last Scorer AC Milan");
            printR();
        });

        n2.addActionListener(ae -> {
            madridS++;
            t2.setText("Last Scorer Real Madrid");
            printR();
        });
    }
    public static void main(String[] args){
        new Main().setVisible(true);
    }
}