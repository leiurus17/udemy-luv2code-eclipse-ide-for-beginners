package lecture8;

public class Student {

	private String lastName;
	private String firstName;
	private int age;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public Student(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		System.out.println("foobar");

		for (String string : args) {
			System.out.println(string);
		}
	}
}
