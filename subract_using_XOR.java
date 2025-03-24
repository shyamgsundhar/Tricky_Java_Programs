class subract_using_XOR {
	public static void main(String s[]) {
		int a=15,b=30;
		while(b!=0){
		    int borrow = (~a&b);
		    a=a^b;
		    b=borrow<<1;
		}

		System.out.println("The Answer is \t"+ a);
	}
}
