package Patterns.Structural.Flywaeight.Excercise;

import java.util.HashMap;

public class EnemyFactory {

    private static HashMap<String, IEnemy> enemies = new HashMap<>();

    public static IEnemy getEnemy(String type){
        IEnemy enemy = null;
        if(enemies.containsKey(type)){
            enemy = enemies.get(type);
            return enemy;
        }

        switch (type){
            case "GOOMBA":
                System.out.println("Se ha creado el enemigo Goomba");
                enemy = new Goomba();
                break;
            case "KOOPA":
                System.out.println("Se ha creado el enemigo Koopa");
                enemy = new Koopa();
                break;
            default:
                System.out.println("No se reconoce al enemigo a generar");
                break;
        }
        enemies.put(type, enemy);
        return enemy;
    }

}
