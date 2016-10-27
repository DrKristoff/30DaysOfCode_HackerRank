import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] returnDate = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
        int[] dueDate = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
        
        if(returnDate[2]<dueDate[2]){
            System.out.println(0);
        } else {
          if(returnDate[2]>dueDate[2]){
            System.out.println(10000);            
        } else if (returnDate[1] > dueDate[1]){
            System.out.println(500*(returnDate[1] - dueDate[1]));
        }  else if (returnDate[0] > dueDate[0]){
            System.out.println(15*(returnDate[0] - dueDate[0]));
        } else {
            System.out.println(0);
        }
            
        }

    }
}