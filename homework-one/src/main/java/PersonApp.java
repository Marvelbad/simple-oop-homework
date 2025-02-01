import java.util.Arrays;

public class PersonApp {

    //Инфа о всех сотрудниках
    public static void displayAllEmployees(Employee[] employees) {
        if (employees == null) return;

        Arrays.stream(employees)
                .filter(emp -> emp != null)
                .forEach(emp -> {
                    emp.display();
                    System.out.println("______________________");
                });
    }

    //Затраты компании
    public static double calculateTotalExpenses(Employee[] employees) {
        if (employees == null) return 0;
        double total = 0;
        for (Employee e : employees) {
            if (e != null) {
                total += e.calculateSalary();
            }
        }
        return total;
    }

    //Доход компании
    public static double calculateTotalSales(Employee[] employees) {
        if (employees == null) return 0;
        double totalSales = 0;
        for (Employee e : employees) {
            if (e instanceof SaleManager) {
                totalSales += e.calculateSalary();
            }
        }
        return totalSales;
    }

    //Поиск сотрудника
    public static boolean findEmployee(Employee[] employees, Employee employee) {
        for (Employee emp : employees) {
            if (emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }
}
