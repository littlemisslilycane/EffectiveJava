//Classes once created the content cannot be changed.
//Class is declared final
//No Setters
//Parameterized constructor which does a deep copy.


//Deep Copy means you clone the values and references of an object. So two
// copies point to a different references.

//Shallow copy means two copies point to the same reference. Thus change in
// one thing will be reflected in another.
public final class ImmutableClass {
  private int number;
}
