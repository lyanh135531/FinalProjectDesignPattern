package finalproject.tdtu;

import java.util.Scanner;

public class Employee implements TemplateInput {
	private String id;
	private String name;
	private String phone;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(String id, String name, String phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void input() {
		System.out.print("Enter ID:");
		this.id = sc.nextLine();
		System.out.print("Enter name:");
		this.name = sc.nextLine();
		System.out.print("Enter phone:");
		this.phone = sc.nextLine();
		System.out.print("Enter salary:");
		this.salary = sc.nextFloat();
	}

	@Override
	public void output() {
		System.out.println("Employee \t[id = " + id + " \tname = " + name + "  \tphone = " + phone + " \tsalary = " + salary + "]");
	}

	
	
	
	
}
