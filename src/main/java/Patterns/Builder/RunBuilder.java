package Patterns.Builder;

public class RunBuilder {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder("Simple").build();
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza.PizzaBuilder("Double").cheese("Mozzarela").sauce("Tomato").build();

        System.out.println(pizza2);
    }
}
