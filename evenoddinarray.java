package arrayforloop;

public class evenoddinarray {

	import java.util.Scanner;

	    public static void main(String[] args) 
	    {
	        int n;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = scanner.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = scanner.nextInt();
	        }
	        System.out.print("Odd numbers:");
	        for(int i = 0 ; i < n ; i++)
	        {
	            if(a[i] % 2 != 0)
	            {
	                System.out.print(a[i]+" ");
	            }
	        }
	        System.out.println("");
	        System.out.print("Even numbers:");
	        for(int i = 0 ; i < n ; i++)
	        {
	            if(a[i] % 2 == 0)
	            {
	                System.out.print(a[i]+" ");
	            }
	        }
	    }
}
