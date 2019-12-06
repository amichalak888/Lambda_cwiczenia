package czwarty_przydkład;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Main {
     /*
                 Wyrażenie lambda nie posiada konkretnego typu, a to oznacza, że nie może wystę̨pować
                 'samodzielnie' (Java jest ję̨zykiem ściśle ́typowanym)

                 Typ wyrażenia lambda jest zawsze wnioskowany przez kompilator na podstawie kontekstu jego użycia –
                jest on okreś́lony przez interfejs funkcyjny

                Utworzymy dwie metody:

                 static void concat(BinaryOperator<String> binaryOperator, String s1, String s2)
                 static void add(IntBinaryOperator intBinaryOperator, String s1, String s2)

                Ta sama lambda:

                (x, y) -> x + y

                Będzie oznaczała konkatenację lub dodawanie, w zależności od kontekstu jej użycia (do której
                metody ją przekażemy).

                concat - implementacja BinaryOperator<String> binaryOperator
                add - implementacja IntBinaryOperator intBinaryOperator


             */

    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (x, y) -> x + y;
        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;

        //concat((x, y) -> x + y, "10", "20");
        add((x, y) -> x + y, "10", "20");

       // concat(binaryOperator, "10", "20");
        add(intBinaryOperator, "10", "20");

    }
     static void concat(BinaryOperator<String> binaryOperator, String s1, String s2) {
         String result = binaryOperator.apply(s1, s2);
         System.out.println(result);
     }

    static void add(IntBinaryOperator intBinaryOperator, String s1, String s2) {
        int result = intBinaryOperator.applyAsInt(Integer.valueOf(s1), Integer.valueOf(s2));
        System.out.println(result);
    }


}
