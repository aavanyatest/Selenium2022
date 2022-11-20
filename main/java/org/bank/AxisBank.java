package org.bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Deposit amount 10000");
}
	public static void main(String[] args) {
		
AxisBank bank= new AxisBank();
bank.deposit();
bank.saving();
bank.fixed();
	}

}
