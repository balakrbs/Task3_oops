package task3;
import java.util.*;

public class DriverMain {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter employee information: ");
		System.out.println("Employee ID : ");
		int empid=obj.nextInt();
		obj.nextLine();
		System.out.println("Enter Name : ");
		String name=obj.nextLine();
		System.out.println("Salary :");
		double salary=obj.nextDouble();
		employee employee=new employee(empid,name,salary);
		
		
		System.out.println("Enter Product information: ");
		System.out.println("Product ID : ");
		int pid=obj.nextInt();
		obj.nextLine();
		System.out.println("Price : ");
		double price=obj.nextDouble();
		System.out.println("Quantity :");
		int quantity=obj.nextInt();
		Product product=new Product(pid,price,quantity);
		
		System.out.println();
		employee.displayIncomeTax();
		product.displaysalesTax();
		
		obj.close();

	}

}
