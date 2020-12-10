package singleton.Implementation1;


public class Singleton {
  private static final Singleton instance = new Singleton();
  private Singleton(){

  }

  /**
   * A static factory method to return the singleton instance.
   * Flexible because you can change your mind about the singleton class.
   *
   * @return
   */
  public static Singleton getInstance(){
    return instance;
  }



}
