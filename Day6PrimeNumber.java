import java.util.*;

public class Day6PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter a number : ");
        int number = sc.nextInt ();
      int i = 2;
      boolean flag = false;
      while (i <= number / 2) {
        // condition for nonprime number
        if (number % i == 0) {
          flag = true;
          break;
        }
        ++i;}
  
      if (!flag)
        System.out.println(number + " is a prime number.");
      else
        System.out.println(number + " is not a prime number.");
    }
  }