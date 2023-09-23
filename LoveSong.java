import java.util.Scanner ;
public class LoveSong {   
    public static void main ( String [] args ) {   
        try ( Scanner sc = new Scanner ( System . in )) {    
            int n = sc.nextInt ();
            int q = sc.nextInt ();
            sc.nextLine ();
            String s = sc.nextLine ();
            int[] prefix=new int[n+1];
            for(int i=1;i<=n;i++){
                prefix[i]=prefix[i-1]+s.charAt (i-1) - 96;
            }
            for ( int i = 0 ; i < q ; i ++)
            {
                int l = sc.nextInt ();
                int r = sc.nextInt ();
                
                
                System.out.println (prefix[r]-prefix[l-1] );
            }
        }
    }
}