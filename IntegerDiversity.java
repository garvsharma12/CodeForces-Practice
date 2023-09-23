import java.util.Scanner;

public class IntegerDiversity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            int[] arr = new int[201];
            int t = sc.nextInt();
            int zr =0 , num = 0 , count=0;

            for(int i=0 ;i<t ;i++){
                  num=sc.nextInt();
                  if(num==0){ zr++;
                    if(zr==1) count++;
                  }
                  else if(num>0){
                    if(arr[num]==0){
                        count++;
                        arr[num]=1;
                    }
                    else if(arr[num]==1 && arr[Math.abs(num)+100]==0){
                        count++;
                        arr[Math.abs(num)+100]++;
                    }
                    
                  }
                  else{
                    if(arr[Math.abs(num)+100]==0){
                        count++;
                        arr[Math.abs(num)+100]++;
                    }
                    else if(arr[Math.abs(num)+100]==1 && arr[Math.abs(num)]==0)
                    {
                        arr[Math.abs(num)]=1;
                        count++;
                    }
                  }
            }
            System.out.println(count);

        }
    }
}
