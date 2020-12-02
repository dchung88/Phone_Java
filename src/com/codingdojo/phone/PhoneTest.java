package com.codingdojo.phone;

public class PhoneTest {

	public static void main(String[] args) {
		IPhone iphone12 = new IPhone("12", 100, "Verizon", "The Office");
		Galaxy s20 = new Galaxy("s20", 95, "ATT", "Fresh Prince");
		
		iphone12.displayInfo();
		System.out.println(iphone12.ring());
		System.out.println(iphone12.unlock());
		
		s20.displayInfo();
		System.out.println(s20.ring());
		System.out.println(s20.unlock());
		

	}

}
