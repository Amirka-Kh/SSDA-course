import java.util.ArrayList;
import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way ;
public class Human {

    private Salary salary;
    private Hobby hobbies;
    private Nickname nickname;

    String sayHello(Languages language) {
        String greeting = language.speak();
        return greeting;
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.hobbies = new Hobby();
        human.hobbies.addHobby("jumping");
        human.salary = new Salary(125.2);
        human.salary.calculateTax(21);
        human.salary.showSalary();
        Arabic arabic = new Arabic();
        System.out.println(human.sayHello(arabic));
        human.becomeEmployee();
        System.out.println(human.job);
    }
}
