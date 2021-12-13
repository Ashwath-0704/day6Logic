import java.util.*;

public class Day6PerfectNumber {

	public static void main(String[] args) {

		int i, Sum = 0 ;
        
        Scanner s1 = new Scanner(System.in);
		s1 = new Scanner(System.in);		
		System.out.println("Please Enter Number: ");
		int Number = s1.nextInt();

		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum += i;
			}
		}
		if (Sum == Number) {
			System.out.format("\n% d is a Perfect Number", Number);
		}
		else {
			System.out.format("\n% d is NOT a Perfect Number", Number);
		}
	}
}