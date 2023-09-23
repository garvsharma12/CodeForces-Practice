import java.util.Scanner;
public class ChewbacandNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            for(int i=arr.length-1 ; i>=0 ; i--){
                int val = Character.getNumericValue(arr[i]);
                //System.out.println(val);
                if(i==0 && 9-val!=0 && 9-val<val) arr[i]=(char)(9-val+'0');
                else if(i==0 && 9-val==0) continue;
                else if(9-val<val && 9-val<val) 
                    arr[i]=(char)(9-val+'0');
            }
            String str = String.copyValueOf(arr);
            System.out.println(str);
        }

    }
}
