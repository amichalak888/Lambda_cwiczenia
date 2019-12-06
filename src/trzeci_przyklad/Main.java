package trzeci_przyklad;

public class Main {
    public static void main(String[] args) {
     //klaczycznie
       Vehicle vehicle = new VehicleImpl();
      uzyjImplementacji(vehicle);
        // anonimowa
        uzyjImplementacji(new Vehicle() {
            @Override
            public void odpalSilnik() {
                System.out.println("z klasą anonimową");
            }
        });

        uzyjImplementacji(()-> System.out.println("lambda?!?!"));

    }
    static void uzyjImplementacji (Vehicle veh)
    {veh.odpalSilnik();};

};
