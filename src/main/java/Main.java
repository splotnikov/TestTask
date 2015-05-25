import com.testtask.service.Service;

public class Main {

	public static void main(String[] args) {
		Service dao = new Service();
		
		System.out.println(dao.getDep(1));
		
	}

}
