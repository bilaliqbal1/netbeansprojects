package cicleandrectanglegui;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Shapes extends JPanel
 {
 private int choice; // user's choice of which shape to draw
 // constructor sets the user's choice
 public Shapes(int userChoice)
 {
 choice = userChoice;
 }

 // draws a cascade of shapes starting from the top-left corner
 public void paintComponent(Graphics g)
 {
 super.paintComponent(g);

 for (int i = 0; i < 10; i++)
 {
 // pick the shape based on the user's choice
 switch (choice)
 {
 case 1: // draw rectangles
    g.drawRect(10 + i * 10, 10 + i * 10,
    50 + i * 10, 50 + i * 10);
 break;
 case 2: // draw ovals
    g.drawOval(10 + i * 10, 10 + i * 10,
    50 + i * 10, 50 + i * 10);
 break;


 // end class Shapes
//Fig. 5.27 | Drawing a cascade of shapes based on the user’s choice.
 
 }
 }
 }
}
 
public class Shapes {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangle\n"+"Enter 2 to draw circle");
        int choice = Integer.parseInt(input);
        Shapes panel = new Shapes(choice);
        
    }
    
}
