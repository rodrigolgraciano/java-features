package dev.graciano.javafeatures;

sealed interface Sealed permits Class1, Class2 { }

final class Class1 implements Sealed {
}

final class Class2 implements Sealed {
}





