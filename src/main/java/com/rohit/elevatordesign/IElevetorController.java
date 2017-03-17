package main.java.com.rohit.elevatordesign;

public interface IElevetorController {
	public boolean startElevetor();
	public boolean shutDownElevetor();
	public void serve();
	public void addElevetor(Elevetor e);
}
