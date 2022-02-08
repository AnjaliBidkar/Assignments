/*Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41

 */
package package1.A23;

public class A23_P2_String {
	
	static int sumOfNumberInString(String name) 
	{
		String temp="";
		int sum=0;
		for(int index=0;index<name.length();index++) 
		{
			if(Character.isDigit(name.charAt(index))) 
			{
				temp=temp+name.charAt(index);
			}
			else if(temp!="")
			{
				int num=Integer.parseInt(temp);
				sum=sum+num;
				temp="";
			}
		}
		if(temp!="")
		{
			int num=Integer.parseInt(temp);
			sum=sum+num;
			temp="";
		}
		return sum;
		
	}


	public static void main(String[] args) {
		int output=sumOfNumberInString("te12ch22nocre3dits4");
		System.out.println(output);
		
	}

}
