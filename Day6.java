import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int rows = in.nextInt();
        int i = 0;
        
            while(in.hasNext()){
                String nextString = in.next();
            
            for(int j = 0; j < nextString.length(); j++){
                if(j%2==0){
                  System.out.print(nextString.charAt(j));  
                }                        
            }

            System.out.print(" ");
            
            for(int j = 0; j < nextString.length(); j++){
                if(j%2==1){
                  System.out.print(nextString.charAt(j));  
                }        
            }
            
            System.out.println("");
                i += 1;
                
            }
            
            
        }

}