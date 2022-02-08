/*
Program 7 : Verify if 2 arrays are identical

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.


 */
package package1.A23;

public class A23_p7_array {
	
	static boolean areArrayIdentical(int arr1[],int arr2[]) 
	{
		boolean flag=false;
		if(arr1.length==arr2.length) 
		{
			for(int index=0;index<arr1.length;index++) 
			{
				flag=false;
				if(arr1[index]==arr2[index])
						flag =true;
			}
			
		}
		else
		   flag=false;
		  
		  return flag;
		
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr1 = {10,44,33};
		int[] arr2 = {10,44,33};
		boolean b=areArrayIdentical(arr1, arr2) ;
		System.out.println(b);

       int[] arr3 = {10,44,-33};
       int[] arr4 = {10,44,-33,55};
   	    boolean b1=areArrayIdentical(arr3, arr4) ;
	   System.out.println(b1); 

	}
}
