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
     * Complete the 'maxXorValue' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING x
     *  2. INTEGER k
     */

    public static String maxXorValue(String x, int k) {
    // Write your code here
        int n = x.length();
        String ans = "";
        for(int i=0;i<n;i++)
        {
            char c = x.charAt(i);
            if(c=='1')
            {
                ans =ans+"0";
            }
            else if(k>0)
            {
                ans=ans+"1";
                k--;
            }
            else
            {
                ans=ans+"0";
            }
        }
        return ans;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                int k = Integer.parseInt(bufferedReader.readLine().trim());

                String y = Result.maxXorValue(s, k);

                bufferedWriter.write(y);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
