public class Salary {

    double salary;

    public Salary(double salary) {
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(salary);
    }

    void calculateTax(int percentage) {
        salary = salary * percentage;
    }

}
