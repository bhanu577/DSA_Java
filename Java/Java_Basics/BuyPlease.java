import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BuyPlease
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int val=0;
		int[] arr=new int[4];
		for (int i=0;i<4 ;i++){
		    arr[i]=s.nextInt();
		}
		for(int i=0;i<2;i++){
		    val=val+(arr[i]*arr[i+2]);
		    //System.out.println(val);
		}
		System.out.println(val);
	}
}