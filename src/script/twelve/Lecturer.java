package script.twelve;

public class Lecturer extends Person {

	public Lecturer(String name) {
		super(name);
	}

	@Override
	public void printJob() {
		System.out.println("Der Professor lehrt.");
	}

}
