package dev.graciano.javafeatures;

import java.util.*;

public class LocalVariableTypeInference {

  //-var
  public void oldVar() {
    String name = "BNY Mellon";
    Set<String> citiesLivedIn =
      Set.of("São Paulo", "Rio de Janeiro", "Porto Alegre", "New Jersey", "New York");
  }

  public void usingVar() {

    var name = "BNY Mellon";
    var citiesLivedIn =
      Set.of("São Paulo", "Rio de Janeiro", "Porto Alegre", "New Jersey", "New York");
  }
}
