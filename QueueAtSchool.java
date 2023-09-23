import java.util.Scanner;
public class QueueAtSchool
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String temp1= s;
        String temp2=s;
        boolean b = true;
        //boolean t = true;
        char[] arr = s.toCharArray();
        while(n1-->0)
        {
            for(int i=0 ; i<n-1 ; i++)
            {
                if((arr[i]=='B')&&(arr[i+1]=='G'))
                {
                    arr[i]='G';
                    arr[i+1]='B';
                    i++;
                }
            }
            temp1=String.valueOf(arr);
        
        if(temp1.equals(temp2))
        {
            System.out.println(temp1);
            b=false;
            break;
        }

    }
    if(b)
        System.out.println(temp1);
    sc.close();
    }
}