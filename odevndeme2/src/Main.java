import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//        List<Integer> listOfNumber = List.of(-1, 1, 0, -2, 5, 3, -5, -7);
//        Stream<Integer> myStream = listOfNumber.stream();
//        Predicate<Integer> predicate01 = element -> element.intValue() > 0;
//        List<Integer> choosenNumbers = myStream.filter(predicate01).forEach(System.out::println).toList();

//        List<String> listOfNames = List.of("Ahmet","Mehmet","Ayşe","Fatma","Mustafa","Aylin","Osman");
//        List<String> filter = listOfNames.stream().filter(element ->element.length()>4).filter(element->element.startsWith("A")).toList();
//        filter.forEach(System.out::println);

//        List<String> listOfNames = List.of("Ahmet","Mehmet","Ayşe","Fatma","Mustafa","Aylin","Osman","aa","aaa","aaaaa","aaaa");
//        List<String> choosenNames = listOfNames.stream().filter(e->e.length()<=5 && e.length()>=3 && e.endsWith("a")).toList();
//        choosenNames.forEach(System.out::println);

//        List<Integer> listOfNumbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
//        List<Integer> doubleTimesNumbers=listOfNumbers.stream().filter(values->values*2>20).toList();
//        doubleTimesNumbers.forEach(System.out::println);

        List<Integer> listOfNumbers = List.of(1,3,15,85,52,63,19,8,9,10,11,12);
        List<Integer> oddNumbers = listOfNumbers.stream().filter(values->values%2!=0).sorted().toList(); //Burada hem tek sayıları yazıyor hemde sıralıyor
        oddNumbers.forEach(System.out::println);
    }
}