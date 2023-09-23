import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HungrySequence {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long j=0;
        for(int i=1 ;i<=n ; i++)
        {
            long val = 3*n+j;
            System.out.print(val+" ");
            j++;
        }
    }
}
