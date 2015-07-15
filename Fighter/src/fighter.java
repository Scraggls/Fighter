import java.util.Random;
public class fighter {

	//private String attack = "Attack";
	//private String heal = "Heal";
	private int health = 100;
	private int healButton = 10;
	public String type;
	Random playerRand = new Random();                   
	int rnd = playerRand.nextInt(26);
	
	Random enemyRand = new Random();                   
	int random = playerRand.nextInt(26);
	
	public Random getRand() {
		return playerRand;
	}
	public Random getPlayerRand() {
		return playerRand;
	}
	public void setPlayerRand(Random playerRand) {
		this.playerRand = playerRand;
	}
	public Random getEnemyRand() {
		return enemyRand;
	}
	public void setEnemyRand(Random enemyRand) {
		this.enemyRand = enemyRand;
	}
	public int getRandom() {
		return random;
	}
	public void setRandom(int random) {
		this.random = random;
	}
	public void setRand(Random rand) {
		this.playerRand = rand;
	}
	public int getRnd() {
		return rnd;
	}
	public void setRnd(int rnd) {
		this.rnd = rnd;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	//add health to player
	public int getHealButton() {
		return healButton;
	}
	public void setHealButton(int healButton) {
		this.healButton = healButton;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	



}
