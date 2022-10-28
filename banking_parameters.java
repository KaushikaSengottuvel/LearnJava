class Account
{
	long accno;
	String name;
    int balance;
	void insert(long accno1, String name1, int balance1)
	{
		accno=accno1;
		name=name1;
		balance=balance1;
	}

	void display()
	{
		System.out.println("\n Account Number : "+accno+ ", Name : "+name+", Balance Amount : "+balance);
	}

	void checkBalance()
	{
		System.out.println("Balance Amount : "+balance);
	}
	void deposit(int deposit)
	{
		balance+=deposit;
	}
	void withdraw(int withdraw)
	{
		if(balance>withdraw) balance-=withdraw;
		else System.out.println("Insufficient Balance!");	
	}
	
}




class banking_parameters
{
	public static void main(String[] args) {
		Account a1=new Account(); 
		a1.insert(12345678,"vino",1000); 
		a1.display(); 
		a1.checkBalance(); 
		a1.deposit(40000); 
		a1.checkBalance(); 
		a1.withdraw(15000); 
		a1.checkBalance(); 
		a1.display(); 
		
	}
} 