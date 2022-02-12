/*
Program 1 : Find the single missing number from the array.*
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3

*Try for multiple missing numbers in the same array*

 */
package package1;

public class A25_Array {
	
	static int  findMissNumberInArray(int arr[]) 
	{
		int sum=0;
		for(int index=0;index<arr.length;index++) 
		{
			sum=sum+arr[index];
		}
		
		int expected_sum=10*(10+1)/2;
		
		int missingNo=expected_sum-sum;
		
		return missingNo;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		int output=findMissNumberInArray(arr);
		System.out.println(output);

	}

}
