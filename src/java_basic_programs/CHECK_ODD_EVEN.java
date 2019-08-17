package java_basic_programs;

import java.util.Scanner;

public class CHECK_ODD_EVEN {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter an integer number");
		
		//the input provided by user is stored in num
		Scanner input=new Scanner(System.in);
		
		num=input.nextInt();
		
		//if number is divisible by 2 then it's even number
		//if not that's odd number
		
		if(num % 2 == 0)
			System.out.println("entered number is even");
		else
			System.out.println("entered number is odd");

	}

}
