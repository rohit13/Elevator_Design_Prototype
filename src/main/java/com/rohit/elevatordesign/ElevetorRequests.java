package main.java.com.rohit.elevatordesign;

import java.util.LinkedList;
import java.util.Queue;

public class ElevetorRequests {
	private static Queue<Integer> allReq = new LinkedList<Integer>();

	public static Queue<Integer> getAllReq() {
		return allReq;
	}

	public static void setAllReq(Queue<Integer> allReq) {
		ElevetorRequests.allReq = allReq;
	}
	
	public static void addReq(int reqnum){
		allReq.offer(reqnum);
	}
	
	public static void removeReq(int reqnum){
		allReq.remove(new Integer(reqnum));
	}
}
