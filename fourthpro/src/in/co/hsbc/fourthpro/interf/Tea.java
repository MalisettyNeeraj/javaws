package in.co.hsbc.fourthpro.interf;

public abstract class Tea {
	
	public abstract void boilwater();
	public abstract void addTeaLeaves();
	public abstract void addMilk();
	public abstract void addSugar();

	public final void steps() {
		boilwater();
		addTeaLeaves();
		addMilk();
		addSugar();
	}
	
	
}
