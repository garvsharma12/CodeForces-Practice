import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		    int tt = sc.nextInt();
		    while(tt-->0){
		        int n = sc.nextInt();
		        List<Integer> arr = new ArrayList<>();
		        for(int i=0 ;i<n ;i++) arr.add(sc.nextInt());
		        int var =1;
		        for(int i=0 ;i<n ;i++){
		            if(arr.get(i)==var) var++;
		            var++;
		        }
		        System.out.println(var-1);
		    }
    }
}
