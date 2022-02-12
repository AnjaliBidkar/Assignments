/*
 3. WAP to return array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"
*/
package package1.A24;

import java.util.ArrayList;
import java.util.Arrays;

public class P3_arrayProgram_madesusingCollectionAndarryBoth {
	
	//using collection
	ArrayList<String> arrayContainDigits(String name)
	{
		ArrayList<String> list= new ArrayList<String>();
		String arr[]=name.split(" ");
		String temp="";
		for(int index=0;index<arr.length;index++) 
		{
			temp="";
			for(int innerindex=0;innerindex<arr[index].length();innerindex++) 
			{
				if(Character.isDigit(arr[index].charAt(innerindex)))
				{
					temp=temp+arr[index].charAt(innerindex);
				}
			}
			list.add(temp);
		   
		}
		return list;
	}
	
	
	//using array
	static String [] arrayContainDigitsUsingArray(String name)
	{
		String arr[]=name.split(" ");
	    String output[]=new String [arr.length];
		int count=0;
		String temp="";
		for(int index=0;index<arr.length;index++) 
		{
			temp="";
			for(int innerindex=0;innerindex<arr[index].length();innerindex++) 
			{
				if(Character.isDigit(arr[index].charAt(innerindex)))
				{
					temp=temp+arr[index].charAt(innerindex);
				}
			}
			output[count]=temp;
			count++;
	   }
		return output;
	}
	
	
    public static void main(String[] args) {
		P3_arrayProgram_madesusingCollectionAndarryBoth p3_arrayProgram = new P3_arrayProgram_madesusingCollectionAndarryBoth();
		ArrayList<String>  output=p3_arrayProgram.arrayContainDigits("Te1c2h C94re3");
	    System.out.println(output);
	    System.out.println("****************************************");
	    String[] out=arrayContainDigitsUsingArray("Te1c2h C94re3");
	    System.out.println(Arrays.toString(out));
   }

}
