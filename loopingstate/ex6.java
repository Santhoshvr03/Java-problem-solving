package loopingstate;

import java.util.Scanner;

class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = 0;
        if(n<0 || m<0) {
        	System.out.println(-1);
        }else {        
        for(int i=1;i<=n && i<=m;i++) {
            if(n%i==0 && m%i==0) {
                gcd = i;
            }
        }    
        }System.out.println(gcd);
        sc.close();
    }

}
