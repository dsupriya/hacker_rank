import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";
        String largest = "A";
        int n = s.length();
        int min_value = 'z'; 
        int max_value = 'A';
        int min,max;
        min= max = 0;
        for (int i = 0; i <= s.length() - k; i++) {
        String str = s.substring(i, i+k);

        if (smallest == null || str.compareTo(smallest) < 0) {
            smallest = str;
        }
        if (largest == null || str.compareTo(largest) > 0){
            largest = str;
        }
    }
        /*for(int i=0;i<(n-k+1);i++)
        {
            int t = s.charAt(i);
            if(t>max_value)
            {
                 max= i;
                 max_value =t;
            }
               
            if(t<min_value)
            {
                 min =i;
                 min_value = t;
            }
               
        }*/
        //System.out.print
       

        
       
        
        return smallest + "\n" + largest;
    }

