import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int n = sc.nextInt();
            int x = sc.nextInt();
            long []a = new long[n];
            
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
               
            }
                
            
            int ans =0;
            for(int i=0;i<n;i++)
            {
                if((a[i]&1) ==1)
                {
                    ans++;
                }
                else if(x>0)
                {
                    ans++;
                    x--;
                }
            }
            System.out.println(ans);
        }
    }
}
