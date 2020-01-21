//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4D
//This application calculate bank account balance after deposit/withdraw.
//Class: BankAccount.

public class BankAccount
{
    protected double balance;
    protected int deposits;
    protected int withdrawals;
    protected double annualRate;
    protected double monthlyServCharg;

    public BankAccount()
    {
        balance = 0;
        deposits = 0;
        withdrawals = 0;
        annualRate = 0;
        monthlyServCharg = 0;
    }
    public BankAccount(double bal, double rate,double monthlyCharge)
    {
        balance = bal;
        annualRate = rate;
        monthlyServCharg = monthlyCharge;
    }
    public void deposit(double amount)
    {
        balance += amount;
        deposits++;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
        withdrawals++;
    }
    public void calcInterest()
    {
        double monRate = annualRate / 12;
        double monInt = balance * monRate;
        balance += monInt;
    }
    public void monthlyProcess()
    {
        balance -= monthlyServCharg;
        calcInterest();
        withdrawals = 0;
        deposits = 0;
        monthlyServCharg = 0;
    }
}
