import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(findMax(n,k));
        }

    }
    
    static int findMax(int n, int k) {
		int max = 0;
		for (int a = 1; a <= n; a++) {
			for (int b = a + 1; b <= n; b++) {
				int current = a & b;
				if (current > max && current < k) {
					max = current;
				}
			}
		}
		return max;
	}
}