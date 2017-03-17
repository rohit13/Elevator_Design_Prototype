package main.java.com.rohit.elevatordesign;

import java.util.ArrayList;
import java.util.List;

import main.java.com.rohit.elevatordesign.IElevator.ELEVATOR_DIRECTION;
import main.java.com.rohit.elevatordesign.IElevator.ELEVATOR_STATUS;

public class ElevetorController implements IElevetorController {
	static final int MAX_ELEVATORS = 16;
	int numberOfElevators;
	int numberOfFloors;
	List<Elevetor> list;

	public List<Elevetor> getList() {
		return list;
	}

	public ElevetorController(int numElevetor, int numFloors) {
		// TODO Auto-generated constructor stub
		this.numberOfElevators = numElevetor;
		this.numberOfFloors = numFloors;
		list = new ArrayList<Elevetor>();
		for (int i = 0; i < this.numberOfElevators; i++) {
			list.add(new Elevetor(0));
		}
	}

	@Override
	public boolean startElevetor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shutDownElevetor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void serve() {
		// TODO Auto-generated method stub
		// while(!ElevetorRequests.getAllReq().isEmpty()){
		for (Elevetor e : list) {
			if (e.getStatus() == ELEVATOR_STATUS.EMPTY) {
				if (ElevetorRequests.getAllReq().size() > 0) {
					e.addReq(ElevetorRequests.getAllReq().peek());
					ElevetorRequests.getAllReq().poll();
				}
			}
			if (e.getStatus() == ELEVATOR_STATUS.OCCUPIED) {
				while (!e.getRequests().isEmpty()) {
					if (e.getDirection() == ELEVATOR_DIRECTION.UP) {
						e.moveUp();
					} else if (e.getDirection() == ELEVATOR_DIRECTION.DOWN) {
						e.moveDown();
					} else {
						e.getRequests().poll();
					}
				}
			}
		}
	}

	@Override
	public void addElevetor(Elevetor e) {
		// TODO Auto-generated method stub
		getList().add(e);
	}

}
