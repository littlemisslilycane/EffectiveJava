import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;
//Static factory methods
public class Chapter1 {
  public static void main(String[] args){
    Chapter1 obj = new Chapter1();
    Random r = new Random();
    int r1  = r.nextInt();
    //Static Factory Method with a useful name
    BigInteger.probablePrime(2,r);
    ImmutableClass i = new ImmutableClass();

    //static constructor (Never created object) Flyweight Pattern
    System.out.println(Boolean.valueOf("True"));
    //The above methods returns the object already instantiated.

    //Static methods in the Collection class which operates on the Collection
    // interface
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    Collections.reverse(list);

    System.out.println("That's all folks!");
  }
}

