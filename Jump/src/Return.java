public class Return {
    public static void main(String args[])
    {
        boolean t = true;
        System.out.println("Before the return.");
        if (t)
            return;
// Compiler will bypass every statement
// after return
        System.out.println("This won't execute.");
    }
 // Return ksıaca çağırılan yere gitmesini sağlar. Mesela Return classı başka bir yerde çağrılsa ona gider ve orada tanımlı olur
    // Scanner scanner = new Scanner(System.in);
    //double baş
    //baş = scanner.nextInt(); dediğimiz zaman Scanner'e Ctrl+soltık yaparsak içeride return olduğunu görürüz
}
