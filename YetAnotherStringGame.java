import java.util.Scanner;

public class YetAnotherStringGame{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t =sc.nextInt();
            sc.nextLine();
            while(t-->0){
                String s = sc.nextLine();
                char[] arr = s.toCharArray();
                for(int i=0 ;i<s.length() ;i++){
                    if(i%2==0){
                        if(arr[i]=='a') arr[i]='b';
                        else arr[i]='a';
                    }
                    else{
                        if(arr[i]=='z') arr[i]='y';
                        else arr[i]='z';
                    }
                }
                String a = new String(arr);
                System.out.println(a);
            }
        }
    }
}