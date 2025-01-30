public abstract class Employee extends Person {
    private final String company;
    private final String position;
    protected double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }



    public abstract double calculateSalary();

    @Override
    public void display() {
        super.display();
        System.out.println("Company: " + company + ", Position: " + position + ", Base Salary: " + baseSalary);
    }
}
