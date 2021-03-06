package gameObject;

import game.Game;

/**
* <b>Description:</b>
* <br>
* Defines PowerUp based on coordinate and effect on player
* @author Team 6
* @version 1.0
* @since 2014-03-31
*/
public class PowerUps_HpUp extends PowerUps{
	/**
	 * defines power ups
	 * @param coordinates, game object
	 * @return power up hp up
	 */
	public PowerUps_HpUp(int x, int y, Game game) {
		super(x, y, game);
		ss = SpriteData.upgrades;
		image = ss.grabImage(10,14,ssWidth,ssHeight);
	}

	@Override
	/**
	 * increases hp by 20
	 * @param player object
	 * @return applies effect
	 */
	public void applyEffect(Player player) {
		player.hp+=20;
	}

}
