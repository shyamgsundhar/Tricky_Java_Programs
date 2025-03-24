class Factorial {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Using For Loop");
        for(int i=1;i<=n;i++){
            System.out.print(factfor(i)+"\t");
        }
        System.out.println();
        System.out.println("Using Recursion");
         for(int i=1;i<=n;i++){
            System.out.print(factrec(i)+"\t");
        }
    }
    public static int factfor(int n){
        int j=1;
        for(int i=2;i<=n;i++){
            j*=i;
        }
        return j;
    }
     public static int factrec(int n){
        if(n<=1) return n;
        return (n*factrec(n-1));
    }
}