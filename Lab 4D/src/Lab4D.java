//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4D
//This application calculate bank account balance after deposit/withdraw.
//Class: Main.

public class Lab4D
{
    public static void main(String[] args)
    {

        SavingsAccount sa1 = new SavingsAccount(100.00,3.00,2.50);
        sa1.printStatus();
        sa1.deposit(25.00);
        sa1.deposit(10.00);
        sa1.deposit(35.00);
        sa1.printStatus();
        sa1.withdraw(100.00);
        sa1.withdraw(50.00);
        sa1.withdraw(10.00);
        sa1.withdraw(1.00);
        sa1.withdraw(1.00);
        sa1.printStatus();
        sa1.monthlyProcess();
        System.out.println("\nOutput after monthly charge");
        sa1.printStatus();

    }
}
