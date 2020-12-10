package singleton.Implementation2;


import sun.security.jca.GetInstance;

public class Singleton {
  //The field is public and final
  public static final Singleton instance = new Singleton();
  private Singleton(){

  }


}
