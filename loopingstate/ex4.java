package loopingstate;

import java.util.*;

class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = sc.nextInt();
		int c=0;
		for(int i=a;i<=b;i++) {
			if(i%num==0) {
				c++;
			}
		}
		System.out.println(c);
		sc.close();

	}

}
