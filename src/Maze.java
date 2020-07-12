package src;

import java.util.*;

public class Maze {
	
	    public static void main(String[] args) {
			
		 /*
	            [ 1,   1,   0,   0 ]
	            [ 0,   1,   1,   8 ]
	         */

	        int[][] matrix=new int[][]{{1,1,0,0},{0,1,1,8}};

	        /*
	            [ 1,   1,   0,   0 ]
	            [ 0,   1,   0,   0 ]
	            [ 1,   1,   1,   0 ]
	            [ 1,   0,   1,   8 ]
	            [ 1,   1,   1,   0 ]
	         */

	        int[][] matrix1=new int[][]{{1,1,0,0},{0,1,0,0},{1,1,1,0},{1,0,1,8},{1,1,1,0}};

	        /*
	            [ 1,   0,   0,   1 ]
	            [ 1,   1,   1,   1 ]
	            [ 0,   0,   8,   0 ]
	            [ 0,   0,   0,   0 ]
	            [ 0,   0,   0,   0 ]
	         */

	        int[][] matrix2=new int[][]{{0,0,0,1},{1,1,1,1},{0,0,8,0},{0,0,0,0},{8,0,0,0}};

	        MazeTest o = new MazeTest();
	        //o.shortestpath(matrix);
	        //System.out.println(o.shortestpath(matrix1));
	        System.out.println(o.shortestpath(matrix2));
	        
	        
	        
	}
	    int shortestpath(int[][] matrix) {
	    	boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		       for(int i=0;i<visited.length;i++) {
		    	   	Arrays.fill(visited[i], false);
		       }
		      
		        for(int i=0;i<matrix.length;i++) {
		        		for(int j=0;j<matrix[i].length; j++) {
		        			if(isSafe(matrix, visited, i, j)){
		        			//	System.out.println(matrix[i][j]);
		        			}
		        		}
		        		//System.out.println();
		        }
		        
		        int row = 0;
		        int column = 0;
		        Point p = new Point(0,0,0);
		        
		        Queue<Point> q = new LinkedList<Point>();
		        q.offer(p);
		        visited[row][column]=true;
		        
		        while(!q.isEmpty()) {
		        		Point point = q.poll();
		        		if(matrix[point.row][point.column] == 8) {
		        			return point.distance;
		        		}
		        			        		
		        		//right
		        		if(isSafe(matrix, visited, point.row, point.column+1)){
		        			q.offer(new Point(point.row, point.column+1, point.distance+1));
		        			visited[point.row][point.column+1]=true;
		        		}
		        		//bottom
		        		if(isSafe(matrix, visited, point.row+1, point.column)){
		        			q.offer(new Point(point.row+1, point.column, point.distance+1));
		        			visited[point.row+1][point.column]=true;
		        		}
		        		//top
		        		if(isSafe(matrix, visited, point.row-1, point.column)){
		        			q.offer(new Point(point.row-1, point.column, point.distance-1));
		        			visited[point.row-1][point.column]=true;
		        		}
		        		//left
		        		if(isSafe(matrix, visited, point.row, point.column-1)){
		        			q.offer(new Point(point.row, point.column-1, point.distance-1));
		        			visited[point.row][point.column-1]=true;
		        		}
		        		
		        }
		        
		        return -1;
	    }
	    
	    boolean isSafe(int[][] matrix, boolean visited[][], int i, int j) {
	    		boolean isSafe = true;
	    		if(i<0 || i>matrix.length-1 || j<0 || j>matrix[0].length-1) {
	    			isSafe=false;
	    		}else if(matrix[i][j] == 0) {
		    			isSafe=false;
		    	}else if(visited[i][j]) {
		    		isSafe = false;
		    	}
	    		
	    		
	    		return isSafe;
	    }
	
	
}
