package controlstate;

import java.util.Scanner;

class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gen = sc.nextLine();
		int age = sc.nextInt();
		if(gen.equals("Female")&&(age>1||age<=58)) {
			String si = "8.2%";
			System.out.println("Percentage of Interest is "+si);
		}else if(gen.equals("Female")&&(age>59||age<=100)) {
			String si = "9.2%";
			System.out.println("Percentage of Interest is "+si);
	}else if(gen.equals("Male")&&(age>1||age<=58)) {
		String si = "8.4%";
		System.out.println("Percentage of Interest is "+si);
	}else if(gen.equals("Male")&&(age>59||age<=100)) {
		String si = "10.5%";
		System.out.println("Percentage of Interest is "+si);
	}
}
}
