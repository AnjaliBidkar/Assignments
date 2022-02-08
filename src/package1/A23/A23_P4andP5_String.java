/*
 Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6

Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)


 */
package package1.A23;

public class A23_P4andP5_String {
	
	static int diffOfNumberInString(String name) 
	{
		String temp="";
		int even=0;
		int odd=0;
		for(int index=0;index<name.length();index++) 
		{
			if(Character.isDigit(name.charAt(index))) 
			{
				temp=temp+name.charAt(index);
			}
			else if(temp!="")
			{
				int num=Integer.parseInt(temp);
				if(num%2==0)
					even=even+num;
				else
					odd=odd+num;
				temp="";
			}
		}
		if(temp!="")
		{
			int num=Integer.parseInt(temp);
			if(num%2==0)
				even=even+num;
			else
				odd=odd+num;
			temp="";
		}
		return (even-odd);
		
	}
	

	public static void main(String[] args) {
		int output1=diffOfNumberInString("tec5hno3cre6di1ts");
		System.out.println(output1);
		int output2=diffOfNumberInString("te112ch34no29");
		System.out.println(output2);

	}

}
