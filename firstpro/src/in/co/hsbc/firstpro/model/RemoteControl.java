package in.co.hsbc.firstpro.model;

public class RemoteControl {
	
	private TV tv;

	public RemoteControl(TV tv) {
				this.tv = tv;
	}
	
	
	public void switchON() {
		tv.switchON();
	}
	
	public void switchOFF() {
		tv.switchOFF();
	}
	
	public void volPlus() {
		tv.volPlus();
	}

	public void volMinus() {
		tv.volMinus();
	}

	public void displayVol() {
		tv.displayVol();
	}
}
