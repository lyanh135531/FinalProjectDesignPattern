package finalproject.tdtu;

public class Leader extends Employee{
	private double responsibility;

	public Leader() {
	}

	public Leader(String id, String name, String phone, double salary,
			double responsibility) {
		super(id, name, phone, salary);
		this.responsibility = responsibility;
	}

	public double getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(double responsibility) {
		this.responsibility = responsibility;
	}
	
	@Override
	public void input(){
		super.input();
		System.out.print("Enter responsibility:");
		this.responsibility = sc.nextFloat();
	}
	
	@Override
	public void output(){
		System.out.println("Leader \t\t[id = " + getId() + " \tname = " + getName() + " \tphone = " + getPhone()
				+ " \tsalary = " + getSalary() + " \tresponsibility = " + responsibility + "]");
	}

	
	
	
}
