public class HandlingExceptionExample02 {
    public static void main(String[] args) {
        int number1=5;
        String name ="null";

        try{
    name.length();
        }
        catch (NullPointerException nullPointerException){
            System.out.println("catch nullpointerexception! ->"+nullPointerException.getMessage());
        }
        finally{
            System.out.println("Her zaman çalışır");
        }
    }
}
