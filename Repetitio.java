import java.util.Scanner;

public class Repetitio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int mx = Integer.MIN_VALUE;
        int temp=1;
        int n = s.length();
        for(int i=0 ; i<n-1 ; i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
                temp++;
            else 
            {
                mx=Math.max(temp,mx);
                temp=1;
            }
        }
        if(temp>mx) 
            System.out.println(temp);
        else 
        System.out.println(mx);

        sc.close();
    }
}
