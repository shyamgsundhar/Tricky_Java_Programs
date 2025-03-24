class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a=0,b=1;
         System.out.println("Using For Loop Method");
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        for(int i =2;i<=n;i++){
        int next = a+b;
        System.out.print(next+"\t");
        a=b;
        b=next;
        }
        System.out.println();
        System.out.println("Using Recursion Method");
         System.out.println("The Recursion is \t"+fibo(n));
    }
    public static int fibo (int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}