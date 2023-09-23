import java.util.Scanner;

public class ASumB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        sc.nextLine();
        while(loop-->0)
        {
        String s = sc.nextLine();
        int sum=0;
        if(s.length()==3)
        {
            sum+=Character.getNumericValue(s.charAt(0));
            sum+=Character.getNumericValue(s.charAt(2));
        }
        else
        {
            sum+=Character.getNumericValue(s.charAt(0));
            sum+=Character.getNumericValue(s.charAt(1));
            
        }
        System.out.println(sum);
        }
        sc.close();
    
    }
}
