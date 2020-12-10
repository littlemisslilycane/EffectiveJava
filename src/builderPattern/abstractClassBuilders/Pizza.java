package builderPattern.abstractClassBuilders;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

//Code sample to explain hierarchical builders.
public abstract class Pizza {
  public enum Toppings {PEPPERS, ONIONS, SAUSAGES, MUSHROOM, SPINACH}

  private final Set<Toppings> toppings;

  public static abstract class Builder<T extends Builder<T>> {
    private EnumSet<Toppings> toppings = EnumSet.noneOf(Toppings.class);

    public T addToppings(Toppings topping) {
      this.toppings.add(Objects.requireNonNull(topping)); //Validity checks
      return self();
    }

    protected abstract T self();
    public abstract Pizza build();

  }

  Pizza(Builder builder) {
    this.toppings = builder.toppings.clone(); // Do a deep copy here.
  }

}
