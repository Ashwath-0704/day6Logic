import java.util.*;
public class Day6JUnitTemperaturConversion {
    public static void main(String arg[]){

	    double f,c;
            
        Scanner sc=new Scanner(System.in);

	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
            int char1=sc.nextInt();

        if (char1==1) {
            System.out.println("Enter  Fahrenheit temperature");
                   	f=sc.nextDouble();
	    	        c=(f-32)*5/9;
	    	        System.out.println("Celsius temperature is = "+c);
        } else if (char1==2){
            System.out.println("Enter  Celsius temperature");
                   	c=sc.nextDouble();
	    	        f=((9*c)/5)+32;
	    	        System.out.println("Fahrenheit temperature is = "+f);
        }else{
	     System.out.println("please choose valid choice");
        } 
	} 
}
