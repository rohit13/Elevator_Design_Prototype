package main.java.com.rohit.elevatordesign;

import java.util.LinkedList;
import java.util.Queue;

public class Elevetor implements IElevator {
	private int currentFloor = 0;
	private Queue<Integer> requests;
	private ElevetorButton btn;

	Elevetor(int currFloor) {
		this.currentFloor = currFloor;
		this.requests = new LinkedList<Integer>();
		this.btn = new ElevetorButton(this);
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public Queue<Integer> getRequests() {
		return requests;
	}

	public ElevetorButton getBtn() {
		return btn;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.currentFloor++;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.currentFloor--;
	}

	@Override
	public ELEVATOR_DIRECTION getDirection() {
		// TODO Auto-generated method stub
		if (!requests.isEmpty()) {
			if (this.currentFloor < requests.peek()) {
				return ELEVATOR_DIRECTION.UP;
			} else if (this.currentFloor > requests.peek()) {
				return ELEVATOR_DIRECTION.DOWN;
			}
		}
		return ELEVATOR_DIRECTION.ONHOLD;
	}

	@Override
	public ELEVATOR_STATUS getStatus() {
		// TODO Auto-generated method stub
		if (requests.isEmpty())
			return ELEVATOR_STATUS.EMPTY;
		else
			return ELEVATOR_STATUS.OCCUPIED;
	}

	@Override
	public void addReq(int floor) {
		// TODO Auto-generated method stub
		requests.add(floor);
	}

}
