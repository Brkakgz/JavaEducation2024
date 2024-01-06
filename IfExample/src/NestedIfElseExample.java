public class NestedIfElseExample {
    public static void main(String[] args) {

        String gender = "M";
        int age=20;

        /*if(gender.equals("M")){
            if(age>18){
                System.out.println("are you ready to be a soldier");
            }
             else{
             System.out.println("w8 a bit");
             }*/

        if (gender.equals("M") && age>20){
            System.out.println("are you ready to be a soldier");
        } // Bu if ifadesi hatalıdır 20 yaşından küçük olursan sana kadın muamelesi yapar :D
        else{
            System.out.println("Do not need to be a soldier");
        }

    }
}
