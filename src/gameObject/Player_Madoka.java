package gameObject;

import menu.MenuChar;
import system.GameSystem;
import system.IntToImage;
import game.Game;
import game.Game.CHARACTER;

/**
* <b>Description:</b>
* <br>
* Defines new individual player
* <br>Utilizes unique image to display player
* <br>Corresponds to input coordinates of grid map
* <br>Contains features such as sound and abilites
* @author Team 6
* @version 1.0
* @since 2014-03-31
*/
public class Player_Madoka extends Player{

	public Player_Madoka(int x, int y, Game game) {
		super(x, y, game);
		playerBackground = MenuChar.mdBg;
		
		pVoice=new MdVoice();
		name="Madoka";
		skillUlt=loader.loadImage("/image/skills/mdSkill1.png");
		
		
		//standGif=loader.loadGif("/image/spriteSheet/mdStand3.gif");
		//ssWidth=38;
		//ssHeight=50;
		//this.renderYShift=-10;
		/*
		ss=SpriteData.mdRunning;
		ssWidth=36;
		ssHeight=48;
		ssX=1;
		ssY=1;
		collisionWidth=32;
		collisionHeight=32;
		frames=8;
		*/
		
		
		soulGemSprite=SpriteData.gem_madoka;
		soulGemImage=soulGemSprite.grabImage(1, 1, soulGemWidth, soulGemHeight);
		
		status = SpriteData.mdStatus;
		setStatusImages();
		
		if(Game.cChosen==CHARACTER.MADOKA){
			pData.loadPlayerStatus(this);
		}
		levelImage=IntToImage.toImageSmall(level);
		soulGemValueImage=IntToImage.toImageGriefSyndrome((int)soul);
		maxHp=hp;
		maxMp=mp;
		maxSoul=soul;
		// TODO Auto-generated constructor stub
		
		run=new ImageSequence("/image/spriteSheet/actors/player/madoka/run",8);
		stand=new ImageSequence("/image/spriteSheet/actors/player/madoka/stand",8);
		stand.scale(1.25);
		//stand.setY(stand.getY()+10);
		damage=new ImageSequence("/image/spriteSheet/actors/player/madoka/damage",4);
		dead=new ImageSequence("/image/spriteSheet/actors/player/madoka/dead",11);
		sequence.startSequence(stand);
		
		ultyCd = 60;
		ultyTimer=60;
		
	}
	
	public void useUltimate(){
		if(ultyTimer<ultyCd){
			GameSystem.playError();
			this.pVoice.playCdSound();
			return;
		}
		if(this.mp>50){
			game.getController().addEntity(new Projectile_PinkArrow(xGridNearest,yGridNearest,game,this));
			mp-=50;
		}
	}
	public void useAbility1(){
		
	}
	
	public void updatePlayerData(){
		pData.upDatePlayerData(this);
	}

	@Override
	public void useAbility2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void useAbility3() {
		// TODO Auto-generated method stub
		
	}
}
