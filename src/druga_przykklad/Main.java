package druga_przykklad;

public class Main {
    public static void main(String[] args) {
        //Klasycznie
        Vehicle v = new VehicleImpl();
        uzyjImplemetacji(new VehicleImpl(),"Syrea 105");
        // Anonimowa
        uzyjImplemetacji(new Vehicle() {
            @Override
            public void run(String s) {
                System.out.println("ssss"+s);
            }
        },"Fiat 125");

        //Lambda
        uzyjImplemetacji((String s)->{
            System.out.println("cdcdccccc"+s);
        },"kxkxkx");
    }
    static void uzyjImplemetacji (Vehicle v, String s){
        v.run(s);
    }


}

