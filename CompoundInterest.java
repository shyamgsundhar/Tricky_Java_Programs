class CompoundInterest {
    public static void main(String[] args) {
        double P=10000;
        double r =5;
        double t=3;
        double ci =  P * (Math.pow(1+r/100,t))-P;
        System.out.println("The Compund Interest is \t"+ci);
    }
}