package AddressBook10;

import java.util.Scanner;



class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		AddingAddressBook addressBook1 = new AddingAddressBook();
		AddingAddressBook addressBook2 = new AddingAddressBook();
		AddingAddressBook addressBook3 = new AddingAddressBook();

		System.out.println();
		System.out.println("Displaying contact details of ADDRESS BOOK1");
		addressBook1.addAddressBook();

		System.out.println();
		System.out.println("Displaying contact details of ADDRESS BOOK2");
		addressBook2.addAddressBook();

		System.out.println();
		System.out.println("Displaying contact details of ADDRESS BOOK3");
		addressBook3.addAddressBook();

	}

}
