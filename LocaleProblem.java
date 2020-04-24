import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.

        NumberFormat us1=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china1=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france1=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat india1=NumberFormat.getCurrencyInstance(new Locale("en","in"));

        String us=us1.format(payment);
        String china=china1.format(payment);
        String france=france1.format(payment);
        String india=india1.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
