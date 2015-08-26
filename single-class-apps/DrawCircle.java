import java.awt.*;
import javax.swing.JFrame;

public class DrawCircle extends Canvas
{
  public void paint(Graphics g)
  {
    g.setColor(Color.green);
    g.fillOval(50,50,50,50);
  }
  public static void main(String[] args)
  {
    JFrame win = new JFrame("One singular circle");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    DrawCircle canvas = new DrawCircle();
    win.add(canvas);
    win.setVisible(true);
  }
}
