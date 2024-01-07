public class Continue {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
// If the number is even
// skip and continue
            if (i % 2 == 0)
                continue;
// If number is odd, print it
            System.out.print(i + " ");
        }
    }
    //Continue ise burada beni atla yenisine geç anlamına gelir o yüzden çift yerine tekleri yazar
}
