abstract class Book {
    public Ink ink;

    public Book(Ink ink)
    {
        this.ink=ink; //Super class gelen mürekkebi kitaba yönlendiriyor gibi düşünülebilri
    }
    abstract void write(String color);

    abstract void produce();
    {
     //   System.out.println("Kitap üretildi"); bunu yaparsak programın başında her çağırıldığında kitap üretildi yazacağı için ayrı ayrı yerlerde kullandık
    }
}
