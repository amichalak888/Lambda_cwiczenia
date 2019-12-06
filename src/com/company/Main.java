package com.company;

public class Main {

    public static void main(String[] args) {
// 1 przypadek - użycie klasycznej implemetacji
        uzyjImplementacjiInterfejsu(new VehicleImpl() {
        });


        // 2 przypadek klasa anonimowa
        uzyjImplementacjiInterfejsu(new Vehicle() {
            @Override
            public void run() {
                System.out.println("Anonimowa implementacja!!! ");
            }
        });


        // 3 przypadek - użycie Lambdy
        uzyjImplementacjiInterfejsu(() -> {
            System.out.println("Lambda implementująca interfejs!");
        });
    }

    static void uzyjImplementacjiInterfejsu(Vehicle v) {
        v.run();
    }
}

