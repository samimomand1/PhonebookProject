package phonebookproject;

import java.util.*;

public class PhoneBookMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		person p1 = new person(13142302987L, "Samiullah", "Momand");
		p1.addAddress(632, "Boenceke ct", "St. Louis", "MO", "63125");
		p1.getperson();

		person p2 = new person(3146884817L, "Nabiullah", "Momand");
		p2.addAddress(4029, "Taft Ave", "St. Louis", "MO", "63116");
		p2.getperson();

		directory d1 = new directory();
		d1.addPerson(p1);
		d1.addPerson(p2);
		int choice = 0;
		while (choice != 11) {
			choice = getMenu();
			switch (choice) {
			case 1:
				System.out.println("Enter person information separated by commas");
				System.out.println("FORMAT: Name, Street Address, City, State, Zip, Phone Number");
				String info = input.nextLine();

				String[] tempInfo = info.split(", ");
				String name = tempInfo[0];
				String street = tempInfo[1];
				String city = tempInfo[2];
				String state = tempInfo[3];
				int zipCode = Integer.parseInt(tempInfo[4]);
				long phoneNum = Long.parseLong(tempInfo[5]);

				String[] tempName = name.split(" ");
				String fName = tempName[0];
				String lName = tempName[tempName.length - 1];

// empty container to hold the middle name
				String middleName = "";
				for (int i = 1; i < tempName.length - 1; i++) {
					middleName += tempName[i];
					if (i != tempName.length - 2) {
						middleName += " ";
					}
				}

				String[] tempAddress = street.split(" ");
				int streetNum = Integer.parseInt(tempAddress[0]);
				String streetName = "";

				for (int i = 1; i < tempAddress.length; i++) {
					streetName = tempAddress[i];
					if (i != tempAddress.length - 1) {
						streetName = " ";
					}
				}

			}
		}
	}

	public static int getMenu() {
		Scanner sc1 = new Scanner(System.in);
// print menu
		System.out.println("1. Add new person");
		System.out.println("2. Delete new person");
		System.out.println("3. Search by first name");
		System.out.println("4. Search by last name");
		System.out.println("5. Search by full name");
		System.out.println("6. Search by phone number");
		System.out.println("7. Search by city");
		System.out.println("8. Search by state");
		System.out.println("9. Sort people alphabetically");
		System.out.println("10. Update person information");
		System.out.println("11. End the program");
	    System.out.println("Please enter a number");
		int choice = sc1.nextInt();
		System.out.println();
		return choice;
	}

}