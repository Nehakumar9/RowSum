package rowsum;

import java.util.Arrays;
import java.util.Scanner;

public class RowSum {

	public static void rowSum(int[][] matrix,int rows,int cols) {
		int sum[] =new int[rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sum[i] += matrix[i][j];
			}
		}
		System.out.println(Arrays.toString(sum));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int[][] matrix = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		rowSum(matrix,rows,cols);
	}

}
