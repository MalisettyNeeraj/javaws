package in.co.hsbc.firstpro.model;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee("James");
		e.setEmail("bond@007");
		
		Address a = new Address();
		a.setCity("Mumbai");
		a.setPin("12312312");
		e.setAddress(a);
		a.setEmployee(e);
		
		
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println(e.getAddress().getCity());
		System.out.println(e.getAddress().getPin());
		
		System.out.println(a.getEmployee().getName());
	
	}

}
