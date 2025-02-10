public class swappusingtemp {


    public static void main(String[] args) {
        
        int num1=2;
        int num2=3;

        System.out.println("before swapping numbers are : num1= "+num1+" & num2= "+num2);

        //using temprorary varibale

        int temp =0;
         temp = num1;
         num1 = num2;
         num2 = temp;

         System.out.println("after sswapping numbers are : num1="+num1+" & num2="+num2);

    }
    
}
