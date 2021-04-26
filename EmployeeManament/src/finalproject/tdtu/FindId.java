package finalproject.tdtu;

import java.util.Scanner;

public class FindId implements Command{
	
	private SingletonList listE;
	
	public FindId(SingletonList listE){
		this.listE = listE;
	}

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		String id =  sc.next();
		int pos = listE.findId(id);
		if (pos < 0){
			System.out.println("Not found!");
		}
	}
	
	
}
