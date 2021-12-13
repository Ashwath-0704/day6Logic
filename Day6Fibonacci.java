class Day6Fibonacci
{
    //method
static int fibonacci(int n){

	int Arr[] = new int[n+2]; // 1 extra to handle case, n = 0
	int i;
	Arr[0] = 0;
	Arr[1] = 1;
	for (i = 2; i <= n; i++){
        
	    Arr[i] = Arr[i-1] + Arr[i-2];
        System.err.println(Arr[i]);
	}	
    return Arr[n];
}
	public static void main (String args[])
	{
		int n = 8;
		System.out.println(fibonacci(n));
	}
}
