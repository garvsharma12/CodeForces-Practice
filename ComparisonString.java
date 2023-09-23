import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ComparisonString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tt = sc.nextInt();
            while(tt-->0){
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                if(n==1){
                    System.out.println(2);
                    continue;
                }
                ArrayList<Integer> arr = new ArrayList<>();
                int min =0 , max =0;
                if(s.charAt(0)=='<'){
                    arr.add(1);
                    arr.add(2);
                    min=1 ; max=2;
                    for(int i=1 ; i<s.length() ;i++){
                        if(s.charAt(i)=='>'){
                           arr.add(min);
                           min-=1 ; max-=1;
                        }
                        else{
                            min+=1; max+=1;
                            arr.add(max);
                        }
                    }
                }
                else{
                    arr.add(2); arr.add(1);
                    min =1 ; max=2;
                    for(int i=1 ; i<s.length() ;i++){
                        if(s.charAt(i)=='>'){
                            min-=1 ; max-=1;
                            arr.add((min));
                        }
                        else{
                            arr.add(max);
                            min+=1 ; max+=1;
                        }
                    }
                }
                System.out.println(arr);
                HashSet<Integer> hs = new HashSet<>();
                hs.addAll(arr);
                System.out.println(hs.size());
            }
        }
    }
}
