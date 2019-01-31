package com.algorithms.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Stack;


public class Graph {
	private Map<Integer, Vertex> lookup = new HashMap<Integer, Vertex>();
	
	public Graph(List<Vertex> vertices) {
		for(Vertex v : vertices) {
			lookup.put(v.getId(), v);
		}
	}
	public Vertex getVertex(Integer id) {
		return lookup.get(id);
	}
	
	public void addEdge(int sId, int dId) {
		Vertex s = getVertex(sId);
		Vertex d = getVertex(dId);
		s.getAdjascents().add(d);
	}
	
	public void DFSUtil(int start) {
		Set<Integer> visited = new HashSet<Integer>();
		Vertex s = getVertex(start);
		//DFSRecur(s, visited);
		DFS(s, visited);
	}
	
	public void DFSRecur(Vertex v, Set<Integer> visited) {
		if(v != null) {
			System.out.println(v.getId());
			visited.add(v.getId());
			
			for(Vertex adj:v.getAdjascents()) {
				if(adj !=null && (!visited.contains(adj.getId()))){
					DFSRecur(adj, visited);
				}
			}
		}
	}
	
	public void DFS(Vertex v, Set<Integer> visited) {

		Stack<Vertex> s = new Stack<Vertex>();
		s.push(v);
		visited.add(v.getId());
		
		while(!s.isEmpty()) {
			Vertex curr = s.pop();
			System.out.println(curr.getId());
			
			for(Vertex adj:curr.getAdjascents()) {
				if(adj !=null && (!visited.contains(adj.getId()))){
					s.push(adj);
					visited.add(adj.getId());
				}
			}
		}
	}
	
	
	public void BFSUtil(int start) {
		Set<Integer> visited = new HashSet<Integer>();
		Vertex s = getVertex(start);
		BFS(s, visited);
		
	}
	
	public void BFSUtilRecur(int start) {
		Set<Integer> visited = new HashSet<Integer>();
		Vertex s = getVertex(start);
		Queue<Vertex> q = new LinkedList<Vertex>();
		q.offer(s);
		visited.add(s.getId());
		BFSRecur(q, visited);	
	}
	
	public void BFSRecur( Queue<Vertex> q, Set<Integer> visited) {
		if(q.isEmpty()) {
			return;
		}
		
		Vertex v = q.poll();
		System.out.println(v.getId());
		for(Vertex child: v.getAdjascents()) {
			if(child != null && (!visited.contains(child.getId()))) {
				q.offer(child);
				visited.add(child.getId());
			}
		}
		
		BFSRecur(q, visited);
	}
	
	public void BFS(Vertex v, Set<Integer> visited) {
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.offer(v);
		visited.add(v.getId());
		while(!queue.isEmpty()) {
			Vertex vertex = queue.poll();
			System.out.println(vertex.getId());
			
			for(Vertex child: vertex.getAdjascents()) {
				if(child != null && (!visited.contains(child.getId()))) {
					queue.offer(child);
					visited.add(child.getId());
				}
			}
		}
		
	}
	
}
