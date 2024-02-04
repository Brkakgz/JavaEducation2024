public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        Motorcycle motor = new Motorcycle();
        Truck truck = new Truck();

        car.setBrand("Mercedes");
        System.out.println("Aracın Markası:"+car.getBrand());
        car.setModel("AMG");
        System.out.println("Aradın Modeli: "+car.getModel());
        car.setYear(2020);
        System.out.println("Aracın Yılı:"+car.getYear());
        car.setNumDoors(4);
        System.out.println("Aracın Kapı Sayısı: "+car.getNumDoors());
        car.start();
        car.stop();

        System.out.println("--------");

        motor.setBrand("Kawasaki");
        System.out.println("Aracın Markası:"+motor.getBrand());
        motor.setModel("Ninja400");
        System.out.println("Aradın Modeli: "+motor.getModel());
        motor.setYear(2022);
        System.out.println("Aracın Yılı:"+motor.getYear());
        motor.setHasSidecar(false);
        System.out.println("Aracın Yan Romörkü var mı ? : "+motor.isHasSidecar());
        motor.start();
        motor.stop();

        System.out.println("-----------");

        truck.setBrand("MAN");
        System.out.println("Aracın Markası:"+truck.getBrand());
        truck.setModel("TGX");
        System.out.println("Aradın Modeli: "+truck.getModel());
        truck.setYear(2022);
        System.out.println("Aracın Yılı:"+truck.getYear());
        truck.setCargoCapacity(10000);
        System.out.println("Aracın Kapı Sayısı: "+truck.getCargoCapacity());
        truck.start();
        truck.stop();

    }
}