package task3;

 class Product implements taxable{
	private int pid;
	private double price;
	private int quantity;

	public Product(int pid, double price, int quantity) {
		
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double calcTax() {
        return price * sales_tax;
    }
	public void displaysalesTax() {
        System.out.println("Sales tax for product with ID " + pid + " is :  " + calcTax());
    }

	@Override
	public double calctax() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
