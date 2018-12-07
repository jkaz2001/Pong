import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class animationprogram2 implements ActionListener, KeyListener, MouseMotionListener{
	// Properties
	JFrame theframe;
	AnimationPanel2 thepanel;
	Timer thetimer;
	
	// Methods
	public void mouseMoved(MouseEvent evt){
		thepanel.intBallX = evt.getX();
		thepanel.intBallY = evt.getY();
	}
	public void mouseDragged(MouseEvent evt){
		
	}
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == thetimer){
			thepanel.repaint();
		}
	}
	
	public void keyReleased(KeyEvent evt){
		//System.out.println("Key Released");
		if(evt.getKeyCode() == 37){
			thepanel.blnGoLeft = false;
		}else if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = false;
		}else if(evt.getKeyCode() == 39){
			thepanel.blnGoRight = false;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = false;
		}
	}
	public void keyPressed(KeyEvent evt){
		//System.out.println("Key Pressed");
		// 37 left 
		// 38 up
		// 39 right
		// 40 down
		//System.out.println(evt.getKeyCode());
		if(evt.getKeyCode() == 37){
			thepanel.blnGoLeft = true;
		}else if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = true;
		}else if(evt.getKeyCode() == 39){
			thepanel.blnGoRight = true;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = true;
		}
	}
	public void keyTyped(KeyEvent evt){
		//System.out.println("Key Typed");
		/*
		if(evt.getKeyChar() == 'w'){
			thepanel.intBallY = thepanel.intBallY - 5;
		}
		else if(evt.getKeyChar() == 's'){
			thepanel.intBallY = thepanel.intBallY + 5;
		}
		else if(evt.getKeyChar() == 'a'){
			thepanel.intBallX = thepanel.intBallX - 5;
		}
		else if(evt.getKeyChar() == 'd'){
			thepanel.intBallX = thepanel.intBallX + 5;
		}
		*/
	}
	
	// Constructor
	public animationprogram2(){
		theframe = new JFrame("Animation with keyboard and mouse");
		thepanel = new AnimationPanel2();
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1280, 720));
		thepanel.addMouseMotionListener(this);
		
		theframe.addKeyListener(this);
		theframe.setContentPane(thepanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
				
		thetimer = new Timer(1000/60, this);
		thetimer.start();
	}
	
	// Main Method
	public static void main(String[] args){
		new animationprogram2();
	}





}
