public class swapwithouttemp {
    public static void main(String[] args) {
         int num1=2;
         int num2=3;

         System.out.println("before swapping numbers are num1="+num1+" & num2="+num2);

         num1=num1+num2;
         num2=num1-num2;
         num1=num1-num2;


        System.out.println("after swapping numbers are num1="+num1+" & num2"+num2);
    }
}
