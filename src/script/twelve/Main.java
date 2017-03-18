package script.twelve;

public class Main {

	public static void main(String[] args) {

		Person[] persons = new Person[10000];

		for (int i = 0; i < persons.length; i += 2) {
			persons[i] = new Student("Student#" + i);
			persons[i + 1] = new Lecturer("Lecturer#" + i);
		}

		for (int i = 0; i < persons.length; i++) {
			persons[i].printJob();
		}
	}

}
