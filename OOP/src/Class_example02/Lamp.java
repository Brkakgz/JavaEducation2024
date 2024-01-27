package Class_example02;

public class Lamp {

    boolean isOn; //pirimitive tip'dir base halleri false'dir

    public void turnOn(){
        isOn=true;
        System.out.println("turnOn method Lamba şuan --->"+isOn);
    }
    public void turnOff(){
        isOn=false;
        System.out.println("turnOff method Lamba şuan --->"+isOn);
    }

    public void stateOfLamp(){
        System.out.println("stateOfLamp---->"+isOn);
    }

}
