import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int answer[] = bubbleSort(a);
        
        System.out.println("Array is sorted in " + answer[0] + " swaps.");
        System.out.println("First Element: " + answer[1]);
        System.out.println("Last Element: " + answer[2]);
        
    }
    
    public static int[] bubbleSort(int[] a){
        //returns [numSwamps, firstElement, lastElement]        
        int length = a.length;
        int result[] = new int[length];
        int numberOfSwaps = 0;
        
        for (int i = 0; i < length; i++) {
            // Track number of elements swapped during a single array traversal
            
            for (int j = 0; j < length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    //a = swap(a[j], a[j + 1]);                 
                    a = swap(a,j);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        result[0] = numberOfSwaps;
        result[1] = a[0];
        result[2] = a[a.length-1];
        
        //printArray(result);
        //printArray(a);
        
        return result;
    }
    
    public static int[] swap(int array[], int firstIndex){
        int newArray[] = array;
        int newFirst = array[firstIndex+1];
        int newSecond = array[firstIndex];
        newArray[firstIndex] = newFirst;
        newArray[firstIndex+1] = newSecond;
        return newArray;
    }
    
    public static void printArray(int array[]){
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
