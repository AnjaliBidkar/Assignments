/*
Assignment - 21 : 8th Jan'2022
Print all Digits as a String from a given String.
 Input : tech1noc9red3its
    Output : 193
*/
package package1;

public class Assignment21 {
	
	void printAllDigitsAsString(String name) 
	{
		String temp="";
		for(int index=0;index<name.length();index++) 
		{
			if(Character.isDigit(name.charAt(index)))
				temp=temp+name.charAt(index);
			    
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Assignment21 assignment21= new Assignment21();
		assignment21.printAllDigitsAsString("tech1noc9red3its");
	}

}
