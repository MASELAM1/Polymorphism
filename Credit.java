//MASELA M 

public class Credit extends Account
{
	private int overdraftLim;
	
	public Credit()
	{}
	
	public Credit(String accountNumber, int balance, int overdraftLim)
	{
		super(accountNumber,balance);
		setOverdraftLim(overdraftLim);
	}
	
	public void setOverdraftLim(int overdraftLim)
	{
		this.overdraftLim = overdraftLim;
	}
	
	public int getOverdraftLim()
	{
		return overdraftLim;
	}
	
	public String toString()
	{
		return "Account Number: "+getAccountNumber()+"\nBalance: R"+getBalance()+"\nOverdraft Limit: R"+getOverdraftLim();
	}
	
	public static void main(String args[])
	{	
		System.out.println("Credit Account for customer BigUpAndComingBank");
		System.out.println(" ");
		Credit c1 = new Credit("7412589634",785,6547);
		System.out.println(c1);
	}
}