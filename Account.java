//MASELA M 

public class Account
{
	private String accountNumber;
	private int balance;
	
	public Account()
	{}
	
	public Account(String accountNumber,int balance)
	{
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public int getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Account Number: "+getAccountNumber()+"\nBalance: R"+getBalance();
	}
	
	public static void main(String args[])
	{
		System.out.println("Details of Customer Account for BigUpAndComingBank : ");
		System.out.println(" ");
		Account a1 = new Account("1236985748", 789);
		System.out.println(a1);
	}
}