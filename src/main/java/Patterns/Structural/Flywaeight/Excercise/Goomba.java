package Patterns.Structural.Flywaeight.Excercise;

public class Goomba implements IEnemy{
    private String level;
    private String LIFE;

    public Goomba(){
        this.LIFE = "50";
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
        System.out.println("El nivel del goomba es: " + this.level);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida del goomba es: " + this.LIFE);
    }
}
