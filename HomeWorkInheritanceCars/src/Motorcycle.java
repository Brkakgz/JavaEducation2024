public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start()
    {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Motorcycle is stopping");
    }
}
