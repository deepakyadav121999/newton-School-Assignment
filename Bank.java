import java.util.Scanner;


class Bank {
    private double bal = 5000;
    private double pwd;

    public void deposite() {


        System.out.println("enter password ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        System.out.println("enter amount you wnat to deposite ");
        int money = sc.nextInt();

        if(pwd ==1234) {


            bal = bal + money;
            System.out.println("deposited money " + money);
            System.out.println("total bal " + bal);
        } else {
            System.out.println("incorrect pwd ");
        }

    }

    public void withdraw() {
        System.out.println("enter pwd ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        System.out.println("enter amount you wnat to withdraw ");
        int money = sc.nextInt();
        if (pwd == 1234) {
            bal = bal - money;
            System.out.println("withdraw ammount " + money);
            System.out.println("total bal " + bal);
        } else {
            System.out.println("incorrect password ");
        }
    }

    public void checkbal() {
        System.out.println("enter password ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if (pwd == 1234) {
            System.out.println("total bal " + bal);

        } else {
            System.out.println("incorrect password");
        }
    }
}
     class custumer {
         public static void main(String[] args) {
             Bank b = new Bank();



             int ch;
             System.out.println("1.deposite money ");
             System.out.println("2. withdraw money ");
             System.out.println("3.check bal ");

             System.out.println("enter your choice ");
             Scanner sc = new Scanner(System.in);
             ch = sc.nextInt();
             switch(ch){
                 case 1:b.deposite();
                 break;
                 case 2:b.withdraw();
                 break;
                 case 3:b.checkbal();
                 break;
                 default:
                     System.out.println("invalid choice");
             }

         }
     }

