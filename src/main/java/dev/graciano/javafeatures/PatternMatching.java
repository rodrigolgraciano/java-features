package dev.graciano.javafeatures;

/**
 * <h1>Pattern Matching</h1>
 * <li>Old way</li>
 * <li>New way</li>
 * <li>Scope </li>
 */
public class PatternMatching {

  private void oldPattern(Object obj){
    if(obj instanceof String){
      String name = (String) obj;
    }
  }
}
