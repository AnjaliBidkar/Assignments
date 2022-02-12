/*
1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5


 */
package package1.A24;

public class P1_String {
	
	void processString(String name) 
	{
		String arr[]=name.split(" ");
		int words=arr.length;
		System.out.println("Total "+ words+" words");
		for(int index=0;index<arr.length;index++) 
		{
			System.out.println(arr[index]+"-->"+arr[index].length());
		}
	}

	public static void main(String[] args) {
		P1_String p1= new P1_String();
		p1.processString("Hi Hello");

	}

}
