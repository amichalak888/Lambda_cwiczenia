package czwarty_przydkład;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        boolean isLessThan10 = usePredicate(predicate, "Ala ma kota");
        System.out.println("Is less than 10    " + isLessThan10);

        boolean islessThan20 = usePredicate((predicate1), "sssssss");
        System.out.println("is Less than 20: "+islessThan20);

        boolean isBiggerThan3  = usePredicate(s -> s.length() <3,"Ala ma kota");
        System.out.println("is bigger than 3 "+isBiggerThan3);

        boolean isbiggerThan20 = usePredicate(s -> s.length()<20,"Ala");
        System.out.println("czy jest wieksze niz 20: "+isbiggerThan20);
    }

    static Predicate<String> predicate = s -> s.length() < 10;
    static Predicate<String> predicate1 = s -> s.length() < 20;
    static Predicate<String> predicate2 = s -> s.length() > 3;
    static Predicate<String> predicate3 = s -> s.length() > 20;

    static boolean usePredicate(Predicate<String> p, String value) {
        return p.test(value);
    }


}
