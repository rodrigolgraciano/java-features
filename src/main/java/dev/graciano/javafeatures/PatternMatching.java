package dev.graciano.javafeatures;

/**
 * <h1>Pattern Matching</h1>
 * <li>Old way</li>
 * <li>New way</li>
 * <li>Scope </li>
 */
public class PatternMatching {
  String name = "Rodrigo";

  void oldPattern(Object obj) {
    if (obj instanceof String ) {
      String name = (String) obj;
      System.out.println(name.toLowerCase());
    } else {
      System.out.println(name);
    }
  }

  void newPattern(Object obj) {
    if (!(obj instanceof String name)) {
      System.out.println(name.toLowerCase());
    } else {
      System.out.println(name);
    }
  }
}
