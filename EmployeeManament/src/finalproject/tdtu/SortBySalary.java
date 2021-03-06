package finalproject.tdtu;

import java.util.ArrayList;
import java.util.Collections;

public class SortBySalary implements  StrategySort{

	@Override
	public void sort(ArrayList<Employee> listE) {
		for (int i = 0; i < listE.size()-1; i++) {
			for (int j = i + 1; j < listE.size(); j++) {
				if (listE.get(i).getSalary() < listE.get(j).getSalary()){
					Collections.swap(listE, i, j);
				}
			}
		}
		System.out.println("SORTED!");
	}
	
}
