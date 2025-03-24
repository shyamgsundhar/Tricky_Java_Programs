class GeometricProgression {
    public static void main(String[] args) {
        int a=2;
        int r=3;
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(a+"\t");
            a*=r;
        }
    }
}