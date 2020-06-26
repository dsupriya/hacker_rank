import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'receivedText' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING S as parameter.
     */

    public static String receivedText(String s) {
    // WRITE DOWN YOUR CODE HERE
        int n = s.length(); 
        boolean f = true;
        
        StringBuilder ans = new StringBuilder();
        int cur =0;
        String digit ="0123456789";
        if(s.contains("*")==false && s.contains(">")==false && s.contains("<")==false && s.contains("#")==false )
            return s;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c=='*')
            {
                if(ans.length()!=0)
                {
                    ans.deleteCharAt(ans.length()-1);
                    cur--;
                    continue;
                }
            }
            else if(c=='>')
            {
                cur=ans.length();
                continue;
                
            }
            else if(c=='<')
            {
                cur=0;
                continue;
            }
            else if(c=='#')
            {
               f=!f;
                continue;
            
                    
            }
            else if(digit.contains(""+c)==true && f==false)
            {
                continue;
            }
            else
            {
                ans.insert(cur, c);
                cur++;
            }
                
        }
        
        String ans1 = new String(ans);
        return ans1;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String S = bufferedReader.readLine();

        String result = Result.receivedText(S);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
