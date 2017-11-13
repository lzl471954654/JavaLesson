package Chapter3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Main {

    public static void main(String[] args) {
        new Function();
    }
}

class Function extends JFrame {
    private static final double WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private static final double HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private static final int INCREMENT = 20;

    public Function() {
        this.setTitle("画图像sinx/x");
        this.setLocation(50, 50);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Color source = g2d.getColor();

        g2d.setColor(Color.BLACK);
        g2d.drawString("sinx/x 的图像", 50, 50);


        // 画 X 轴
        g2d.drawLine(INCREMENT, (int) HEIGHT / 2, (int) WIDTH - INCREMENT, (int) HEIGHT / 2);
        g2d.drawLine((int) WIDTH - INCREMENT, (int) HEIGHT / 2, (int) WIDTH - 10, (int) HEIGHT / 2 - 5);
        g2d.drawLine((int) WIDTH - INCREMENT, (int) HEIGHT / 2, (int) WIDTH - 10, (int) HEIGHT / 2 + 5);


        // 画 Y 轴
        g2d.drawLine((int) WIDTH / 2, 40, (int) WIDTH / 2, (int) HEIGHT - 50);
        g2d.drawLine((int) WIDTH / 2, 40, (int) WIDTH / 2 - 10, 50);
        g2d.drawLine((int) WIDTH / 2, 40, (int) WIDTH / 2 + 10, 50);

        // 将当前画笔移动到中心
        g2d.translate((int) WIDTH / 2, (int) HEIGHT / 2);

        // 利用GeneralPath类来画曲线
        GeneralPath gp = new GeneralPath();

        // 将GeneralPath的实例gp的画笔移动到当前画面的中心，但是这个点是相对于g2d画笔的中心的
        gp.moveTo(0, 0);

        // sin(x)的图像
        drawSinx(gp, g2d);
        g2d.setColor(source);
    }

    private void drawSinx(GeneralPath gp, Graphics2D g2d) {
        for (double i = 0.000001; i <= 8 * Math.PI; i += 0.0001 * Math.PI) {
            gp.lineTo(20 * i, 100 * -Math.sin(i));
        }
        g2d.draw(gp);
        g2d.rotate(Math.PI);
        g2d.draw(gp);
    }


}
