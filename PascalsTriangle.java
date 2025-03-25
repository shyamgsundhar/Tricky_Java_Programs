class PascalsTriangle {
    public static void main(String[] args) {
       int n=5;
       //For Column
       for(int i=0;i<n;i++){
           //For Space
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           int a=1;
           //For Element
           for(int k=0;k<=i;k++){
               System.out.print(a+ " ");
               a=a*(i-k)/(k+1);
           }
           System.out.println();
       }
    }
}