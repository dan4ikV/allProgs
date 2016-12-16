import java.util.Random;

public class Employee {
	private int id = 60;
	private String firstName = "danylo";
	private String secondName = "wasylyshyn";
	private anualSalary salary;
	public Employee(){
		id = 60;
		firstName = "danylo";
		secondName = "wasylyshyn";
	}

	public Employee(int i, String f_Name, String l_name, int s) {
		id = i;
		firstName = f_Name;
		secondName = l_name;
		this.salary = new anualSalary();
		salary.setSalary(s);
	}

	public int getSalary(){
		return anualSalary.getSalary();
	}
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return firstName + " " + secondName;

	}

	public String toString(){
		return "Employee[" +" " + "id = " + id + ", " + "name = " + firstName
				+ " " + secondName + ", " + "salary = " + salary + "]";
	}
}
