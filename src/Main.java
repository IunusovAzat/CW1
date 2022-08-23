public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Матвей", "Баранов", "Александрович", 63086.67, 3);
        employees[1] = new Employee("Анна", "Виноградова", "Егоровна", 36069.05, 1);
        employees[2] = new Employee("Алиса", "Литвинова", "Матвеевна", 43864.69, 4);
        employees[3] = new Employee("Александр", "Большаков", "Александрович", 26900.56, 2);
        employees[4] = new Employee("Марьям", "Наумова", "Матвеевна", 89402.23, 5);
        employees[5] = new Employee("Екатерина", "Касьянова", "Николаевна", 18307.96, 2);
        employees[6] = new Employee("Леонид", "Орлов", "Михайлович", 16430.16, 3);
        employees[7] = new Employee("Анастасия", "Полякова", "Романовна", 43417.80, 3);
        employees[8] = new Employee("Ксения", "Павлова", "Кирилловна", 90612.33, 5);
        employees[9] = new Employee("Полина", "Моргунова", "Максимовна", 7032.09, 1);

        printFullName();
        System.out.println();
        printAllEmployee();
        System.out.println();
        System.out.println(getCalculateAverageSalary());
        System.out.println();
        System.out.println(getEmployeeMinSalary());
        System.out.println();
        System.out.println(getEmployeeMaxSalary());
        System.out.println();
        System.out.println(getAndCalculateSum());

    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getAndCalculateSum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employees != null)
                sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) ;
            minSalary = employees[0].getSalary();
            minSalaryEmpl = employees[i];
            index = i;
            break;
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];

                }
            }
        }
        return minSalaryEmpl;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) ;
            maxSalary = employees[0].getSalary();
            maxSalaryEmpl = employees[i];
            index = i;
            break;
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];

                }
            }
        }
        return maxSalaryEmpl;
    }
    public static double getCalculateAverageSalary(){
        double sumSalaryAllEmpl = getAndCalculateSum();
        if (sumSalaryAllEmpl != 0){
            return sumSalaryAllEmpl/employees.length;
        } else {
            return 0;
        }
    }
    public static void printFullName(){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName() + " " +
                        employee.getSurname() + " " +
                        employee.getMiddleName());
            }

        }
    }
}
