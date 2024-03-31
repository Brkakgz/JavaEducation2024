import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main3 {

    //Supplier ile random methodunu kullanarak 10 adet 0-99 arası sayı üretiniz. bunlardan >10 olanları listeye at ekrana bas

    public static void main(String[] args) {
        Supplier<Integer> numberOfList = ()-> new Random

                List<Integer> largerThan

                .limit(10);
        
        .toList();
        System.out.println(numberOfList);

    }

}
