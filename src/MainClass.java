import java.lang.reflect.Field;

import builderPattern.abstractClassBuilders.Calzone;
import builderPattern.abstractClassBuilders.NyPizza;
import singleton.Implementation1.Singleton;

import static builderPattern.abstractClassBuilders.NyPizza.Size.SMALL;
import static builderPattern.abstractClassBuilders.Pizza.Toppings;
import static builderPattern.abstractClassBuilders.Pizza.Toppings.MUSHROOM;
import static builderPattern.abstractClassBuilders.Pizza.Toppings.ONIONS;


public class MainClass {
  public static void main (String[] args) throws NoSuchFieldException{
    NyPizza pizza = new NyPizza.Builder(SMALL).addToppings(ONIONS).build();
    Calzone calPizza = new Calzone.Builder(true).addToppings(MUSHROOM).build();

    System.out.println("That's all folks!");
  }
}
