package loopingstate;

import java.util.*;
class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int s = 0;		
		if(n<=2) {
			System.out.println(n-1);
		}else {
			int a = 0;
			int b = 1;
			
			for(int i=3;i<=n;i++) {
				s = a+b;
				a=b;
				b=s;
			}
			System.out.println(s);
		}
		
		sc.close();

	}

}
