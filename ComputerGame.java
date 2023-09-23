import java.util.Scanner;

public class ComputerGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t =sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                sc.nextLine();
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
                int[] a1 = new int[n];
                int[] a2 = new int[n];
                for(int i=0 ;i<n ;i++)
                    a1[i]= Character.getNumericValue(s1.charAt(i));
                for(int i=0 ;i<n ;i++)
                    a2[i]= Character.getNumericValue(s2.charAt(i));
                
                boolean b = true;
                for(int i=0 ;i<n ;i++){
                    if((a1[i] & a2[i])==1){
                        b=false;
                        System.out.println("NO");
                        break;
                    }
                }
                if(b) System.out.println("YES");
                
            }
        }
    }
}
