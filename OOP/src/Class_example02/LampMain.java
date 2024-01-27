package Class_example02;

public class LampMain {
    public static void main(String[] args) {
        Lamp livingRoomLamp=new Lamp();//Class_example02.Lamp classının livingroomlamp objesi olur burada
        livingRoomLamp.stateOfLamp();
        livingRoomLamp.turnOn();
        System.out.println("LivingRoom son hali: "+livingRoomLamp.isOn); //gerçekten turnOn yaptı mı ? diye baktık bu komutta

        //livingRoomLamp.turnOff();
        //System.out.println("Lvingroom son hali: "+livingRoomLamp.isOn);//gerçekten turnoff yaptı mı ? diye durumunu kontrol eediyorum çünkü durumunu tanımlamıştık

        System.out.println("---------");

        Lamp bedRoomLamp = new Lamp(); //BEDROOM İLE LİVİNGROOM FARKLI tamam ikiside lamba ama yeni tanımladık fakrlı bellekteler şuan Class_example02.Lamp classının bedroomlamp objesi bu artık
        System.out.println("bedroom son hali: "+bedRoomLamp.isOn);
        bedRoomLamp.turnOn();
    }
}
