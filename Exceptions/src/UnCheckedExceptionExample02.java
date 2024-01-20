public class UnCheckedExceptionExample02 {
    public static void main(String[] args) {
        String name = null;

        //kötü yaklaşım
        try{
            if (name.equals("Kadir"))
            {
                System.out.println("name: Kadir");
            }

        }
        catch (NullPointerException e)
        {
            System.out.println("catch!");
        }



       /* //iyi yaklaşım, en çok bunu görürüz
        if(Objects.nonNull(name) && name.equals("kadir"))
        {
            System.out.println("hoşgeldin reis");
        }
        */

      /*  //En güzeli
        if("kadir".equals(name)) // burada kadir null'a yani name'e eşit mi diye bakıyoruz
        {
            System.out.println("Hoşgeldiiiin");
        }
       */


                //name.equals() name normalde null olan bir değer için equals fonksiyonunu çalıştırıyoruz
       //"kadir".equals(null) //kadir.equals() var olan bir değerin equalsı oluyor. Kadir üzerinde bir fonksiyon çalıştırabilir çünkü kadir null değil

        //solda null olamaz çünkü onun üstünden kontrol ediyoruz o zaten null o yüzden nullpointerexception yersin
        //equals için boşluk bir değer buna eşitmi diye bakıyoruz yani wtf oluyor

        //özet: null olan herhangi bir şeye.(nokta) koyup fonksiyon çağırırsak nullpointerexception alırız

      /*  if(name.equals("kadir")) //name null o yüzden işlem yapılamıyor. //burada null yani name kadire eşit mi diye bakıyoruz null hatası yiyoruz
        System.out.println("Uygulama Kapatılıyor");

      */
    }
}
