package script.twelve;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public void printJob() {
		System.out.println("Der Student studiert.");
	}

}
