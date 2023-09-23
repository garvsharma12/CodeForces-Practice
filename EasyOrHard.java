import java.util.Scanner;

public class EasyOrHard
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0 ; i<size ; i++)
            arr[i]=sc.nextInt();
        boolean b = true;
        for(int i=0 ; i<size ; i++)
        {
             if(arr[i]==1)
             {
                System.out.println("HARD");
                b=false;
                break;
             }
        }
        if(b==true)
            System.out.println("EASY");
        sc.close();
    }
}