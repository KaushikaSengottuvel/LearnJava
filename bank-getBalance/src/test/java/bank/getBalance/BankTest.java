package bank.getBalance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankTest {
	Bank bankA = new BankA();
	Bank bankB = new BankB();
	Bank bankC = new BankC();

	@Test
	public void getBalance() {
		assertEquals("$100 Dollars are deposited.", bankA.getBalance());
		assertEquals("$150 Dollars are deposited.", bankB.getBalance());
		assertEquals("$200 Dollars are deposited.", bankC.getBalance());
	}

}
