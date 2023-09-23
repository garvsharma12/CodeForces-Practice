import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		    if(n<10)
		        System.out.println(n+1);
		    
		    else 
		    {
		        n+=1;
		        while(true)
		        {
		            HashSet<Integer> h = new HashSet<>();
		            String s = Integer.toString(n);
		            int len = s.length();
		            int num=n;
		            while(num>0)
		            {
		                int rem = num%10;
		                h.add(rem);
		                num/=10;
		            }
		            if(h.size()==len )
		            {
		                System.out.println(n);
		                break;
		            }
		            else 
		                n++;
		        }
		    }
            sc.close();
    }
}
