import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [] a = new int [26];
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int t =0;
        for(int i =0;i<n;i++)
        {
            t = s.charAt(i);
            a[t-97]++;
        }
        String ans = "";
        String mid ="";
        boolean flg =false;
        String  repeated ="";
        String temp ="";
        
        for(int i=0;i<26;i++)
        {
            if(a[i]!=1)
            {
                temp =""+ (char)(97+i);
                t = (a[i]/2);
                a[i] = a[i] - (t*2);
                repeated = new String(new char[t]).replace("\0", temp);
                ans = ans+repeated;
                
            }
            if(flg==false && a[i]>0)
            {
                flg=true;
                mid = ""+ (char)(97+i);
            }
        }
        StringBuilder rev = new StringBuilder(ans);
        rev = rev.reverse();
        String part2 = new String(rev);
        ans = ans+mid+rev;
        System.out.println(ans);
        
    }
}
