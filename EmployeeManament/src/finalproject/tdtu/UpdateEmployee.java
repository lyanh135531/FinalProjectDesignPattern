package finalproject.tdtu;

import java.util.Scanner;

public class UpdateEmployee implements Command{
	private SingletonList listE;
	
	public UpdateEmployee(SingletonList listE){
		this.listE = listE;
	}

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		String id =  sc.next();
		listE.update(id);
	}	
}
