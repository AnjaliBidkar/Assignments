/*
 6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"

 */
package package1.A24;

public class P6_String {
	
	String reverseString(String name) 
	{
		String temp="";
		for(int index=name.length()-1;index>=0;index--) 
		{
			temp=temp+name.charAt(index);
		}
		return temp;
		
	}
	
    static String   reverseByStringBuffer(String name) 
   {
	   StringBuffer sb = new StringBuffer(name);
	   sb.reverse();
	   return sb.toString();//here sb is stringbuffer and return type is string so
	                         //using toString covert StringBuffer to String
   }

	String processString(String name)
	{
		String arr[]=name.split(" ");
		String output="";
		for(int index=0;index<arr.length;index++) 
		{
			String reverse=reverseString(arr[index]);
			//System.out.println(reverse);
			String Remaining=reverse.substring(1);
		   //System.out.println(Remaining);
			output= output+" "+Character.toUpperCase(reverse.charAt(0))+Remaining;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		P6_String p6_String= new P6_String();
		String out=p6_String.processString("Vrushali Sagar Shital");
		System.out.println(out);
		
		String output=reverseByStringBuffer("Anjali");
		System.out.println(output);
	}

}
