import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        for(int i = 0;i<numCases;i++){
          determineIfPrime(scanner.nextInt());  
        }
        
    }
    
    public static void determineIfPrime(int input){
        if(input==1){
            System.out.println("Not prime");
            return;
        }
        int maxIntForLoop = (int)Math.ceil(Math.sqrt(input));
        for(int i = 2; i < maxIntForLoop; i++){
            if(input%i==0){
                System.out.println("Not prime");
                return;               
            }
        }
        System.out.println("Prime");
    }
}