import java.util.Arrays;
import java.util.Scanner;
public class UnluckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();
        String ns = num;
        String temp="";
        if(ns.length()<n*2)
        {
            temp="0".repeat(n*2-ns.length());
            temp+=ns;
            ns=temp;
        }
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int i=0;
        for(i=0 ; i<n ; i++)
            arr1[i]=Integer.valueOf(ns.charAt(i));

        for(int j=i ,k=0; j<2*n ; j++,k++)
            arr2[k]=Integer.valueOf(ns.charAt(j));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1[0]>arr2[0])
            Big(arr1,arr2,n);
        else if(arr1[0]==arr2[0])
            System.out.println("NO");
        else 
            Small(arr1,arr2,n);

     sc.close();   
    }
    static void Big(int[] arr1 ,int[] arr2 , int n)
    {
        boolean flag = true;
        for(int i=0 , j=0 ; i!=n ; i++ , j++)
        {
            if((arr1[i]<arr2[j])||(arr1[i]==arr2[j]))
            {
                System.out.println("NO");
                flag=false;
                break;
            }
        }
        if(flag)
        System.out.println("YES");
    }

    static void Small(int[] arr1 ,int[] arr2 , int n)
    {
        boolean flag = true;
        for(int i=0 , j=0 ; i!=n ; i++ , j++)
        {
            if((arr1[i]>arr2[j])||(arr1[i]==arr2[j]))
            {
                System.out.println("NO");
                flag=false;
                break;
            }
        }
        if(flag)
        System.out.println("YES");
    }

}
