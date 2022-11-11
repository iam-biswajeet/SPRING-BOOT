package com.nt.beans;

public class ATM {
	private IPrinter printer;
	public ATM(IPrinter printer) {
		this.printer=printer;
	}

	/*
	 * public void setPrinter(IPrinter printer) { this.printer=printer; }
	 */
	public String withdraw(double amt) {
		printer.print();
		return amt+" rupees is withdraw successfully";
	}
}
