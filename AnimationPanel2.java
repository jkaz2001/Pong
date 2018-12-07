import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel2 extends JPanel{
	// Properties
	int intBallX = 100;
	int intBallY = 100;
	boolean blnGoDown = false;
	boolean blnGoUp = false;
	boolean blnGoLeft = false;
	boolean blnGoRight = false;
	
	// Methods
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,0,1280,720);
		g.setColor(Color.YELLOW);
		g.fillOval(intBallX, intBallY, 20, 20);
		//intBallX = intBallX + 1;
		if(blnGoDown){
			intBallY++;
		}
		if(blnGoUp){
			intBallY--;
		}
		if(blnGoLeft){
			intBallX--;
		}
		if(blnGoRight){
			intBallX++;
		}
	}
	
	// Constructor
	public AnimationPanel2(){
		super();
	}
}
