package com.algorithms.graph;

import java.util.ArrayList;
import java.util.List;
public class GraphTest {
public static void main(String[] args) {
		Vertex V1 = new Vertex(1);
		Vertex V2 = new Vertex(2);
		Vertex V3 = new Vertex(3);
		Vertex V4 = new Vertex(4);
		Vertex V5 = new Vertex(5);
		Vertex V6 = new Vertex(6);
		
		List<Vertex> vertices = new ArrayList<Vertex>();
		vertices.add(V1);
		vertices.add(V2);
		vertices.add(V3);
		vertices.add(V4);
		vertices.add(V5);
		vertices.add(V6);
		
		Graph g = new Graph(vertices);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		
		g.addEdge(3, 1);
		g.addEdge(3, 5);
		
		g.addEdge(5, 3);
		g.addEdge(5, 2);
		g.addEdge(5, 4);
		g.addEdge(5, 6);

		g.addEdge(6, 5);
		g.addEdge(6, 4);
		
		g.addEdge(4, 2);
		g.addEdge(4, 5);
		g.addEdge(4, 6);

		g.addEdge(2, 1);
		g.addEdge(2, 5);
		g.addEdge(2, 4);
		
		//g.DFSUtil(1);
		//g.BFSUtil(1);
		g.BFSUtilRecur(1);
}
}
