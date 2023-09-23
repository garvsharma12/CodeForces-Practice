import java.util.ArrayList;
import java.util.Scanner;

public class XeniaAndDivisors
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean b = true;
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
            if((arr[i]==5)||(arr[i]==7))
                b=false;
        }
        int[] count = new int[8];
        for(int i=0 ; i<n ; i++)
            count[arr[i]]++;
        if(b)
        {
            if((arr[1]!=n/3)||(count[4]>count[2])||(count[3]>count[6])||(count[2]>count[1])||(count[3]>count[1])||(count[4]>count[1])||(count[6]>count[1]))
                System.out.println(-1);
            else if((count[1]==n)||(count[2]==n)||(count[3]==n)||(count[4]==n)||(count[6]==n))
                System.out.println(-1);
            else 
            {
                
            }
            for(int i=0 ; i<output.size() ; i++)
            {
                System.out.print(output.get(i)+" ");
                if((i+1)%3==0)
                    System.out.println();

            }
        }   
        else 
            System.out.println(-1);     

        sc.close();
    }
}