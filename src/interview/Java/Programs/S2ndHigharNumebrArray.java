package interview.Java.Programs;

import java.util.Arrays;
import java.util.Comparator;

public class S2ndHigharNumebrArray {
    public static void main(String[] args) {

        int number[] = {5,4,1,6,10,7,8};

        Integer secondHighest = Arrays.stream(number)
                .boxed() // convert int → Integer
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second highest: " + secondHighest);
    }
}
