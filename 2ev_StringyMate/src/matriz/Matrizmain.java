package matriz;

import java.util.Scanner;

public class Matrizmain {

	public static void main(String[] args) {
		int[][] mat1=new int[][]{{2,3,4},{1,2,3},{3,4,5}};
		
		//imprimir matriz//

		for( int i =0; i<mat1.length;i++) {
			for (int j=0; j<mat1[i].length;j++) {
				System.out.print(mat1[i][j] +"\t");
			}
			System.out.println("");
		}
		
		
	}
	
	

}
