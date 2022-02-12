/*
2. WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
         technocredits --> 4


 */
package package1.A24;

public class P2_String {
	
	void findVowelInEachzString(String name) 
	{
		String arr[]=name.split(" ");
		int count=0;
		for(int index=0;index<arr.length;index++)
		{
			count=0;
			for(int innerindex=0;innerindex<arr[index].length();innerindex++) 
			{
				if(arr[index].charAt(innerindex)=='a'||arr[index].charAt(innerindex)=='e'||
						arr[index].charAt(innerindex)=='i'||arr[index].charAt(innerindex)=='o'||
					     arr[index].charAt(innerindex)=='u')
					
					count++;
			}System.out.println(arr[index]+"-->"+count);
		}
		
	}

	public static void main(String[] args) {
		P2_String p2 = new P2_String();
		p2.findVowelInEachzString("aashvi technocredits");

	}

}

