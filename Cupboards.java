import java.util.Scanner;
public class Cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n*2];
        for(int i=0 ; i<n*2 ; i++)
            arr[i]=sc.nextInt();
        int count=0;
        int l0 =0, l1 =0 , r0 =0 , r1=0;
        int Lreq=0 , Rreq=0;
        for(int i=0 , j=1 ; i<=(n*2)-2 && j<=(n*2)-1 ; i+=2 , j+=2)
        {
            if(arr[i]==0)
                l0++;
            else if(arr[i]==1)
                l1++;

            if(arr[j]==0)
                r0++;
            else if(arr[j]==1) 
                r1++;   
        }
        if(l0>l1)
            count+=l1;
        if(l0==l1)
            count+=l0;
        if(l1>l0)
            count+=l0;
        if(r0>r1)
            count+=r1;
        if(r0==r1)
            count+=r0;
        if(r1>r0)
            count+=r0;
        //System.out.println(l0+" "+l1+" "+r0+" "+r1);
        //System.out.println(Lreq+" "+Rreq);
        System.out.println(count);

        sc.close();
    }
}
