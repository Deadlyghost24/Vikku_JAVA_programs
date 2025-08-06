package com.vikku;

public interface ATM {
	abstract void checkBalance();
	
}
class machine{
	public void checkBalance() {
		System.out.println("Check Balance Code");
	}
}
class ATM_IDBI{
	public static void main(String[] args) {
		machine m = new machine();
	}
}