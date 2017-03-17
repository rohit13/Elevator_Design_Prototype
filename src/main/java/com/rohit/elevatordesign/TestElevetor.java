package main.java.com.rohit.elevatordesign;

import java.util.List;

public class TestElevetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElevetorController c = new ElevetorController(1, 10);
		System.out.println("Elevetor is at floor: " + c.getList().get(0).getCurrentFloor());
		FloorButton fb = new FloorButton(6);
		fb.pressButton(0);
		// for (int i = 0; i < 6; i++) {
		c.serve();
		// }
		System.out.println("Elevetor is at floor: " + c.getList().get(0).getCurrentFloor());
		System.out.println("Elevetor direction is: " + c.getList().get(0).getDirection());
		System.out.println("Elevetor status is: " + c.getList().get(0).getStatus());
		FloorButton fb1 = new FloorButton(3);
		fb1.pressButton(0);
		c.serve();
		System.out.println("Elevetor is at floor: " + c.getList().get(0).getCurrentFloor());
		System.out.println("Elevetor direction is: " + c.getList().get(0).getDirection());
		System.out.println("Elevetor status is: " + c.getList().get(0).getStatus());
		Elevetor e = new Elevetor(0);
		c.addElevetor(e);
		e.getBtn().pressButton(8);
		c.serve();
		System.out.println("Elevetor 1 is at floor: " + c.getList().get(1).getCurrentFloor());
		System.out.println("Elevetor 1 direction is: " + c.getList().get(1).getDirection());
		System.out.println("Elevetor 1 status is: " + c.getList().get(1).getStatus());
		List<Elevetor> list = c.getList();
		int i=9;
		for (Elevetor ele : list) {
			ele.getBtn().pressButton(i++);
			c.serve();
		}
		for (Elevetor elev : list) {
			System.out.println("Elevetor"+elev+" is at floor: " + elev.getCurrentFloor());
			System.out.println("Elevetor"+elev+" direction is: " + elev.getDirection());
			System.out.println("Elevetor"+elev+" status is: " + elev.getStatus());
		}
	}
}
