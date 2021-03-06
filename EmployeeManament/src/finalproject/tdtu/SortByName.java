package finalproject.tdtu;

import java.util.ArrayList;
import java.util.Collections;

public class SortByName implements StrategySort{
	
	@Override
	public void sort(ArrayList<Employee> listE) {
		for (int i = 0; i < listE.size()-1; i++) {
			for (int j = i + 1; j < listE.size(); j++) {
				if (splitName(listE.get(i).getName()).compareTo(splitName(listE.get(j).getName())) > 0){
					Collections.swap(listE, i, j);
				}
			}
		}
		System.out.println("SORTED!");
	}
	public String splitName(String fullname){
		String name = fullname.substring(fullname.lastIndexOf(" ") + 1);
		return name;
	}
	
}
