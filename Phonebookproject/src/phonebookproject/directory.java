package phonebookproject;

import java.util.Arrays;

public class directory {

	person[] book = new person[0];

	public void addPerson(person newPerson) {
		person[] temp = new person[book.length + 1];
		for (int i = 0; i < book.length; i++) {
			temp[i] = book[i];
		}
		temp[temp.length - 1] = newPerson;
		book = temp;
	}

	public void deletePerson(person removed) {
		person[] temp = new person[book.length - 1];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i] != removed) {
				temp[x] = book[i];
				x++;
			}
		}
		book = temp;
	}

	public person[] getDirectory() {
		return book;
	}

	public void printDirectory() {
		for (int i = 0; i < book.length; i++) {
			book[i].getperson();
		}
	}

	public void printPersonArray(person[] searched) {
		for (int i = 0; i < searched.length; i++) {
			searched[i].getperson();
		}
	}

	public person searchByPhone(long phoneNum) {
		int index = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPersonNum() == phoneNum) {
				index = i;
				break;
			}
		}
		return book[index];
	}

	public person[] getByLastName(String lastName) {
// set counter for the size of the array
		int counter = 0;
// for loop to see how many people have the same Last name
		for (int i = 0; i < book.length; i++) {
			if (book[i].getLastName().equals(lastName)) {
				counter++;
			}
		}
// make a temp array that is the exact size of how many names were found
		person[] temp = new person[counter];

// set another counter that will use the index value
		int x = 0;

		for (int i = 0; i < book.length; i++) {
			if (book[i].getLastName().equals(lastName)) {
				temp[x] = book[i];
				x++;
			}
		}
		return temp;
	}

	public person[] getByFirstName(String firstName) {
// set counter for the size of the array
		int counter = 0;
// for loop to see how many people have the same first name
		for (int i = 0; i < book.length; i++) {
			if (book[i].getFirstName().equals(firstName)) {
				counter++;
			}
		}
// make a temp array that is the exact size of how many names were found
		person[] temp = new person[counter];

// set another counter that will use the index value
		int x = 0;

		for (int i = 0; i < book.length; i++) {
			if (book[i].getFirstName().equals(firstName)) {
				temp[x] = book[i];
				x++;
			}
		}
		return temp;
	}

	public person[] getByFullName(String full) {
// set counter for the size of the array
		int counter = 0;
// for loop to see how many people have the same first name
		for (int i = 0; i < book.length; i++) {
			if ((book[i].getFirstName() + " " + book[i].getLastName()).equals(full)) {
				counter++;
			}
		}
// make a temp array that is the exact size of how many names were found
		person[] temp = new person[counter];

// set another counter that will use the index value
		int x = 0;

		for (int i = 0; i < book.length; i++) {
			if ((book[i].getFirstName() + " " + book[i].getLastName()).equals(full)) {
				temp[x] = book[i];
				x++;
			}
		}
		return temp;
	}

	public person[] getBycity(String city) {
// set counter for the size of the array
		int counter = 0;
// for loop to see how many people have the same state name
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAddress().getClass().equals(city)) {
				counter++;
			}
		}

		person[] temp = new person[counter];

// set another counter that will use the index value
		int x = 0;

		for (int i = 0; i < book.length; i++) {
			if (book[i].getAddress().getClass().equals(city)) {
				temp[x] = book[i];
				x++;
			}
		}
		return temp;
	}

	public person[] getByState(String state) {
// set counter for the size of the array
		int counter = 0;
// for loop to see how many people have the same state name
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAddress().getState().equals(state)) {
				counter++;
			}
		}

		person[] temp = new person[counter];

// set another counter that will use the index value
		int x = 0;

		for (int i = 0; i < book.length; i++) {
			if (book[i].getAddress().getState().equals(state)) {
				temp[x] = book[i];
				x++;
			}
		}
		return temp;
	}

	public void printAlphabetArray(person[] searched) {
		String[] alphabet = new String[searched.length];
		for (int i = 0; i < searched.length; i++) {
			alphabet[i] = searched[i].getFirstName();
		}

		Arrays.sort(alphabet);

		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < book.length; j++) {
				if (alphabet[j] == book[i].getFirstName()) {
					book[j].getperson();
				}
			}

		}
	}
}
