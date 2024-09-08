
import java.util.Scanner;

public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String[] arr = sc.nextLine().split(" ");
            go(arr[0],arr[1]);
        }
    }
    static void go(String org , String chk){
        int n = org.length() , m = chk.length();
        int[] freq1 = new int[26];
        for(int i=0 ;i<n;i++) freq1[org.charAt(i)-'A']++;

        int[] freq2 = new int[26];
        for(int i=0 ;i<m;i++) freq2[chk.charAt(i)-'A']++;

        for(int i=0;i<26 ; i++) freq1[i]-=freq2[i];
        char[] array = org.toCharArray();
        for(int i=0 ; i<26 ; i++){
            if(freq1[i]!=0){
                int val = freq1[i];
                char c = (char)(i+65);
                int idx=0;
                while(val>0){
                    if(array[idx]==c){
                        array[idx]='0';
                        val--;
                    }
                    idx++;
                }
            }
        }
        String res ="";
        for(char k:array){
            if(k!='0') res+=""+k;
        }
        String output = res.equals(chk)?"YES":"NO";
        System.out.println(output);
    }
}
