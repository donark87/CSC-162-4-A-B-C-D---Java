//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4D
//This application calculate bank account balance after deposit/withdraw.
//Class: SavingAccount.

import java.text.NumberFormat;

public class SavingsAccount extends BankAccount
{
    private boolean active;

    public SavingsAccount(double bal, double rate,double monthlyCharge)
    {
        super(bal, rate, monthlyCharge);
        if(bal < 25)
            active = false;
        else
            active = true;
    }
    public void withdraw(double amount)
    {
        if(active)
            super.withdraw(amount);
    }
    public void deposit(double amount)
    {
        if(!active)
        {
            if(amount + balance < 25)
                return;
        }
        super.deposit(amount);
    }
    public void monthlyProcess()
    {
        if(withdrawals > 4)
        {
            monthlyServCharg += withdrawals - 4;
        }
        super.monthlyProcess();
        if(balance < 25)
            active = false;
    }
    public void printStatus()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("Balance: " + nf.format(balance));
        System.out.println("Number of Deposits: " + deposits);
        System.out.println("Number of Withdrawals: " + withdrawals);
        System.out.println();
    }
}
