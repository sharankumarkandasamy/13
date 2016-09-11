package guvi;

import java.util.Scanner;

public class keypad 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your numbers");
		String str = s.next();
		String word[] = str.split("");
		for (int i = 0; i < str.length(); i++) {
			int j = Integer.parseInt(word[i]);
			switch (j) {
			case 2:
				System.out.print("ABC");
				break;
			case 3:
				System.out.print("DEF");
				break;
			case 4:
				System.out.print("GHI");
				break;
			case 5:
				System.out.print("JKL");
				break;
			case 6:
				System.out.print("MNO");
				break;
			case 7:
				System.out.print("PQRS");
				break;
			case 8:
				System.out.print("TUV");
				break;
			case 9:
				System.out.print("WXYZ");
				}
		}
		s.close();
	}

}
