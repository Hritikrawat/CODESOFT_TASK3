import java.util.Scanner;

interface Atm_inter
{
    public void withdrawl(float sub);
    public void deposit(float add);
    public void chck_balance();
    
}
class BankAccount implements Atm_inter
{   float bal=50000;
    void balance(float bal)
    {
        this.bal=bal;
    } 
    @Override
    public void withdrawl(float sub) 
    {
        if(sub>bal)
        {
            System.out.println("\tInsufficient Balance\n");
        }
        else 
        {
            System.out.println("\tTransaction is successfull.\t Available Balance:- "+(this.bal-sub)+"\n");
        }
    }
    @Override
    public void deposit(float add) 
    {
        System.out.println("\t Deposited.\t Available Balance:- "+(this.bal+add));
    }

    @Override
    public void chck_balance() 
    {
        System.out.println("\tAVailable Balance is : "+bal+"\n");   
    }
}


public class ATM extends BankAccount
{
    public static void main(String[] args) 
    {
        ATM t=new ATM();
        Scanner sc=new Scanner(System.in);
        System.out.println("..........Welcome To XYZ Bank..........");
        
        int option;
        while(true)
        {
            System.out.println("press 1 to Check Balance ");
            System.out.println("press 2 to Withdrawl ");
            System.out.println("press 3 to Deposit ");
            System.out.println("press 4 to Exit ");

            option=sc.nextInt();

            switch (option)
             {
                case 1:
                {
                    t.chck_balance();
                };
                break;
            
                case 2:
                {
                    System.out.println("Enter amount to Withdraw: ");
                    float amount;
                    amount=sc.nextFloat();
                    t.withdrawl(amount);
                };
                break;
            
                case 3:
                {
                    System.out.println("Enter amount to Deposit: ");
                    float amount;
                    amount=sc.nextFloat();
                    t.deposit(amount);
                };
                break;
                case 4: {System.exit(0);} break; 
                default:
                    break;
            }


        }








        
    }
}