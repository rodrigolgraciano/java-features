package dev.graciano.javafeatures;

public class RecordPattern {

  record Point(int x, int y) {}

  void printSum(Object obj) {
    if (obj instanceof Point(int x, int y)) {
      System.out.println(x+y);
    }
  }
}
