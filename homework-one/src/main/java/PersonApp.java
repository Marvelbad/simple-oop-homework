import java.util.Arrays;
import java.util.Objects;

public final class PersonApp {

    private PersonApp() {
        throw new UnsupportedOperationException("Utility class, do not instantiate");  // Prevent instantiation
    }


    /**
     * Display information about all employees
     */

    public static void displayAllEmployees(Employee[] employees) {
        if (employees == null) return;

        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .forEach(emp -> {
                    emp.display();
                    System.out.println("______________________");
                });
    }

    /**
     * Calculate total salary expenses for all employees
     */

    public static double calculateTotalExpenses(Employee[] employees) {
        if (employees == null) return 0;

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    /**
     * Calculate total sales generated by SaleManagers
     */

    public static double calculateTotalSales(Employee[] employees) {
        if (employees == null) return 0;

        return Arrays.stream(employees)
                .filter(emp -> emp instanceof SaleManager)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    /**
     * Check if an employee exists in the array
     */

    public static boolean findEmployee(Employee[] employees, Employee employee) {
        if (employees == null || employee == null) return false;

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .anyMatch(employee::equals);
    }
}
