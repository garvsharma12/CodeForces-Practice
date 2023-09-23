import java.util.Scanner;
public class CinemaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        int n = sc.nextInt();
        int[] arr = new int[3];
        for(int i=0 ; i<n ; i++)
        {
            int u = sc.nextInt();
            if(u==25)
                arr[0]++;

            else if(u==50)
            {
                if(arr[0]>=1)
                {
                    arr[1]++;
                    arr[0]--;
                }
                else 
                {
                    System.out.println("NO");
                    b=false;
                    break;
                }
            }
            else 
            {
                if((arr[1]>=1)&&(arr[0]>=1))
                {
                    arr[2]++;
                    arr[1]-- ;
                    arr[0]--;
                }
                else if((arr[0]>=3)&&(arr[1]==0))
                {
                    arr[2]++;
                    arr[0]-=3;
                }
                else
                {
                    System.out.println("NO");
                    b=false;
                    break;
                }
            }
        }  
        if(b) System.out.println("YES");
        sc.close();
    }
}
