package main.java.com.rohit.elevatordesign;


interface IElevator {
	
	public enum ELEVATOR_DIRECTION{
		UP,DOWN,ONHOLD;
	}
	public enum ELEVATOR_STATUS{
		OCCUPIED, EMPTY;
	}
	public void moveUp();
	public void moveDown();
	public ELEVATOR_DIRECTION getDirection();
	public ELEVATOR_STATUS getStatus();
	public void addReq(int floor);
	
}
