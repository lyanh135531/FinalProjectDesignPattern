package finalproject.tdtu;

import java.util.Scanner;

public class DeleteId implements Command{
	
	private SingletonList listE;
	
	public DeleteId(SingletonList listE){
		this.listE = listE;
	}

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		String id =  sc.next();
		listE.deleteId(id);
	}
	
	
}
