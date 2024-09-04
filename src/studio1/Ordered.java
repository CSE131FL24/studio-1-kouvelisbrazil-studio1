package studio1;

import java.util.Scanner;

public class Ordered {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean is0rdered;
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		if ((x < y && y < z) || (x > y && y > z))
			{
				is0rdered = true;
			} else {
				is0rdered = false;
			}
		System.out.println(is0rdered);
	}
}