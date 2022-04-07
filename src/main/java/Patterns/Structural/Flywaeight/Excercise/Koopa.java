package Patterns.Structural.Flywaeight.Excercise;

public class Koopa implements IEnemy{

    private String level;
    private String LIFE;

    public Koopa(){
        this.LIFE = "100";
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
        System.out.println("El nivel del koopa es: " + this.level);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida del koopa es: " + this.LIFE);
    }
}
