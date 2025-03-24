class Add2NumberswithoutplusOperator{
    public static void main(String s[]){
        int a=10,b=15;
        //int i=1;
        while(b!=0){
            //System.out.println("The Step : "+i);
            //i++;
            int carry = (a&b)<<1;
            a=a^b;
            //System.out.println("The a is : "+a);
            //System.out.println("The carry(b) is : "+ carry);
            b=carry;
            //System.out.println();
        }
        
        System.out.println("The Answer is \t"+ a);
    }
}

// ^ ====> Add witout Carry
// & ==> To find the Remaining
