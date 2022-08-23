public class Employee {

    private String name;
    private String surname;
    private String middleName;
    private int id;
    private double salary;
    private static int counter;
    private int department;

    public Employee(String name, String surname, String middleName, double salary, int department) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.salary = salary;
        this.department = department;
        id=counter++;
    }

    @Override
    public String toString() {
        return "Сотрудник: "  +
                "Имя = " + name  + "; " +
                "Фамилия = " + surname + "; " +
                "Отчество = " + middleName + "; " +
                "id = " + id + "; " +
                "Зарплата = " + salary + "; " +
                "Отдел = " + department + ".";
    }

    public static void printAllEmployee() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }
}
