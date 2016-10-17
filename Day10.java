import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in .nextInt();
  String binaryString = Integer.toBinaryString(n);
  //System.out.println(binaryString);
  int count = 0;
  int max = 0;

  for (int i = 0; i < binaryString.length(); i++) {
      //System.out.println("i: " + i);
      //System.out.println("char: " + binaryString.charAt(i));
      if (binaryString.charAt(i) == ("1").charAt(0)) {
        count += 1;
        //System.out.println("count: " + count);
        if (count >= max) {
            max = count;
            //System.out.println("newmax: " + max);
        }
      } else {
        count = 0;
      }
  }

  System.out.print(max);
 }

}