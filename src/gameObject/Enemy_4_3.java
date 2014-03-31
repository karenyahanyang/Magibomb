package gameObject;

import game.Game;

public class Enemy_4_3 extends Enemy_4{

	public Enemy_4_3(int x, int y, Game game) {
		super(x, y, game);
		run=new ImageSequence("/image/spriteSheet/actors/enemy/enemy_4_3/run",6);
		stand=new ImageSequence("/image/spriteSheet/actors/enemy/enemy_4_3/stand",6);	
		attack=new ImageSequence("/image/spriteSheet/actors/enemy/enemy_4_3/attack",9);	
		open=new ImageSequence("/image/spriteSheet/actors/enemy/enemy_4_3/open",4);	
		sequence.startSequence(stand);
		canMove=false;
	}

	@Override
	public void useUltimate() {
		// TODO Auto-generated method stub
		
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
