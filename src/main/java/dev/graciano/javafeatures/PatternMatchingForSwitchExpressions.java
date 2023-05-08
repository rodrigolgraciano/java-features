package dev.graciano.javafeatures;

/**
 * <h1>Pattern Matching</h1>
 */
public class PatternMatchingForSwitchExpressions {
  //new-pattern-switch
  static void typeTester(Object o) {
    switch (o) {
      case String s when s.length() == 1 -> System.out.println(s);
      case String s -> System.out.println("Not a single letter");
      case Color c -> System.out.println("Color with " + c.name());
      case Point p -> System.out.println("Record class: " + p);
      case int[] ia -> System.out.println("Array of ints of length" + ia.length);
      case null -> System.out.println("null");
      default -> System.out.println("Something else");
    }
  }

}

record Point(int i, int j) {
}

//Pattern-matching for Sealed classes
class Class4 {
  String doSomething(Sealed sealed) {
    return switch (sealed) {
      case Class1 class1 -> "class 1";
      case Class2 c2 -> c2.toString();
      //default -> not needed -> All cases covered
    };
  }
};
