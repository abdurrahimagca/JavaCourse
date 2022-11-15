
public class hourlyEmployee extends employee {
	public static int hour;
	public static int wage;
	public hourlyEmployee(String name, String surname, String iD, int hour, int wage) {
		super(name, surname, iD);
		hourlyEmployee.hour = hour;
		hourlyEmployee.wage = wage;
	}
	public static void printIncome(){
		System.out.println(30*wage*hour);

	}

	
	
    
}
