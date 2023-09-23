import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int[] count1 = new int[127];
        int[] count2 = new int[127];
        for(int i=0 ; i<s1.length() ; i++)
            count1[s1.charAt(i)]++;
        for(int i=0 ; i<s2.length() ; i++)
            count2[s2.charAt(i)]++;
        boolean b= true;
        for(int i=0 ; i<127 ; i++)
        {
            if(count2[i]>0)
            {
                if(i==32)
                    continue;
                else if(count1[i]<count2[i])
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
