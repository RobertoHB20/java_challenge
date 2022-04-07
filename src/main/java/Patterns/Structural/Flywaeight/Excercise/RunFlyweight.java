package Patterns.Structural.Flywaeight.Excercise;

import java.util.Random;

public class RunFlyweight {

    public static String[] levels = {"FACIL", "INTERMEDIO", "DIFICIL"};
    public static String[] enemyTypes = {"GOOMBA", "KOOPA"};

    public static void main(String[] args) {

        for(int i = 0 ; i < 10 ; i++){
            System.out.println("\n--------  Enemigo  --------");
            IEnemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setLevel(getRandomLevel());
            enemy.lifePoints();
        }

    }

    public static String getRandomEnemyType(){
        Random enemyRandom = new Random();
        int randInt = enemyRandom.nextInt(enemyTypes.length);
        return enemyTypes[randInt];
    }

    public static String getRandomLevel(){
        Random enemyRandom = new Random();
        int randInt = enemyRandom.nextInt(levels.length);
        return levels[randInt];
    }
}
