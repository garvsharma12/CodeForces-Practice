import java.util.*;

public class Subsequence{
	
	//function to find where the bit is set
	public static String print(String s , int i){
		
		int j = 0;
		String sub ="";
		
		//finding the bit is set
		while(i>0){
			if((i & 1) == 1){
				sub +=""+s.charAt(j);
			}
			j++;
			i = i>>1;
		}
		return sub;
	}
	
	//function to create sub-sets
	public static List<String> createsubsets(String s){
		
		List<String> res = new ArrayList<>();
		for(int i = 0 ; i < (1<<s.length()) ; i++){
			res.add(print(s,i));
		}
		return res;
	}
	
	//main function to call
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		
		// vector of strings to store all sub-sequences
		List<String> print = createsubsets(s);

		// print the subsets
		for(int i=0 ; i<print.size() ; i++)
        {
            String p = print.get(i);
            if((p.length()<=1))
                print.remove(p);
        }
        System.out.println(print);
	}
}
// This code contributed by Srj_27
