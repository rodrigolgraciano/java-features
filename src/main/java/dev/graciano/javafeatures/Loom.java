package dev.graciano.javafeatures;

public class Loom {
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      Thread.ofVirtual().start(() -> {
        System.out.println("Hello: " + Thread.currentThread());
      });
    }
  }
}
