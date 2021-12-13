import java.util.*;
public class Day6CouponNumber {
	public static void main(String[] args) {
		Random Number = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print ("how many random numbers do you need to generate a distinct coupon number?");
        int coupwanted = sc.nextInt ();//5

		for (int i=1 ; i <=coupwanted; i++) {
			if (i!=0) {
			int Coupon_Code = Number.nextInt(1000);
			System.out.println(i+")CouponNumber is : ");
			System.out.println(Coupon_Code);
			}else{
				System.out.println(" invaild input,Enter the Value 1-nth number ");
				break;
			}
		}
	}
}