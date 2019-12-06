package druga_przykklad;

public class VehicleImpl implements Vehicle {
    @Override
    public void run(String s) {
        System.out.println("Klasycznie, Wystartwano pojazd: "+s);
    }
}
