public class NestedExample02 {
    public static void main(String[] args) {

        String gender="F";
        int age=28;

        if(gender.equals("F") || gender.equals("M")){
            if(gender.equals("F") && age>30){
                System.out.println("Are you ready to be a soldier female !");
            } else if (gender.equals("F")&& age<=30) {
                System.out.println("w8 a bit girl");
            }else if(age>20) {
                System.out.println("are you ready to be a soldier male !");
            }
            else {
                System.out.println("wait a bit boy");
            }
        }
        else {
            System.out.println("You dont need to be a soldier");
        }
    }
}
