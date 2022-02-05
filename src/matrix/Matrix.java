package matrix;

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

	
	
}