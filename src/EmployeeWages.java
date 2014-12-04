
// placeholder for your main method
public class EmployeeWages {
    public static void main(String[] args) {
        // replace <put your name here> with your name!
        System.out.println("Student: Tanvi");
        
        // Create two instances of class Employee emp1 & emp2
        Employee emp1= new Employee("Michael", 50.0, 12);
        Employee emp2= new Employee("Billbo", 323.0, 12);
        // print emp1 
        System.out.println(emp1.toString());
        // print emp1's weekly salary (put a tab first) like "       weekly salary: $360.00" 
        System.out.println("\t weekly salary: "+emp1.getWeeklySalary());
        // print emp1's annual salary (put a tab first) like "       annual salary: $18,720.00" 
        System.out.println("\t annual salary: "+emp1.getAnnualSalary());
        // print emp2
        System.out.println(emp2.toString());
        // change emp2's name
        emp2.setName("fred");
        // change emp2's wage
        emp2.setWage(3.0);
        // change emp2's hours
        emp2.setHours(2);
        
        // print emp2 
        System.out.println(emp2.toString());
        // print emp2's weekly salary (put a tab first) like "       weekly salary: $360.00" 
        System.out.println("\t weekly salary: "+emp2.getWeeklySalary());
        // print emp2's annual salary (put a tab first) like "       annual salary: $18,720.00" 
        System.out.println("\t annual salary: "+emp2.getAnnualSalary());
        // give emp2 a raise
        emp2.giveRaise();
        // print emp2
        System.out.println(emp2.toString());
    }
}
