package dev.graciano.javafeatures;

public class SwitchExpressions {



  public String beforeSwitchExpressions(Color color) {
    return switch (color) {
      case AZUL -> "Blue";
      case VERDE -> "Green";
      case BRANCO -> "White";
      case AMARELO -> {
        System.out.println("It's yellow");
        yield "Yellow";
      }
    };
  }
}
