import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame
	implements ActionListener
{
  private EasySound rooster;
  private EasySound cow;
  private int time;

  public Morning()
  {
	  super ("Morning");
	  rooster = new EasySound("roost.wav");
	  cow = new EasySound("moo.wav");
	  time = 0;
	  Timer clock = new Timer(5000, this);  
	    clock.start();	    
  }
  public void actionPerformed(ActionEvent e)
  {
    time++;
    if (time%2 == 0){
		  rooster.play();
		  Container c = getContentPane();
		  c.setBackground(Color.WHITE);
	}else if (time%2 == 1){
		  cow.play();
		  Container c = getContentPane();
		  c.setBackground(Color.BLACK);
	  }
    repaint();
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
