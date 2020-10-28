

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accounts salesdepartment = new Accounts();
		Accounts ITdepartment = new Accounts();
		
		try {
		salesdepartment.salarySlip("shafeeq",1000,0);
		salesdepartment.salarySlip("Alex",1000,0);
		}
		
		catch(AbsenteesException E) {
			System.out.println("Please send me the report");
		}
		
		System.out.println("-------------------------------------------------------");
		
		try {
			ITdepartment.salarySlip("Ali", 5000, 12);
		}
		
		catch(AbsenteesException E) {
			System.out.println("IT Exception, its okay man");
		}
		
	}

}
