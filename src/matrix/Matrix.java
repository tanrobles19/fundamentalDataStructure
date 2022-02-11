package matrix;

import java.util.Scanner;

public class Matrix {
	
	private int rows;
	private int columns;
	private int data[][];
	
	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.data = new int[rows][columns];
	}
	
	public Matrix(int[][] data) { 
		this.data = data; 
		this.rows = data.length; 
		this.columns = data[0].length; 
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public void read(String textMessage) { 
		
		System.out.println("Enter " + textMessage + " matrix elements");
		Scanner s = new Scanner(System.in); 
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				data[i][j] = s.nextInt();
			}	
		}
		
		print();
	}	
	
	public void print() { 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < columns; j++) { 
				System.out.print(data[i][j] + " "); 
			}// end for 
			System.out.println(); 
		}//end for 
	}// end method print()
	
}