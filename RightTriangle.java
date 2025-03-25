class RightTriangle {
    public static void main(String[] args) {
       int n=4;
       //For Column
       for(int i=0;i<n;i++){
           for(int k=0;k<=i;k++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}