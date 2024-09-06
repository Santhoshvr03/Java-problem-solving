package controlstate;

import java.util.Scanner;

class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>25&&a<75&&b>25&&b<75) {
			if((a%10==b%10)||(a/10==b/10)||(a%10==b/10)||(b%10==a/10)) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
	}

}
