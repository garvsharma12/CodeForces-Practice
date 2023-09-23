import java.util.Scanner;

public class PolycrabPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String pi="314159265358979323846264338327";
        sc.nextLine();
        while(loop-->0)
        {
            String s = sc.nextLine();
            int count=0;
            for(int i=0 ; i<s.length() ; i++)
            {
                if(s.charAt(i)==pi.charAt(i))
                    count++;
                else
                    break;
            }
            System.out.println(count);
        }

        sc.close();
    }
}
