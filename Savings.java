//MASELA M 

public class Savings extends Account
{
	private int minBalance;
	
	public Savings()
	{}
	
	public Savings(String accountNumber, int balance, int minBalance)
	{
		super(accountNumber,balance);
		setMinBalance(minBalance);
	}
	
	public void setMinBalance(int minBalance)
	{
		this.minBalance = minBalance;
	}
	
	public int getMinBalance()
	{
		return minBalance;
	}
	
	public String toString()
	{
		return "Account Number: "+getAccountNumber()+"\nBalance: R"+getBalance()+"\nMinimum Balance: R"+getMinBalance();
	}
	
	public static void main(String args[])
	{	
		System.out.println("Savings Account for Customer of BigUpAndComingBank:");
		System.out.println(" ");
		Savings sa1 = new Savings("1236985745",956,920);
		System.out.println(sa1);
	}
}