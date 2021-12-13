
import java.util.*;
public class Day6Sqrt {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Enter non-negative number : ");
        double num = a.nextDouble();
        double c =num;

        double epsilon = 1e-15;

        double t = c;

        if(c>0){     
            while (Math.abs(t - c / t) > epsilon * t) {
                t = (c / t + t) / 2.0;
            }
        System.out.println(t);
        }
        else {
            System.out.println("invaild input and Enter the non-negative number");

        }
    }
}
