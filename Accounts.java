
public class Accounts {

    public void salarySlip(String name, int salary, int absentees) throws AbsenteesException{
    	float tax,netsalary;
    	
    	if(absentees >=10) {
    		AbsenteesException ref = new AbsenteesException();
    		throw ref;
    		//System.out.println("Too many absentees");

    	}
    	
    	else {
    	
    	tax =(float) salary*25/100;
    	netsalary = salary - tax;
    	System.out.println("Employee name: " + name);
    	System.out.println("Your Tax is: " + tax);
    	System.out.println("Your Your Net Salary is: " + netsalary);
    	}
    } 
  }
	