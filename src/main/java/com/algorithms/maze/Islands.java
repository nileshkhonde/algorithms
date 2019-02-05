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
	boolean[][] visited = new boolean[matrix.length][matrix[0].length];
	
	int numOfIsland = 0;
	for(int i=0;i<visited.length;i++) {
		for(int j=0;j<visited[i].length;j++) {
			if(matrix[i][j] == 1 && !visited[i][j]) {
				numOfIsland++;
				visited[i][j]=true;
				dfs(matrix,visited, i,j);
			}
		}
	}
	return numOfIsland;
}

void dfs(int[][] matrix, boolean[][] visited, int i, int j){
	//right
		if(isSafe(matrix, visited, i, j+1)){
			if(matrix[i][j+1] == 1) {
				visited[i][j+1]=true;
				dfs(matrix, visited, i, j+1);
			}
		}
		//bottom
		if(isSafe(matrix,visited, i+1, j)){
			if(matrix[i+1][j] == 1) {
				visited[i+1][j]=true;
				dfs(matrix, visited, i+1, j);
			}
		}
		//top
		if(isSafe(matrix, visited, i-1, j)){
			if(matrix[i-1][j] == 1) {
				visited[i-1][j]=true;
				dfs(matrix, visited, i-1, j);
			}
		}
		//left
		if(isSafe(matrix, visited, i, j-1)){
			if(matrix[i][j-1] == 1) {
				visited[i][j-1]=true;
				dfs(matrix, visited, i, j-1);
			}
		}
}

boolean isSafe(int[][] matrix, boolean[][] visited, int i, int j) {
	boolean isSafe = true;
	if(i<0 || i>matrix.length-1 || j<0 || j>matrix[0].length-1) {
		isSafe=false;
	}else if(visited[i][j]) {
		isSafe=false;
	}
	return isSafe;
}


}
