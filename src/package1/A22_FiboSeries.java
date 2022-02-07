/*Assignment - 22 : 9th Jan'2022

Print fibonacci series for different variations as bellow

1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 
2 . Print first n no of fibonacci series but start no from 5
output : 5 8 13
3 . Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
4 . find how many no. required from fibonacci series to generate sum >=50 . 
output number count : 8

 */
package package1;

public class A22_FiboSeries {
	
	//1 . Print first n no of fibonacci series ( 8 numbers )
	//output : 0 1 1 2 3 5 8 13 
    static void printFibonacciSeries(int n)
	{
		
		int count=0;
		int first=0;
	    int second=1;
	    int temp=0;
		while(n>count) 
		{
			System.out.println(first);
			temp=first;
			first=second;
		    second=temp+second;
		    count++;
		}
	}
	

	//Print first n no of fibonacci series ( 8 numbers )..without third number	
	static void printFibonacciSeriesWithoutThirdVarible(int n) 
	{
		int count=0;
		int first=0;
		int second=1;
		while(n>count) 
		{
			System.out.println("Output without Thid Varible : "+first);
			second=first+second;
			first=second-first;
			count++;
		}
	}
	
	
	// Print first n no of fibonacci series but start no from 5 and End no is 34=>output : 5 8 13 21 34
	static void printFibonacciSeriesFromGivenRange(int startno,int endno) 
	{
		int first=0;
		int second=1;
		while(first<=endno) 
		{
			if(first>=startno)
			System.out.println(first);
			second=first+second;
			first=second-first;
		
		}
	}
	
	//4 . find how many no. required from fibonacci series to generate sum >=50 =>output number count : 8
	static void printFiboSeriesTillSumConditionMatch() 
	{
		int first=0;
	    int second=1;
	    int sum=0;
	    int count=0;
	    while(sum<=50) 
	    {
	    	second=first+second;
	    	first=second-first;
	    	sum=sum+first;
	    	count++;
	    }System.out.println(count+ " no are required to genereate sum greater 50 ");
	}
	
	
	

	public static void main(String[] args) {
		printFibonacciSeries(8);
		printFibonacciSeriesWithoutThirdVarible(8);
		printFibonacciSeriesFromGivenRange(5,34);
	    printFiboSeriesTillSumConditionMatch();
	}

}



