/*
 4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"
 */
package package1.A24;

public class P4_String {
	
	
	
	String reverseString(String input) 
	{
		String reverse="";
		for(int index=input.length()-1;index>=0;index--) 
		{
			reverse=reverse+input.charAt(index);
		}
		return reverse;
		
	}

   String reverseEachWordInString(String name) 
   {
	   String arr[]=name.split(" ");
	   String totalReverseString="";
	   for(int index=0;index<arr.length;index++) 
	   {
		   totalReverseString=totalReverseString+" "+ reverseString(arr[index]); 
	   } 
	return  totalReverseString.trim();
	}


	public static void main(String[] args) {
		P4_String p4= new P4_String();
		String output=p4.reverseEachWordInString("Hi techno hello");
		System.out.println(output);
	}

}
