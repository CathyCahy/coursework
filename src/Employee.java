import java.util.Objects;

public class Employee {
    private static int count = 1;
    private final String name;
    private int department;
    private float salary;
    private int id;


    public Employee(String name, int department, float salary) {
        //this.id = count;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

//    public static int getCount() {
//        return count;
//    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Cотрудник " + id +
                " " + name +
                ", отдел " + department +
                ", зарплата " + salary +
                "рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }
}


