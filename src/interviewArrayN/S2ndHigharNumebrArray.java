package interviewArrayN;

import java.util.Arrays;
import java.util.Comparator;

public class S2ndHigharNumebrArray {
    public static void main(String[] args) {

        int number[] = {5,4,1,6,10,7,8};
        int arr[] = {5,4,1,6,10,7,8};

        Integer secondHighest = Arrays.stream(number)
                .boxed() // convert int → Integer
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second highest: " + secondHighest);
        
        // 2nd approach

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
