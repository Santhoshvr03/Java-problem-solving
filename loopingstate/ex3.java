package loopingstate;

import  java.util.*;
class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int s =0;
		while(n>0) {
			int temp = n%10;
			s = (s*10)+temp;
			n = n/10;
			
		}
		System.out.print(s);
		sc.close();

	}

}
