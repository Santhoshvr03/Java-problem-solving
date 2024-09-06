package loopingstate;

class ex7 {

	public static void main(String[] args) {
		int c = 0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				
					for(int k =1;k<=4;k++) {
						if(i!=k && k!=j && j!=i) {
							c++;
							System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		System.out.println("Total no of three digit numbers :"+c);

	}

}
