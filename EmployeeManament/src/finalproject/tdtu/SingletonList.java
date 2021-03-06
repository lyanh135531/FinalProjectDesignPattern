package finalproject.tdtu;

import java.util.ArrayList;
import java.util.Collections;

public class SingletonList implements AdapterDisplay{
	
	private StrategySort strategy;
	
	static ArrayList<Employee> listE = new ArrayList<>();
	
	private static SingletonList instance;
	
	public static SingletonList getInstance() {
		if (instance == null) {
			instance = new SingletonList(); 
		}
		return instance;
	}
	
	public void setStrategySort(StrategySort strategy) {
        this.strategy = strategy;
    }
	
	
	public void input(FactoryType type) {
		Employee employee = null;
		switch (type){
		case EMPLOYEE:
			employee = new Employee();
			employee.input();
			break;
		case MARKETINGSTAFF:
			employee = new MarketingStaff();
			employee.input();
			break;
		case LEADER:
			employee = new Leader();
			employee.input();
			break;
		}
		listE.add(employee);
	}
	
	public int findId(String id){
		for (int i = 0; i < listE.size(); i++){
			if (listE.get(i).getId().equals(id)){
				listE.get(i).output();
				return i;
			}
		}
		return -1;
	}
	
	public void deleteId(String id){
		int pos = findId(id);
		if (pos < 0){
			System.out.print("Not Found!");
		}
		else {
			System.out.println("DELETED!");
			listE.remove(pos);
		}
	}
	
	public void update(String id){
		int pos = findId(id);
		if (pos < 0){
			System.out.print("Not Found!");
		}
		else{
			listE.get(pos).input();
			listE.set(pos, listE.get(pos));
		}
	}
	
	public void findSalary(double min, double max){
		for (Employee employee: listE) {
			if (employee.getSalary() >= min && employee.getSalary() <= max){
				employee.output();
			}
		}
	}
	
	@Override
	public void display() {
		if (this.listE == null) {
			System.out.print("No Employee!");
		}
		else {
			for (Employee employee: listE) {
				employee.output();
			}
		}
	}

	public void sort(){
		strategy.sort(listE);
	}
	
	public void dummyData(){
		listE.add(new Employee("E1","Ly Ly Anh	","1111111111",2000));
		listE.add(new Employee("E2","Hoang Huu Dong	","222222222", 2000));
		listE.add(new Employee("E3","Nguyen Dinh Khoi","333333333", 1000));
		listE.add(new Employee("E3","Hoang Gia Huy	","4444444444", 3000));
		listE.add(new MarketingStaff("M1","Le Dinh Quang Huy","555555555", 1000, 100, 20));
		listE.add(new MarketingStaff("M2","Nguyen Tran Nhat Duc","6666666666", 3000, 500, 20));
		listE.add(new MarketingStaff("M3","Nguyen Khac Minh Luan","77777777777", 2000, 300, 10));
		listE.add(new Leader("L1","Tran Pham Thanh Minh","88888888888", 4000, 2000));
		listE.add(new Leader("L2","Nguyen Tan Loc	","99999999999", 6000, 2000));
	}
}
