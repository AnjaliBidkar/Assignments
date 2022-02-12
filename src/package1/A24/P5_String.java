/*
5. WAP to convert first character of word with capital letter
Input    :"anvit harsh dipali" 
Output : "Anvit Harsh Dipali"

 */
package package1.A24;

public class P5_String {
	
	
	static String  processString(String name)
	{
		String arr[]= name.split(" ");
		String temp="";
		for(int index=0;index<arr.length;index++) 
		{
			String output=Character.toUpperCase(arr[index].charAt(0))+arr[index].substring(1);
			temp=temp+" "+output;
		}
		return temp;
		
	}

	public static void main(String[] args) {
		String output=processString("anvit harsh dipali");
		System.out.println(output);
	}

}
