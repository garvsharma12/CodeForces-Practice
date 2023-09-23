import java.util.Scanner;
public class CountPairs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc. nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int k  =sc.nextInt();
                sc.nextLine();
                String s=sc.nextLine();
                int[] small = new int[27];
                int[] big = new int[27];

                for(int i=0 ; i<n ;i++)
                {
                    if(Character.isLowerCase(s.charAt(i)))
                    small[s.charAt(i)-97]++;
                }
                for(int i=0 ; i<n ;i++)
                {
                    if(Character.isUpperCase(s.charAt(i)))
                    big[s.charAt(i)-65]++;
                }
                int output=0;
                for(int i=0 ; i<27 ; i++)
                {
                    if(small[i]==big[i])
                    {
                        output+=small[i];
                        small[i]=0 ; big[i]=0;
                    }
                    else if(small[i]!=0 && big[i]!=0)
                    {
                        output+=Math.min(small[i],big[i]);
                        if(small[i]>big[i])
                        {
                            small[i]-=big[i];
                            big[i]=0;
                        }
                        else 
                        {
                            big[i]-=small[i];
                            small[i]=0;
                        }
                    }
                }
                int i=0;
                while(k>0 && i!=26)
                {
                    if(small[i]>1 && big[i]==0)
                    {
                        int o=small[i]/2;
                        if(o<=k){ output+=o;
                            k-=o;}
                        else {output+=k;
                         k=0;}
                    }
                    else if(small[i]==0 && big[i]>1)
                    {
                        int o=big[i]/2;
                        if(o<=k){ output+=o;
                            k-=o;}
                        else {output+=k;
                         k=0;} 
                         
                    }
                    i++;
                }
                System.out.println(output);
            }
        }
    }
}
