package builderPattern.abstractClassBuilders;

public class Calzone extends Pizza {
  private final boolean sauceInside;

  public static class Builder extends Pizza.Builder<Builder>{

    private boolean sauceInside;

    public Builder(boolean sauceInside){
      this.sauceInside =sauceInside;
    }

    @Override
    protected Builder self() {
      return this;
    }

    @Override
    public Calzone build() {
      return new Calzone(this);
    }
  }

  private Calzone(Builder builder){
    super(builder);
    this.sauceInside = builder.sauceInside;
  }
}
