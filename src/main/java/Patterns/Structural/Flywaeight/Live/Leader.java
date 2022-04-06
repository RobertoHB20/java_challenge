package Patterns.Structural.Flywaeight.Live;

public class Leader implements IEnemy{
    private String weapon;
    private final String LIFE;

    public Leader() {
        LIFE = "1000";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("El arma del jefe es: " + weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida del jefe es: " + LIFE);
    }
}
