/*
7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoCReditS"
Output : "tEchNOcrEDITs"
 */
package package1.A24;

public class P7_String {
	
	static String reverseCase(String name) 
	{
		String temp="";
		for(int index=0;index<name.length();index++) 
		{
			if(Character.isLetter(name.charAt(index)))
			{
			if(Character.isUpperCase(name.charAt(index)))
				temp=temp+Character.toLowerCase(name.charAt(index));
			else
				temp=temp+Character.toUpperCase(name.charAt(index));
			}
		}
		return temp;
		
	}
	

	public static void main(String[] args) {
		String output=reverseCase("TeCHnoCReditS");
		System.out.println(output);

	}

}