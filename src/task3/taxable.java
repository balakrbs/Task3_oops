package task3;

interface taxable {
	double sales_tax=0.07;
	double income_tax=0.105;
	
	double calctax();
}

class employee implements taxable{
	private int emid;
	private String name;
	private double salary;
	
	public employee(int emid, String name, double salary) {
		
		this.emid = emid;
		this.name = name;
		this.salary = salary;
	}
	
	public double calcTax() {
        return salary * income_tax;
    }
	public void displayIncomeTax() {
        System.out.println("Income tax for employee " + name + " with ID " + emid + " is: $" + calcTax());
    }

	@Override
	public double calctax() {
		// TODO Auto-generated method stub
		return 0;
	}
}