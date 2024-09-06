package loopingstate;

import java.util.*;

class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer:");
		int num = sc.nextInt();
		int c=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		System.out.println("No of Factors:"+c);
		sc.close();

	}

}
