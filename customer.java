import java.util.Scanner;

public class customer {

    private String name;
    private double balance;
    private String bank;
    private String type;
    private Integer accountNumber;


    public double accountBalance() {

        return balance;
    }

    public String accountType() {

        if(type.equals("saving")) {

            return "saving";
        }
        else return "checking";

    }


        public String getBank () {

        return bank;
    }

        public Integer accountNumber(){

            System.out.println("Enter account number   ");
            Scanner scanner=new Scanner(System.in);
            accountNumber=scanner.nextInt();

            return accountNumber;




        }
    }

