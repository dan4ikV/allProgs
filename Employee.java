package lesson2911;

import java.util.Random;

public class Employee {
	private int id;
	private String firstName;
	private String secondName;
	private int salary;

	public Employee(int i, String f_Name, String l_name, int s) {
		id = i;
		firstName = f_Name;
		secondName = l_name;
		salary = s;
	}

	public int getId() {
		return id;
	}

	public String GetFirstName() {
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

	public int getSalary() {
		return salary;
	}

	public String getname() {
		return firstName + " " + secondName;

	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnualSalary() {
		return salary * 12;
	}

	public int raiseSalary() {
		return salary - (salary / 100);
	}
	
	public Employee[] ObjArray(int n) {
		Random rand = new Random();
		Employee[] Employees = new Employee[n];
		for (int i = 0; i < n; i++) {
		int ID = rand.nextInt(100) + 1;
		int SALLARY = rand.nextInt(5000) + 1;
		Employees[i].setId(ID);
		Employees[i].setSalary(SALLARY);
		}
		return Employees;
	}

	public String toString(){
        return "Employee[" +" " + "id = " + id + ", " + "name = " + firstName 
        + " " + secondName + ", " + "salary = " + salary + "]";
    }
}
