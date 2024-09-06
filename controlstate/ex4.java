package controlstate;

import java.util.Scanner;

class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a%10==b%10)||(a%10==c%10)||(c%10==b%10)){
			System.out.println("The result is: true");
		}else {
			System.out.println("The result is: false");
		}
	}

}
