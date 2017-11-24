package Chapter5_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUIExam2 extends JFrame implements ActionListener {
    private JButton button;

    public GUIExam2(){
        button = new JButton("Click me");
        add(button);
        button.addActionListener(this);
        button.setActionCommand("dog");
    }

    Color[] colors = {
            Color.YELLOW,
            Color.RED,
            Color.WHITE,
            Color.CYAN,
            Color.GREEN,
            Color.orange
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("dog!");
            button.setForeground(Color.RED);
            button.setBackground(colors[new Random().nextInt(5)]);
            button.setToolTipText("Click to change Color!");
        }
    }

    public static void main(String[] args) {
        GUIExam2 exam2 = new GUIExam2();
        exam2.setSize(400,400);
        exam2.setVisible(true);
        exam2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
