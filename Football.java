import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        String[] arr = new String[loop];
        sc.nextLine();
        for(int i=0 ; i<loop ; i++)
            arr[i]=sc.nextLine();

        int count1=0 , count2=0;
        String team2="";
        for(int i=0 ; i<loop ; i++)
        {
            if(arr[i].equals(arr[0]))
                count1++;
            else 
            {
                count2++;
                team2=arr[i];
            }
        }
        if(count1>count2)
            System.out.println(arr[0]);
        else 
            System.out.println(team2);

        sc.close();
    }
}
