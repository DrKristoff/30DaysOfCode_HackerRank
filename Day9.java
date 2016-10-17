import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int input = in.nextInt();
        
        System.out.print(factorial(input));

    }
    
    private static int factorial(int num){
        if(num > 1){
            return (num*factorial(num-1));
        } else {
            return 1;
        }
    }
}