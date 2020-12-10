public class DeepCopy implements Cloneable {
  private Child child;

  public DeepCopy(int age){
    child = new Child();
    child.age  = age;
  }

  public void setChildAge(int age){
    this.child.age = age;
  }
  @Override
  public Object clone() throws  CloneNotSupportedException{
    DeepCopy obj = (DeepCopy) super.clone();
    obj.child = (Child) this.child.clone();
    return obj;
  }

  public  static void main(String[] args) throws CloneNotSupportedException{
    DeepCopy  original = new DeepCopy(10);
    System.out.println("Original Child age: "+ original.child.age);
    DeepCopy clone = (DeepCopy) original.clone();
    clone.setChildAge(12);
    System.out.println("Clone Child age:"+clone.child.age);
    System.out.println("Original Child age:"+original.child.age);


    //Flyweight pattern - If an object is already created store it and return
    // it instead of creating again and again.
  }

}
