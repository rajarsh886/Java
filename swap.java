// SWAP A NUMBER USING JAVA with THIRD VARIABLE
public class swap {
    public static void main(String args[]) {
        int a = 10; // First number
        int b = 20; // Second number
        int temp;   // Temporary variable for swapping

        // Display values before swapping
        System.out.println("Value before swapping: a = " + a + ", b = " + b);

        // Swapping process
        temp = b; // Store the value of b in temp
        b = a;    // Assign the value of a to b
        a = temp; // Assign the value of temp (original b) to a

        // Display values after swapping
        System.out.println("Value after swapping: a = " + a + ", b = " + b);
    }
}
