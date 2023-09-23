import java.util.Scanner;

public class KitaharaApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i< n ; i++)
            arr[i]=sc.nextInt(); 
        int count1=0 , count2=0;

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]==100)
                count1++;
            else 
                count2++;
        }

        if((n>=1)&&(count1%2!=0)&&(count2==0))
            System.out.println("NO");

        else if((n>=1)&&(count1%2==0)&&(count2==0))
            System.out.println("YES");

        else if((n>=1)&&(count2%2!=0)&&(count1==0))
            System.out.println("NO");

        else if((n>=1)&&(count2%2==0)&&(count1==0))
            System.out.println("YES");

        else if((count1%2!=0)&&(count2%2==0))
            System.out.println("NO");

        else if((count1%2==0)&&(count2%2!=0))
            System.out.println("YES");

        else if((count1%2!=0)&&(count2%2!=0))
            System.out.println("NO");

        else if((count1%2==0)&&(count2%2==0))
            System.out.println("YES");


        sc.close();
    }
}
