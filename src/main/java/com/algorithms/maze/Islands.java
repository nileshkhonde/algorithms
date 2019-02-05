package com.algorithms.maze;

public class Islands {
	
	
public static void main(String[] args) {

/*
    [ 1,   1,   0,   0 ]
    [ 0,   1,   0,   1 ]
    [ 1,   1,   0,   0 ]
    [ 1,   1,   1,   0 ]
 */
int[][] matrix=new int[][]{{1,1,0,0},{0,1,0,0},{1,1,1,0},{1,1,1,0}};

/*
    [ 1,   0,   1,   0 ]
    [ 1,   1,   1,   1 ]
    [ 0,   0,   0,   0 ]
    [ 0,   1,   1,   0 ]
 */
int[][] matrix1=new int[][]{{1,   0,   1,   0},{1,   1,   1,   1},{0,0,0,0},{0,1,1,0}};

Islands o = new Islands();

	System.out.println(o.numberOfIsland(matrix1));
}

int numberOfIsland(int[][] matrix) {
	int numOfIsland = 0;
	for(int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[i].length;j++) {
			if(matrix[i][j] == 1) {
				if(numOfIsland ==  0) {
					numOfIsland++;
				}else if(isZeroAround(matrix,i,j)){
					numOfIsland++;
					
				}
			}
		}
	}
	
	return numOfIsland;
}

boolean isSafe(int[][] matrix, int i, int j) {
	boolean isSafe = true;
	if(i<0 || i>matrix.length-1 || j<0 || j>matrix[0].length-1) {
		isSafe=false;
	}	
	return isSafe;
}

boolean isZeroAround(int[][] matrix, int i, int j) {
	//right
	if(isSafe(matrix, i, j+1)){
		if(matrix[i][j+1] == 1) {
			return false;
		}
	}
	//bottom
	if(isSafe(matrix,i+1, j)){
		if(matrix[i+1][j] == 1) {
			return false;
		}
	}
	//top
	if(isSafe(matrix, i-1, j)){
		if(matrix[i-1][j] == 1) {
			return false;
		}
	}
	//left
	if(isSafe(matrix, i, j-1)){
		if(matrix[i][j-1] == 1) {
			return false;
		}
	}
	return true;
}

}
