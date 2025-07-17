
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.time.LocalTime;
import java.time.LocalDate;

public class MiniBank {
    double accountBalance;                  // available account balance
    String bankName;                        // Bank name
    String dateTime;                        // date and time
    int Age;                                // age of the client
    String name;                            // name of the client
    int s=0;                                // number of customers
    double minimumBalance;                  // The minimum balance
    int accountNumber;                      // customer account number
    Scanner s1=new Scanner(System.in);      // To read user input
    Scanner s2;                             // To read a file from the package

    public MiniBank() throws FileNotFoundException {
         s2 = new Scanner(new File("C:\\Users\\CodeLine\\Documents\\minibank\\fund.txt"));// reads the funds from a file


    }

    public static void main(String[] args) throws IOException {

        Scanner s1=new Scanner(System.in);      // To read user input

        HashMap<Integer, Set<Object>> Accounts = new HashMap<>();


        boolean Exit=false;
        Integer choice;
        while ( Exit ==false){
          //  MiniBank bank = new MiniBank();      // Calling the object from the constructor class
            System.out.println("Enter Choice of operation:\n 1.Create Account \n 2. Deposit \n 6. Exit"); // displays final account balance
            choice = Integer.parseInt(s1.nextLine());

            switch(choice) {
                case 1: createAccount(Accounts);  break;             // Runs the function createAccount
                case 2:deposit(); break;                    // Runs deposit
                case 3:withdraw();                    //Runs withdraw
                case 4:customerData();                // Runs customer data
                case 6: Exit=true;
                System.out.println("Program Ended Thank you" ); // displays final account balance
            }

        }
    }

    public static void createAccount( HashMap<Integer, Set<Object>> Accounts ){               // function that creates account

        Scanner s1 = new Scanner(System.in);

        System.out.println("please enter your name  ") ;
        String name= s1.nextLine();                    // takes name input from user

        System.out.println("please enter your age  ") ;
        Integer Age= Integer.parseInt (s1.nextLine());  // takes Age input from user

        System.out.println("account number  ");
        Integer accountNumber= s1.nextInt();            // takes account input from user
        s1.nextLine();

        System.out.println("your account in    " );
        String bankName= s1.nextLine();                // takes bank name input from user

        System.out.println("please the initial balance  ") ;
        Double intialBalance= Double.parseDouble (s1.nextLine());  // takes Age input from user


        Set<Object> customerInfo = new HashSet<>();
        customerInfo.add(name);
        customerInfo.add(Age);
        customerInfo.add(bankName);
        customerInfo.add(intialBalance);
        Accounts.put(accountNumber, customerInfo);




    }


    public  static void deposit() throws FileNotFoundException {                    // function that reads the amount of funds

        double fund ;
        Scanner s2;
        s2 = new Scanner(new File("C:\\Users\\CodeLine\\Documents\\minibank\\fund.txt"));// reads the funds from a file
        fund=s2.nextDouble();
        if (fund > 0.0) {
            customer.accountBalance((int) fund);
            LocalTime currentTime=LocalTime.now();
            System.out.println("Deposited amount of  "+ fund+"  at " + currentTime);
        } else {
            System.out.println("insufficient fund");
        }

    }


    public  static void withdraw(){

        System.out.println("Enter amount to withdraw: ");
        double amount = s1.nextDouble();

        if (amount <= accountBalance && amount >= 0.0) {
            accountBalance -= amount;
            LocalTime currentTime=LocalTime.now();
            System.out.println("Withdrawal successful. New balance: " + accountBalance+" deposited at");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }

    }


    public static void customerData() throws IOException {

        List<String> accounts= new ArrayList<>();
        accounts.add(name);
        System.out.println("accounts added\t"  + accounts);


        HashMap<String,Integer> map1= new HashMap<>();
        map1.put("nasser", 124345345);
        map1.put("abdullah", 456765756);
        map1.put("ahmed", 54676657);
        map1.put(name,accountNumber);
        FileWriter file1=new FileWriter("customerdata.txt",true);
        file1.write(name + " : "+ accountNumber+ " : "+bankName+" \n ");
        file1.close();

        System.out.println("enter customer data ");
        s1.nextLine();
        String search=s1.nextLine();

        if(map1.containsKey(search)){

            System.out.println("account found\t" + map1.get(search));


        }
        else {
            System.out.println("invalid account");
        }



        }


    }










