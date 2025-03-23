class Main {
	public static void main(String s[]) {
		int a=10,b=15;
		while(b>0) {
			a++;
			b--;
			System.out.println("The a is \t"+a);
			System.out.println();
			System.out.println("The b is \t"+b);
			System.out.println();
		}
		while(b<0) {
			a--;
			b++;
			System.out.println("The a is \t"+a);
			System.out.println();
			System.out.println("The b is \t"+b);
			System.out.println();
		}

		System.out.println("The Answer is \t"+ a);
	}
}
