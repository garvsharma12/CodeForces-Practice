import java.util.Arrays;
import java.util.Scanner;
public class NewYearParty
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        int mx = Arrays.stream(arr).max().getAsInt();
        int mn = Arrays.stream(arr).min().getAsInt();

        System.out.println(mx-mn);
        sc.close();
    }
}