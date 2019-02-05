package com.algorithms.array;

public class SpiralMatrix {

	int[][] spiralMatrix(int n) {
		int[][] a = new int[n][n];
		int k=1;
		int firstRow=0;
		int lastRow=n-1;
		int firstColumn=0;
		int lastColumn=n-1;
		
		while(firstRow<=lastRow && firstColumn<=lastColumn) {
			//first row
			for(int i=firstColumn;i<=lastColumn;i++) {
				a[firstRow][i]=k++;
			}
			firstRow++;
			
			//last column
			for(int i=firstRow;i<=lastRow;i++) {
				a[i][lastColumn]=k++;
			}
			lastColumn--;
			
			//last row
			for(int i=lastColumn;i>=firstColumn;i--) {
				a[lastRow][i]=k++;
			}
			lastRow--;
			
			//first column
			for(int i=lastRow;i>=firstRow;i--) {
				a[i][firstColumn]=k++;
			}
			firstColumn++;
		}
		return a;
	}
	
	public static void main(String[] args) {
		SpiralMatrix s = new SpiralMatrix();
		int[][] array = s.spiralMatrix(4);
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		
	}
}
