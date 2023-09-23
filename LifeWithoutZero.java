import java.util.Scanner;

public class LifeWithoutZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        long sum = num1+num2;
        String n = Long.toString(sum);
        n = n.replaceAll("0+","");
        int sum1 = Integer.parseInt(n);
        String str1 = Integer.toString(num1) , str2 = Integer.toString(num2);
        str1 = str1.replaceAll("0+","");
        str2 = str2.replaceAll("0+","");
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        long sumX = num1+num2;
        if(sumX==sum1) System.out.println("YES");
        else System.out.println("NO");
    }
}
