package controlstate;

import java.util.Scanner;

class ex2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>0&&b>0) {
			if((a%10)==(b%10)) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}

	}

}
