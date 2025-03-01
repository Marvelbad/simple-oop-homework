

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Manager("Alice", 35, false, "FoxConn", "TeamLead", 5000, 4);
        employees[1] = new SaleManager("Bob", 38, true, "SaleInc", "Senior Sales", 3000, 20000, 5);
        employees[2] = new WageEmployee("Eva", 86, false, "Old LadyInc", "Junior sales", 2500, 15000, 3);

        // List of employees
        System.out.println("📢 Список сотрудников:");
        PersonApp.displayAllEmployees(employees);

        // Total expenses
        System.out.println("\n💰 Общие затраты компании: " + PersonApp.calculateTotalExpenses(employees));

        // Total sales
        System.out.println("\n📈 Общий доход от продаж: " + PersonApp.calculateTotalSales(employees));

        // Find employee
        System.out.println("\n🔍 Найден ли сотрудник? " + PersonApp.findEmployee(employees, new Manager("Alice", 35, false, "FoxConn", "TeamLead", 5000, 4)));
    }
}