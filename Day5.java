import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int i = 0; i <10; i++){
            String result = stringify(N) + " x " + stringify(i + 1) 
                + " = " + stringify(N*(i+1));
            
            System.out.println(result);
            
        }
    }
    
    public static String stringify(int number){
        return String.valueOf(number);
    }
}