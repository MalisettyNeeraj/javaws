package in.co.hsbc.secondpro;

public class Toy {
	public static String mfd;
	private String code;
	private String name;
	private String agegroup;
	public Toy() {
		System.out.println("constructor...");
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgegroup() {
		return agegroup;
	}
	public void setAgegroup(String agegroup) {
		this.agegroup = agegroup;
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Bye!!!");
	}

}
