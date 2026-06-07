import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("options:\n1:Check Balance\n2:Cash Withdraw\n3:Bank Name Check");
        System.out.print("Enter the Option:");
        int option = sc.nextInt();
        int balance=10000;
        switch(option){
            case 1:
                System.out.println("Balance:"+balance);
                break;
            case 2:
                System.out.print("Enter the Amount For Withdraw:");
                int amount = sc.nextInt();
                int remain = balance-amount;
                System.out.println("Remaining Balance:"+remain);
                break;
            case 3:
                System.out.println("Bank Name:SBI");
        }
    }
}
