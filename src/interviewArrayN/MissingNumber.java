package interviewArrayN;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2,3, 4, 5,7 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1; j<=7;j++ ) {
			sum1=sum1+j;//1+2+3+4+5
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
	}
}