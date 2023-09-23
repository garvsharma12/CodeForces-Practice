import java.util.Scanner;
public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop=sc.nextInt();
        while(loop-->0)
        {
        int n = sc.nextInt();
        int o1=0 , o2=0 , o3=0 , e1=0 , e2=0;
        for(int i=0 ; i<n ; i++)
        {
            int k=sc.nextInt();
            if(k%2==1)
            {
                if(o1==0)
                    o1=i+1;
                else if((o1!=0)&&(o2==0))
                    o2=i+1;
                else if((o1!=0)&&(o2!=0)&&(o3==0))
                    o3=i+1;
            }
            else 
            {
                if(e1==0)
                    e1=i+1;
                else if((e1!=0)&&(e2==0))
                    e2=i+1;
            }
        }
        if((o1!=0)&&(o2!=0)&&(o3!=0))
        {
            System.out.println("YES");
            System.out.println(o1+" "+o2+" "+o3);
        }
        else if(((e1!=0)&&(e2!=0)))
        {
            int out=0;
            if(o1!=0)
                out=o1;
            else if(o2!=0)
                out=o2;
            else if(o3!=0)
                out=o3;
            
            if(out!=0)
            {
                System.out.println("YES");
                System.out.println(out+" "+e1+" "+e2);
            }
            else 
            System.out.println("NO");
        }
        else 
            System.out.println("NO");

    }
        sc.close();
    }
}
