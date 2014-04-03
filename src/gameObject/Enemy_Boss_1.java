package gameObject;

import java.util.LinkedList;

import game.Game;

/**
* <b>Description:</b>
* <br>
* New type of enemy boss is defined with corresponding attributes such as speed and abilites
* <br>Booss spawns at specific coordinates on grid map
* <br>Boss is unique and displayed with images corresponding to its animation
* @author Team 6
* @version 1.0
* @since 2014-03-31
*/
public class Enemy_Boss_1 extends Enemy{
	protected ImageSequence attack;
	public Enemy_Boss_1(int x, int y, Game game) {
		super(x, y, game);
		attack = new ImageSequence("/image/spriteSheet/actors/enemy/boss_1/attack",10);
		attack.setAnimationSpeed(0.5);
		run=new ImageSequence("/image/spriteSheet/actors/enemy/boss_1/run",8);
		stand=new ImageSequence("/image/spriteSheet/actors/enemy/boss_1/stand",8);
		damage=new ImageSequence("/image/spriteSheet/actors/enemy/boss_1/damage",4);		
		sequence.startSequence(stand);
		this.collisionDamage=40;
		hp=200;
		spd=10;

		ultyTimerDuration=200;
		abi1TimerDuration=30;
		abi2TimerDuration=600;
	}

	@Override
	public void useUltimate() {
		LinkedList<Point> points = ai.obtainRandomValidPoints(game.getWallArray(), 10);
		if(points.size()>0){
			for(int i=0;i<points.size();i++){
				controller.addEntity(new Projectile_ThornBall(points.get(i).getX(),points.get(i).getY(),game,this));
			}
			ultyTimer=0;
		}
		
	}

	@Override
	public void useAbility1() {
		setVelX(0);
		setVelY(0);
		sequence.startSequence(attack, stand);
		controller.addEntity(new Scissors(this.xGridNearest,this.yGridNearest,game,this));
		
	}

	@Override
	public void useAbility2() {
		int temp = rand.nextInt(3);
		if(temp==0){
			controller.addEntity(new Enemy_1_1(xGridNearest,yGridNearest,game));
		}
		else if(temp==1){
			controller.addEntity(new Enemy_1_2(xGridNearest,yGridNearest,game));
		}
		else{
			controller.addEntity(new Enemy_1_3(xGridNearest,yGridNearest,game));
		}
		game.increaseEnemyCount();
	}

	@Override
	public void useAbility3() {
		// TODO Auto-generated method stub
		
	}
	

}
