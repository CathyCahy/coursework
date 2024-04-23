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
        System.out.println("Сотрудник с минимальной зарплатой "+ minSalary().getName() + ", его зарплата "+ minSalary().getSalary());
        System.out.println("Сотрудник с максимальной зарплатой "+ maxSalary().getName() + ", его зарплата "+ maxSalary().getSalary());
        System.out.println("Средняя зарплата сотрудников  "+ averageSalary());
        printNames();


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
            if (employees[i]!=null && employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }
    private static Employee maxSalary() {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    private static float averageSalary(){
       float average = 0;
       float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if
            (employees[i] != null) {
                sum = employees[i].getSalary() + sum;
                average = sum/i;
            }
        }
        return average;
    }

    private static void printNames(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null){
                System.out.println(employees[i].getName());
            }
        }
    }
}

