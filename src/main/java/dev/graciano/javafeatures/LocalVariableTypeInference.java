package dev.graciano.javafeatures;

import java.util.List;
import java.util.Map;

public class LocalVariableTypeInference {

  public void usingVar() {
    var name = "BNY";
    var citiesLivedIn = Map.of("Neha", List.of("Bangalore", "Copenhagen", "Mumbai", "Delhi", "London", "New York"));
  }

}
