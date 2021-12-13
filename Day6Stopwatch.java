import java.util.*;

public class Day6Stopwatch {

	public long start=0;
	public long stop=0;
	public long Elapsed;
	//method
	public void start(){
		start=System.currentTimeMillis();// taking current time and Start
		System.out.println("Start time is: "+start);// display
	}
	public void stop(){
		stop=System.currentTimeMillis();// taking current time and stop
		System.out.println("Stop time is: "+stop);// display
	}
	
	public long getElapsedT(){
		Elapsed=stop-start; // geting difference b/w start and stop
		return Elapsed;// display
	}
	
	public static void main(String[] args) throws Exception{
        // calling Object
		Day6Stopwatch sc1=new Day6Stopwatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to Start Time: ");
		sc.nextInt();
        // calling Start method
		sc1.start();

		System.out.println("Pressany Key to Stop Time: ");
		sc.nextInt();
        // calling stop method
		sc1.stop();

        // calling Elapsad Time method
		long len=sc1.getElapsedT();
		System.out.println("Total Time in millisec :"+len);
		System.out.println("Converting millisec to seconds : "+(len/1000)+"sec");
	}
}