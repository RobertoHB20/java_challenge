package Patterns.Structural.Flywaeight.Live;

import java.util.Random;

public class RunFlywight {
    public static String[] weapons = {"MA4", "Revolver", "Machete", "Lanza cohetes"};
    public static String[] enemyTypes = {"Soldier", "Leader"};
    public static void main(String[] args) {

        for(int i = 0 ; i < 15 ; i++){
            IEnemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }

    }

    public static String getRandomEnemyType(){
        Random enemyRandom = new Random();
        int randInt = enemyRandom.nextInt(enemyTypes.length);
        return enemyTypes[randInt];
    }

    public static String getRandomWeapon(){
        Random enemyRandom = new Random();
        int randInt = enemyRandom.nextInt(weapons.length);
        return weapons[randInt];
    }
}
