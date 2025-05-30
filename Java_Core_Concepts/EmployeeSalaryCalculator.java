// 15. In a company an employee is paid as under:
// If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA =
// 90% of basic
// salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA =
// 98% of
// basic salary. If the employee&#39;s salary is input by the user write a program to find his
// gross salary.
// GS=Basic+DA+HRA
import java.util.Scanner;
public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = scanner.nextDouble();
        
        double hra, da, grossSalary;
        
        if (basicSalary < 1500) {
            hra = 0.10 * basicSalary; // HRA is 10% of basic salary
            da = 0.90 * basicSalary;   // DA is 90% of basic salary
        } else {
            hra = 500;                 // HRA is Rs. 500
            da = 0.98 * basicSalary;   // DA is 98% of basic salary
        }
        
        grossSalary = basicSalary + da + hra; // Gross Salary calculation
        
        System.out.printf("Gross Salary: %.2f%n", grossSalary);
        
        scanner.close();
    }
}