package builderPattern;

import java.util.Date;

//This class illustrates the builder pattern, which comes in handy when there
// are many optional parameters in the class.

public class UHaul {
  public final Date pickUpDate;

  public final int hours;

  public final TruckModel model;

  public final int utilittyDolly;

  public final int applicanceDolly;

  public final boolean collisiionDamageWeaver;

  public final int storageUnits;

  public static class Builder{

    public final Date pickUpDate;

    public final int hours;

    public final TruckModel model;

    //Optional parameters
    public int utilittyDolly = 0;

    public int applicanceDolly =0;

    public boolean collisiionDamageWeaver = false;

    public int storageUnits = 0;

    public Builder(Date pickUpDate, int hours, TruckModel model){
      this.pickUpDate = pickUpDate;
      this.hours = hours;
      this.model = model;
    }

    public Builder utilityDolly(int val){
      this.utilittyDolly = val;
      return this;
    }
    public Builder applicanceDolly(int val){
      this.applicanceDolly = val;
      return this;
    }
    public Builder collisiionDamageWeaver(boolean val){
      this.collisiionDamageWeaver = val;
      return this;
    }
    public Builder storageUnits(int val){
      this.storageUnits = val;
      return this;
    }
    public UHaul build(){
      UHaul reservation = new UHaul(this);
      return reservation;
    }
  }

  private UHaul(Builder builder){
    this.pickUpDate = builder.pickUpDate;
    this.hours = builder.hours;
    this.model = builder.model;
    this.utilittyDolly = builder.utilittyDolly;
    this.applicanceDolly = builder.applicanceDolly;
    this.storageUnits = builder.storageUnits;
    this.collisiionDamageWeaver = builder.collisiionDamageWeaver;
  }
}
