import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
  public void paint(Graphics g)
  {
    g.setColor(Color.black);
    g.drawOval(100,100,400,400);
    g.drawLine(300,150,300,300);
    g.drawLine(300,300,400,300);

    g.setFont(Font.decode("Arial-30"));

    double x = 0;
    double y = 0;

    for ( int n=1; n <= 12; n += 1 )
    {
      x = 295 + 150*Math.cos(0.525 * n);
      y = 300 + 150*Math.sin(0.525 * n);
      if (n > 9)
        g.drawString( String.valueOf(n-9), (int) x, (int) y );
      else
        g.drawString( String.valueOf(n+3), (int) x, (int) y );

      System.out.println("n = " + n + ", x-coord = " + x + ", y-coord =" + y);
      System.out.println("(int) x = " + (int) x + ", (int) y = " + (int) y);
    }

    // // labels
    // g.setColor(Color.black);
    // g.setFont(new Font(null));
    // for ( int X=0; X<800; X += 50 )
    //     g.drawString( String.valueOf(X), X, 50 );
    // for ( int Y=100; Y<600; Y += 50 )
    //     g.drawString( String.valueOf(Y), 28, Y );
    // // lines
    // g.setColor(Color.lightGray);
    // for ( int X=0; X<800; X += 50 )
    //     g.drawLine(X,0,X,599);    // horizontal
    // for ( int Y=0; Y<600; Y += 50 )
    //     g.drawLine(0,Y,799,Y);    // vertical

  }
  public static void main(String[] args)
  {
    JFrame win = new JFrame("Clock Face");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ClockFace canvas = new ClockFace();
    win.add(canvas);
    win.setVisible(true);
  }
}
