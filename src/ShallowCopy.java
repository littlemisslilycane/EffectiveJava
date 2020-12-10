//Cloneable is a shallow copy. Means you have the same reference for all copies and original
public class ShallowCopy implements Cloneable {
  private String name;
  private int age;
  private ShallowCopy child;

  public ShallowCopy(String name, int age, String childName) {
    this.name = name;
    this.age = age;
    this.child = new ShallowCopy(childName, 0);
  }

  public ShallowCopy(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Name: " + this.name + "\n" + "Age:" + this.age + " Child: " + this.child.name;
  }

  public void setChildName(String name) {
    this.child.name = name;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    ShallowCopy original = new ShallowCopy("Vasavi", 28, "Livingston");
    System.out.println("Original: " + original.toString());
    ShallowCopy copy = (ShallowCopy) original.clone();
    copy.setChildName("Matilda");
    System.out.println("Copy: " + copy.toString());
    System.out.println("Original after Change to the Copy: " + original.toString());
  }
}
