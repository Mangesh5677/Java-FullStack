
import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
       int num[] = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 5 numbers");
       for(int i=0;i<num.length;i++){
        num[i] = sc.nextInt();
       }
       System.out.println("The numbers are:");
       for(int i=0;i<num.length;i++){
        System.out.print(num[i] + "  ");
       }
    }
}
