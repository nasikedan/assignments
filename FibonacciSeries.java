package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {

	int fn = 0;
	int sec =1;
	int sum;
	
	System.out.println(fn);
	System.out.println(sec);
	for(int i=2;i<8;i++) {
	// Iterate from 1 to the range
	
	// add first and second number assign to sum
	sum=fn+sec;
	// Assign second number to the first number
	fn=sec;
	// Assign sum to the second number
	sec=sum;
	// print sum
	System.out.println(sum);

	}

}
	}
