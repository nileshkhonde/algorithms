package src;

import java.util.List;
import java.util.LinkedList;



public class Vertex {
	private Integer id = -1;
	private List<Vertex> adjascent = new LinkedList<Vertex>();
	public Vertex(Integer i) {
		id = i;
	}
	public Integer getId() {
		return id;
	}
	
	List<Vertex> getAdjascents(){
		return adjascent;
	}
	
	
	
}
© 2020 GitHub, Inc.
