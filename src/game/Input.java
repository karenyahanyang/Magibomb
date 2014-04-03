package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import system.GameSystem;

/**
* <b>Description:</b>
* <br>
* Defines Input class that extends KeyAdapter
* @author Team 6
* @version 1.0
* @since 2014-03-31
*/
public class Input extends KeyAdapter{
	GameSystem sys;
	
	public Input(GameSystem sys){
		this.sys = sys;
	}
	
	public void keyPressed(KeyEvent e){
		sys.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e){
		sys.keyReleased(e);
	}
	
}
