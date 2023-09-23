import java.util.Scanner;

public class MinArrayDif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            int size = sc.nextInt();
            int[] a = new int[size];
            int[] b = new int[size];

            for(int i=0 ; i<size ; i++)
                a[i]=sc.nextInt();
            for(int i=0 ; i<size ; i++)
                b[i]=sc.nextInt();

            for(int i=0 ; i<size-1 ; i++)
            {
                int res=0;
                if((Math.abs(a[i]-a[i+1]))==(Math.abs(a[i+1]-b[i+1])))
                {
                    res=a[i+1];
                    a[i+1]=b[i+1];
                    b[i+1]=res;
                }
            }
            int Tsum=0;
            int sumA=0 , sumB=0;
            for(int i=0 ; i< size-1 ; i++)
                sumA+=(Math.abs(a[i]-a[i+1]));

            for(int i=0 ; i< size-1 ; i++)
                sumB+=(Math.abs(b[i]-b[i+1]));

            Tsum=sumA+sumB;
            System.out.println(Tsum);
        }
        sc.close();
    }
}
