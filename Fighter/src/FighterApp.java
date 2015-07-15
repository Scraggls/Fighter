import java.util.Random;

/**
 * 
 */

/**
 * @author CraigMcGarry
 *
 */
public class FighterApp {
	static String[] enemyType = new String[]{"Orc","Troll","Grunt","Zelot","Dead Shot","Killer Croc"}; 
	static Random randomEnemyType = new Random();
	private String attack;
	private String heal;
	private static int health = 100;
	private int healButton = 10;
	static Random playerRand = new Random();                   
	static int rnd = playerRand.nextInt(30); // Declares random number

	static Random enemyRand = new Random();                   
	static int rand = playerRand.nextInt(26); // Declares random number


	public static void main(String[] args) {
		//player
		fighter player =new fighter();
		//enemy
		fighter enemy = new fighter();

		//setting player health and attack damage


		player.setHealth(health);
		System.out.println("\nYour health "+health);
		//Setting attract damage randomly
		player.setRnd(rnd);
		System.out.println("players attack damage: " + rnd + " dps");
		System.out.println("Health left " + (health - rand));

		//setting enemy health and enemy type
		String temp =enemyType[randomEnemyType.nextInt(6)];
		System.out.println("\nEnemy: "+temp + "!");
		enemy.setHealth(health);
		if(temp =="Troll" ){
			health = 150;
			System.out.println("Troll has 50 extra hp");
		}if(temp =="Killer Croc"){
			health = 150;
			System.out.println("Killer Croc has 50 extra hp");
		}
		System.out.println(temp+ "`s health: "+ health);
		enemy.setRandom(rand);
		System.out.println("Enemy`s attack damage: " + rand + " dps");
		System.out.println("Enemy`s health left " + (health-rnd));





	}

}
