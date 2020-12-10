package builderPattern.abstractClassBuilders;

import java.util.Objects;

public class NyPizza extends Pizza {
  public enum Size {SMALL, MEDIUM, LARGE}
  private final Size size;

  public static class Builder extends Pizza.Builder<Builder>{

    private final Size size;
    @Override
    protected Builder self() {
      return this;
    }

    public Builder(Size size){
      this.size = Objects.requireNonNull(size);
    }

    @Override
    public NyPizza build() {
      return new NyPizza(this);
    }


  }

  private NyPizza(Builder builder){
    super(builder);
    this.size = builder.size;
  }

}
