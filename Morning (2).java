import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame
	implements ActionListener
{
  private EasySound rooster;
  private int time;

  public Morning()
  {
	  super ("Morning");
	  rooster = new EasySound("roost.wav");
	    Container c = getContentPane();
	    c.setBackground(Color.WHITE);
	  time = 0;
	  Timer clock = new Timer(5000, this);  
	    clock.start();
	    
  }
  public void playSound()
  {
	  int x = 120*((time%2)+1);
	  if (x <= 120){
		  rooster.play(); 
	  }
  }
  public void actionPerformed(ActionEvent e)
  {
    time++;
    if (time%2==0) rooster.play();
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
