/*Assignment - 20 : 6th Jan'2022

Write a method to print sum of all digits in a given String.
Input : tech1noc9red3its
Output : 13

Hint : 1+9+3


 */
package package1;

import java.util.jar.Attributes.Name;

public class Assignment20 {
	
	int sumOfDigitsInString(String name ) 
	{
		int sum=0;
		for(int index=0;index<name.length();index++) 
		{
			if(Character.isDigit(name.charAt(index)))
			{
				int num = Character.getNumericValue(name.charAt(index));
				sum=sum+num;
			}
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		int output=assignment20.sumOfDigitsInString("tech1noc9red3its");
		System.out.println(output);

	}

}
