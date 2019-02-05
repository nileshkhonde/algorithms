package com.algorithms.graph;

public class Point {
int row;
int column;
int distance;
	public Point(int r,int c,int d) {
		row = r;
		column = c;
		distance = d;
	}
	public String toString() {
		return "Row:"+row +" Column:" +column +" Distance:"+distance;
	}
}
