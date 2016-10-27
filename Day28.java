import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String myRegExString = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*+@gmail.com";
        Pattern p = Pattern.compile(myRegExString);
        ArrayList<String> list = new ArrayList<>();
                       
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            
            if(m.find()){
                list.add(firstName);
            }
        }
        
        Collections.sort(list);
        
        for(String s : list){            
                System.out.println(s);
        }
    }
}