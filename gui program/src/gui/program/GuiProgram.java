package gui.program;
import javax.swing.*;
import java.awt.*;

class panel extends JPanel{
    public void paintComponent (Graphics g){
        this.setBackground(Color.WHITE);
        g.setColor(Color.RED);
        g.drawLine(5, 30, 380, 30);
        g.setColor(Color.BLUE);
        g.drawRect(5, 40, 90, 55);
        g.fillRect(100, 40, 90, 55);
        g.setColor(Color.CYAN);
        g.fillRoundRect(195, 40, 90, 55, 50, 50);
        g.drawRoundRect(290, 40, 90, 55, 20, 20);
        g.setColor(Color.GREEN);
        g.draw3DRect(5, 100, 90, 55, true);
        g.fill3DRect(100, 100, 90, 55, false);
        g.setColor(Color.MAGENTA);
        g.drawOval(195, 100, 90, 55);
        g.fillOval(290, 100, 90, 55);
    }
}
public class GuiProgram {

    public static void main(String[] args) {
        JFrame f= new JFrame ("Example");
        f.setVisible(true);
        f.setSize(400,210);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel p= new panel();
        f.add(p);
        
    }
    
}
