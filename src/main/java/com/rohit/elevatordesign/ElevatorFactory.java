package main.java.com.rohit.elevatordesign;

public class ElevatorFactory {
	public Elevetor getElevetor(int currFloor){
		return new Elevetor(currFloor);
	}
}
