import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        int max = getHourGlassSum(0,0,arr);
        
        for(int i = 0; i <4; i++){
            for(int j =0; j < 4;j++){
                int currHourGlassSum = getHourGlassSum(i,j,arr);
                max = (currHourGlassSum>max) ? currHourGlassSum : max;
                }
                
            }
        
        System.out.println(max);
        }
    
    
    
    private static int getHourGlassSum(int r, int c, int[][] arr){
        return arr[r][c] + arr[r][c+1]+arr[r][c+2]
            + arr[r+1][c+1]
            + arr[r+2][c] + arr[r+2][c+1]+arr[r+2][c+2];
        
        
    }
}