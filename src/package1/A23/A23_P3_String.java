/*
Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.
input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-*

 */
package package1.A23;

public class A23_P3_String {
	
	static String processString(String name)
	{
		String upperCase="";
		String lowerCase="";
		String digit="";
		String SpecialChar="";
		String result="";
		for(int index=0;index<name.length();index++) 
		{
			if(Character.isLetter(name.charAt(index))) 
			{
				if(Character.isUpperCase(name.charAt(index)))
					upperCase=upperCase+name.charAt(index);
				else
					lowerCase=lowerCase+name.charAt(index);
		     }
			else if(Character.isDigit(name.charAt(index)))
				digit=digit+name.charAt(index);
			else
				SpecialChar=SpecialChar+name.charAt(index);
			 
	   }
		result=lowerCase+ digit+upperCase+ SpecialChar;
		return result;
		
	}
	

	public static void main(String[] args) {
		String output=processString("te4c&Hno7CreD-8i*ts");
		System.out.println(output);
	}

}
