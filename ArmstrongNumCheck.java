//Armstrong number code

package com;

import java.util.Scanner;

public class AmstrongNumCheck {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		AmstrongNumCheck a = new AmstrongNumCheck();
		int result = a.armstrongCheck(num);
		if (num == result) {
			System.out.println(num + " is a armstrong number");
		}
		else {
			System.out.println(num + " is not a armstrong number");
		}
		scan.close();
		system.out.println("yes")
	}
	
	int armstrongCheck(int num) {
		int result = 0;
		while(num != 0) {
			int digit = num % 10;
			result = result + (digit*digit*digit);
			num = num/10;
		}
		return result;
	}
}
