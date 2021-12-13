import java.util.*;

public class Day6ReverseNUmber {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter a number : ");
        int number = sc.nextInt ();

        System.out.print ("Reverse of " + number + " is :");

        int rev = 0;
        while(number != 0){//567
            int remainder = number % 10;//7
            rev = rev * 10 + remainder;//7
            number = number/10;//56
        }
        System.out.print (rev);
    }
}