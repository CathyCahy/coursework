public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 300000.00f);
        employees[1] = new Employee("Петрова Людмила Васильевна", 2, 200000.00f);
        employees[2] = new Employee("Васильев Василий Васильевич", 2, 150000.00f);
        employees[3] = new Employee("Григорьев Вадим Валерьевич", 3, 50000.00f);
        employees[4] = new Employee("Пушкин Александр Сергеевич", 3, 30000.00f);
        employees[5] = new Employee("Платонов Сергей Сергеевич", 4, 10000.00f);
        employees[6] = new Employee("Билевский Юрий Вадимович", 4, 5000.00f);
        employees[7] = new Employee("Попов Юрий Юрьевич", 5, 3000.00f);
        employees[9] = new Employee("Работящий Альберт Олегович", 5, 13000.00f);

        printAll();
        System.out.println("Сумма затрат на ЗП в месяц: " + sumSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + minSalary().getName() + ", его зарплата " + minSalary().getSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalary().getName() + ", его зарплата " + maxSalary().getSalary());
        System.out.println("Средняя зарплата сотрудников  " + averageSalary());
        printNames();
        riseSalary(15);
        System.out.println(minSalaryInDepartment(2));
        System.out.println(maxSalaryInDepartment(4));
        System.out.println("Сумма затрат по отделу 3 " + sumSalaryInDepartment(3));
        System.out.println("Средняя ЗП по отделу 5 " + averageSalaryInDepartment(5));
        riseSalaryInDepartment(1, 10);
        printInDepartment(2);
        employeesWithSalaryMore(50000);
        employeesWithSalaryLess(10000);

    }

    private static void printAll() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static float sumSalary() {
        float total = 0;
        for (int i = 0; i < employees.length; i++) {
            if
            (employees[i] != null) {
                total = employees[i].getSalary() + total;
            }
        }
        return total;
    }

    private static Employee minSalary() {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    private static Employee maxSalary() {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    private static float averageSalary() {
        float average = 0;
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if
            (employees[i] != null) {
                sum = employees[i].getSalary() + sum;
                average = sum / i;
            }
        }
        return average;
    }

    private static void printNames() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }

    private static void riseSalary(int persent) {
        float riseSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                riseSalary = employees[i].getSalary() + employees[i].getSalary() * persent / 100;
                employees[i].setSalary(riseSalary);
                System.out.println("Зарплата после индексации " + employees[i].getName() + " " + employees[i].getSalary());
            }
        }
    }

    private static Employee minSalaryInDepartment(int department) {
        Employee min = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() != department) {
                continue;
            }
            if (employees[i] != null && (min == null || employees[i].getSalary() < min.getSalary())) {
                min = employees[i];

            }
        }
        return min;
    }

    private static Employee maxSalaryInDepartment(int department) {
        Employee max = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() != department) {
                continue;
            }
            if (employees[i] != null && (max == null || employees[i].getSalary() > max.getSalary())) {
                max = employees[i];

            }
        }
        return max;
    }

    private static float sumSalaryInDepartment(int department) {
        float total = 0;
        for (int i = 0; i < employees.length; i++) {
            if
            (employees[i] != null && employees[i].getDepartment() == department) {
                total = employees[i].getSalary() + total;
            }
        }
        return total;
    }

    private static float averageSalaryInDepartment(int department) {
        float total = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if
            (employees[i] != null && employees[i].getDepartment() == department) {
                count++;
                total = employees[i].getSalary() + total;
            }
        }
        return total / count;
    }

    private static void riseSalaryInDepartment(int department, int persent) {
        float riseSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                riseSalary = employees[i].getSalary() + employees[i].getSalary() * persent / 100;
                employees[i].setSalary(riseSalary);
                System.out.println("Зарплата после индексации " + employees[i].getName() + " " + employees[i].getSalary());
            }
        }
    }

    private static void printInDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println("Сотрудник " + employees[i].getName() + " " + employees[i].getSalary());
            }
        }
    }

    private static void employeesWithSalaryMore(float sum) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > sum) {
                System.out.println("Сотрудник " + employees[i].getId() + " " + employees[i].getName() + " " + employees[i].getSalary());
            }
        }
    }

    private static void employeesWithSalaryLess(float sum) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < sum) {
                System.out.println("Сотрудник " + employees[i].getId() + " " + employees[i].getName() + " " + employees[i].getSalary());
            }
        }
    }
}

