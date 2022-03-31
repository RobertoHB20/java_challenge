package Patterns.Creationals.Builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Pizza {
    private final String sauce;
    private final String cheese;
    private final String base;

    public Pizza(PizzaBuilder pizzaBuilder){
        this.sauce = pizzaBuilder.sauce;
        this.base = pizzaBuilder.base;
        this.cheese = pizzaBuilder.cheese;
    }

    public static class PizzaBuilder{
        private String sauce;
        private String cheese;
        private String base;

        public PizzaBuilder(String base){
            this.base = base;
        }

        public PizzaBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
