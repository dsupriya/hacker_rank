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
            long time = sc.nextInt();
            long x = sc.nextInt();
            //x =x+x;
            time = time*60;
            long ans = ((time)*x)/2;
            System.out.println(ans);
        }
        
    }
}
