package Patterns.Structural.Flywaeight.Live;

public class Soldier implements IEnemy{

    private String weapon;
    private final String LIFE;

    public Soldier() {
        LIFE = "100";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("El arma del soldado es: " + weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida del soldado es: " + LIFE);
    }
}
