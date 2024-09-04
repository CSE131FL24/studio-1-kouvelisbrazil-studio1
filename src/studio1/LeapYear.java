package studio1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int year = in.nextInt();
		if(year % 400 == 0)
		{
			System.out.println(year + " is a leap year: true");
		}
		else
		{
			if(year % 100 == 0)
			{
				System.out.println(year + " is a leap year: false");
			}
			else
			{
				if(year % 4 == 0)
				{
					System.out.println(year + " is a leap year: true");
				}
				else
				{
					System.out.println(year + " is a leap year: false");
				}
			}
		}
		
	}
}