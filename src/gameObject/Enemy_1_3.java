package gameObject;

import game.Game;

public class Enemy_1_3 extends Enemy{

	public Enemy_1_3(int x, int y, Game game) {
		super(x, y, game);
		run=new ImageSequence("/image/spriteSheet/actors/enemy/enemy_1_3/run",9);
		stand=new ImageSequence("/image/spriteSheet/actors/enemy/enemy_1_3/stand",9);	
		sequence.startSequence(stand);
	}

	@Override
	public void useUltimate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void useAbility1() {
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
