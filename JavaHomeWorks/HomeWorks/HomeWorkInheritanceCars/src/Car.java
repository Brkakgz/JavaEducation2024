public class Car extends Vehicle{

    private int numDoors;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void start()
    {
        System.out.println("Car is starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Car is stopping");
    }
}
