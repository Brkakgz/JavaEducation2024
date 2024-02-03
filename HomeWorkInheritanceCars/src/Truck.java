public class Truck extends Vehicle{

    private double cargoCapacity;

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start()
    {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Truck is stopping");
    }
}
