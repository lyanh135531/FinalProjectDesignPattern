package finalproject.tdtu;

public class MarketingStaff extends Employee{
	
	private double sales;
	private double commission;
	public MarketingStaff() {
	}
	
	public MarketingStaff(String id, String name, String phone, double salary, double sales,
			double commission) {
		super(id, name, phone, salary);
		this.sales = sales;
		this.commission = commission;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	@Override
	public void input(){
		super.input();
		System.out.print("Enter sales:");
		this.sales = sc.nextFloat();
		System.out.print("Enter comission:");
		this.commission = sc.nextFloat();
	}
	
	@Override
	public void output(){
		System.out.println("MarketingStaff \t[id = " + getId() + " \tname = " + getName() + " \tphone = " + getPhone()
				+ " \tsalary = " + getSalary()+ " \tsales = " + sales + " \tcommission = " + commission + "]");
	}

	
	
	
	
	
	
}
