package controlstate;

import java.util.Scanner;

class ex1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>0) {
			System.out.println("Positive");
		}else if(n<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}

	}

}
