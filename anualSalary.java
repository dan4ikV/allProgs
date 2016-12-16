/**
 * Created by Admin on 16.12.2016.
 */
public class anualSalary {
    private static int salary = 2000;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static int getSalary() {
        return salary;
    }
    public int getAnualSalary() {
        return salary * 12;
    }
}
