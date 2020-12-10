public class Child implements Cloneable {
  public int age;
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
