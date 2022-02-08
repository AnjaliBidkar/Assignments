/*
 Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
*/
package package1.A23;

import java.util.Arrays;

public class A23_P1_FindSeondMaximumFromarray {
	
	
	int findMax(int arr[])
	{
		int max=0;
		int temp=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]>max) {
				max=arr[index];
			    temp=index;
			}
	   }   
		arr[temp]=0;
		return max;
		
	}
	
	
    int findSeondMax(int arr[] ) 
	{
    	int output=0;
		for(int n=1;n<=2;n++)
		{
		   output=findMax(arr);
		}
		return output;
	}

	public static void main(String[] args) {
		A23_P1_FindSeondMaximumFromarray  a23_P1_FindSeondMaximum = new A23_P1_FindSeondMaximumFromarray();
		int arr[]={1,11,3,99,66,54,22,44};
	    int secondmax= a23_P1_FindSeondMaximum.findSeondMax(arr);
	    System.out.println(secondmax);
		

	}

}
