/*
Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46

 */
package package1.A23;

public class A23_P6_String{
	
	static String processString(String name)
	{
		String upperCase="";
		String evendigit="";
		String odddigit="";
		int num=0;
		boolean flag=false;
		for(int index=0;index<name.length();index++) 
		{
			if(Character.isUpperCase(name.charAt(index))) {
			        if(flag==false) 
			        {
			        	upperCase=upperCase+name.charAt(index);
			        	flag=true;
			        }
			}
		 
			else if(Character.isDigit(name.charAt(index))) 
			{
				 num=Character.getNumericValue(name.charAt(index));
				 if(num%2==0)
					 evendigit=evendigit+name.charAt(index);
				 else
					 odddigit=odddigit+name.charAt(index);
			}

			 
	   }
		return (odddigit+upperCase+evendigit);
		
	}

	public static void main(String[] args) {
		String output=processString("eTe1CH9cred4it6s");
		System.out.println(output);
	}

}
