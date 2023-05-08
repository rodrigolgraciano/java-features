package dev.graciano.javafeatures;

public class SwitchExpressions {
//-switch
public String beforeSwitchExpressions(Color color) {
    String colorEN;
    switch (color) {
      case AZUL:
        colorEN = "Blue";
        break;
      case VERDE:
        colorEN = "Green";
        break;
      case BRANCO:
        colorEN = "White";
        break;
      case AMARELO:
        colorEN = "Yellow";
        break;
    }
    return colorEN = "Yellow";
  }
//new-switch
public String afterSwitchExpressions(Color color) {
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
