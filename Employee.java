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

	//public Employee[] ObjArray(int n) {
	//Random rand = new Random();
	//Employee[] Employees = new Employee[n];
	//for (int i = 0; i < n; i++) {
	//int ID = rand.nextInt(99) + 1;
	//int sal;
	//sal = rand.nextInt(5000) + 1;
	//Employees[i].setId(ID);
	//Employees[i].setSalary(sal);
	//}
	//return Employees;
	//}
	public static void sort(Employee employee[]) {
		// create buckets
		Random rand = new Random();
		int counter[] = new int [employee.length];
		// fill buckets
		for(int i = 0;i < employee.length - 1; i++){
			int ID = rand.nextInt(99) + 1;
			int sal;
			sal = rand.nextInt(5000) + 1;
			employee[i].setId(ID);
			employee[i].setSalary(sal);
		}
		for(int i = 0; i < employee.length; i++){
			counter[employee[i].getId()] = counter[employee[i].getId()] + 1;
		}
		// sort array
		int ndx = 0;
		for (int i = 0; i < counter.length; i++) {
			while (0 < counter[i]) {
				employee[ndx++].setId(i);
			}
		}
	}
	public static void search(Employee array[]){
		Random rand = new Random();
		int n;
		int id;

		for(int i = 0;i < array.length; i ++) {
			n = rand.nextInt(3);
			id = rand.nextInt(100);
			if(n == 1){
				array[i].setFirstName("Danylo");
				array[i].setId(id);
			}
			else if(n == 0){
				array[i].setFirstName("Eric");
				array[i].setId(id);
			}
			else if(n == 2){
				array[i].setFirstName("Taras");
				array[i].setId(id);
			}
			else if(n == 3){
				array[i].setFirstName("Bob");
				array[i].setId(id);
			}
		}
		for(int i = 0; i < 100; i++){
			if(array[i].getFirstName() == "Danylo"){
				System.out.println("id : " + array[i].getId() + " Name : " + array[i].getFirstName());
			}
		}
	}

	public String toString(){
		return "Employee[" +" " + "id = " + id + ", " + "name = " + firstName
				+ " " + secondName + ", " + "salary = " + salary + "]";
	}
}
