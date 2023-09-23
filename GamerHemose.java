import java.util.*;
import java.util.Collections;
public class GamerHemose {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t =sc.nextInt();
			while(t-->0)
			{
				int n =sc.nextInt();
				int h = sc.nextInt();
				ArrayList<Integer> arr = new ArrayList<>(n);
				for(int i=0 ; i<n ;i++)
					arr.add(sc.nextInt());
				
				int num1 =Collections.max(arr);
				arr.remove(Integer.valueOf(num1));
				int num2 = Collections.max(arr);

				if(h%(num1+num2)==0) System.out.println(2*(h/(num1+num2)));
				else if(h%(num1+num2)<=num1) System.out.println((int)(2*Math.floor(h/(num1+num2))+1));
				else System.out.println((int)(2*Math.floor(h/(num1+num2))+2));

				
			}
		}
	}
}