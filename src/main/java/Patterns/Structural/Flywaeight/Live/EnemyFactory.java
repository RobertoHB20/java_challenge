package Patterns.Structural.Flywaeight.Live;

import java.util.HashMap;

public class EnemyFactory {

    private static HashMap<String, IEnemy> enemies = new HashMap<>();

    public static IEnemy getEnemy(String type){
        IEnemy enemy = null;
        if (enemies.containsKey(type)){
            enemy = enemies.get(type);
            return enemy;
        }
        switch (type){
            case "Soldier":
                System.out.println("El soldado ha sido creado");
                enemy = new Soldier();
                break;
            case "Leader":
                System.out.println("Se ha creado el leader");
                enemy = new Leader();
                break;
            default:
                System.out.println("No se ha creado el elemento");
                break;
        }
        enemies.put(type, enemy);

        return enemy;
    }
}
