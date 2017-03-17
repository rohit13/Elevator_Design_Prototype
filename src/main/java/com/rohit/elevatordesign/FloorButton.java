package main.java.com.rohit.elevatordesign;

public class FloorButton implements IButton {
	boolean isPressed;
	int floornum;
	
	FloorButton(int floor){
		this.floornum = floor;
		this.isPressed = false;
	}
	
	@Override
	public boolean pressButton(int floor) {
		// TODO Auto-generated method stub
		ElevetorRequests.addReq(this.floornum);
		this.isPressed = true;
		return true;
	}

}
