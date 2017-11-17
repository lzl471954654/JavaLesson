package Chapter5_GUI;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        JButton button = new JButton("Say Hello");
        frame.setSize(500,500);
        button.setSize(100,100);
        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ShowGridLayout showFlowLayout = new ShowGridLayout();
        showFlowLayout.setVisible(true);

        TestPanels panels = new TestPanels();
        panels.setVisible(true);
    }
}

class ShowFlowLayout extends JFrame{
    public ShowFlowLayout(){
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(new JLabel("账户"));
        add(new JTextField(8));
        add(new JLabel("密码"));
        add(new JTextField(8));
        setSize(500,500);
    }
}

class ShowGridLayout extends JFrame{
    public ShowGridLayout(){
        setLayout(new GridLayout(3,2,5,5));
        add(new JLabel("账户"));
        add(new JTextField(8));
        add(new JLabel("密码"));
        add(new JTextField(8));
        add(new JLabel("验证码"));
        add(new JTextField(4));
        setSize(500,500);
    }
}

class TestPanels extends JFrame{
    public TestPanels(){
        setSize(500,500);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));
        for (int i = 1;i<10;i++){
            panel.add(new JButton(Integer.toString(i)));
        }
        panel.add(new JButton(Integer.toString(0)));
        panel.add(new JButton("start"));
        panel.add(new JButton("stop"));
        //add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.add(new JTextField("Time"),BorderLayout.NORTH);
        panel1.add(panel,BorderLayout.CENTER);
        add(panel1,BorderLayout.WEST);
        add(new JButton("Food"),BorderLayout.CENTER);
    }
}
