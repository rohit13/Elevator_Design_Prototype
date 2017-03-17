package main.java.com.rohit.elevatordesign;

public class ElevetorButton implements IButton {
	boolean isPressed = false;
	Elevetor instance;
	
	public ElevetorButton(Elevetor e) {
		// TODO Auto-generated constructor stub
		this.instance = e;
	}
	@Override
	public boolean pressButton(int floor) {
		// TODO Auto-generated method stub
		this.isPressed = true;
		this.instance.addReq(floor);
		return true;
	}

}
