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
     * Complete the 'getMaxScore' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING jewels as parameter.
     */

    public static int getMaxScore(String jewels) {
    // Write your code here
        StringBuilder s = new StringBuilder(jewels);
        int i=1;
        int temp;
        int n = s.length();
        int ans =0;
        while(i>=0 && i<s.length())
        {
            if(i==0)
                i++;
            if(s.charAt(i)==s.charAt(i-1))
            {
                ans++;
                temp=i;
                s.deleteCharAt(i);
                s.deleteCharAt(i-1);
                i=i-1;
            }
            else
            {
                i++;
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
                String jewels = bufferedReader.readLine();

                int ans = Result.getMaxScore(jewels);

                bufferedWriter.write(String.valueOf(ans));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
