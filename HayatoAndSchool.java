import java.util.Arrays;
import java.util.Scanner;

public class HayatoAndSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i< n ; i++)
            arr[i]=sc.nextInt();
        int i=-1 , j=-1 , k=-1;
        Arrays.sort(arr);

        for(int x=0 ; x<n ; x++)
        {
            if(arr[x]%2==1)
            {
                i=x;
                break;
            }
        }
        for(int x =i+1 ; x<n ; x++)
        {
            if(arr[x]%2==1)
            {
                j=x;
                break;
            }
        }
        for(int x=j+1 ; x<n ; x++)
        {
            if(arr[x]%2==1)
            {
                k=x;
                break;
            }
        }

        if((i!=-1)&&(j!=-1)&&(k!=-1))
        {
            int[] out = new int[3];
            out[0]=i+1 ; out[1] = j+1 ; out[2]=k+1;
            System.out.println("YES");
            for(int c=0 ; c<3 ; c++)
                System.out.print(out[c]+" ");

                System.out.println();
        }
        else 
        {
            if((i!=-1)&&(j==-1)&&(k==-1))
            {
                for(int p=0 ; p< n ; p++)
                {
                    if(arr[p]%2==0)
                    {
                        j=p;
                        break;
                    }
                }

                for(int p=j+1 ; p< n ; p++)
                {
                    if(arr[p]%2==0)
                    {
                        k=p;
                        break;
                    }
                }
            if((i==-1)||(j==-1)||(k==-1))
                System.out.println("NO");
            else 
            {
            int[] out = new int[3];
            out[0]=i+1 ; out[1] = j+1 ; out[2]=k+1;
            System.out.println("YES");
            for(int c=0 ; c<3 ; c++)
                System.out.print(out[c]+" ");

                System.out.println();
            }
                
            }

            else if((i==-1)&&(j!=-1)&&(k!=-1))
            {
                for(int p=0 ; p< n ; p++)
                {
                    if(arr[p]%2==0)
                    {
                        i=p;
                        break;
                    }
                }

                for(int p=i+1 ; p< n ; p++)
                {
                    if(arr[p]%2==0)
                    {
                        k=p;
                        break;
                    }
                }
                int[] out = new int[3];
            out[0]=i+1 ; out[1] = j+1 ; out[2]=k+1;
            System.out.println("YES");
            for(int c=0 ; c<3 ; c++)
                System.out.print(out[c]+" ");

                System.out.println();
                
            }
            else if((i!=-1)&&(j==-1)&&(k!=-1))
            {
                for(int p=0 ; p< n ; p++)
                {
                    if(arr[p]%2==0)
                    {
                        i=p;
                        break;
                    }
                }

                for(int p=j+1 ; p< n ; p++)
                {
                    if(arr[p]%2==0)
                    {
                        k=p;
                        break;
                    }
                }
            if((i==-1)||(j==-1)||(k==-1))
                System.out.println("NO");
            else 
            {
                int[] out = new int[3];
            out[0]=i+1 ; out[1] = j+1 ; out[2]=k+1;
            System.out.println("YES");
            for(int c=0 ; c<3 ; c++)
                System.out.print(out[c]+" ");

                System.out.println();
            }
                
            }
            else 
                System.out.println("NO");

    }

}
        sc.close();
    }
}
