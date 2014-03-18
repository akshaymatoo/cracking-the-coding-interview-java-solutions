/*
1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0
*/

import java.util.*;

public class Prob_1_7
{
	public void makeZero(int[][] matrix, int M, int N)
	{
		//space complexity O(m+n)
		int row[] = new int[M];
		int col[] = new int[N];

		//time complexity O(n*m)
		for ( int i = 0 ; i < M ; i++ )
		{
			for ( int j = 0 ; j < N ; j++ )
			{
				if ( matrix[i][j] == 0 )
				{
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		//time complexity O(n*m)
		for ( int i = 0 ; i < M ; i++ )
		{
			for ( int j = 0 ; j < N ; j++ )
			{
				if ( col[j] == 1  || row[i] == 1 )
				{
					matrix[i][j] = 0;
				}
			}
		}
	
	}

	public void display(int[][] matrix)
	{
		for(int i = 0; i < matrix.length; i++)
		{
		    for(int j = 0; j < matrix[i].length; j++)
		    {
		        System.out.print(matrix[i][j]);
		        if(j < matrix[i].length - 1) System.out.print(",");
		    }
		    System.out.println();
		}

	}

	public static void main(String args[])
	{
		Prob_1_7 prob = new Prob_1_7();
		
		int N = 10, M = 3;
		int[][] matrix = new int[M][N];

		Random r = new Random(5);

		for ( int i = 0 ; i < M ; i++ )
		{
			for ( int j = 0 ; j < N ; j++ )
			{
				matrix[i][j] = r.nextInt() % 5;
			}
		}
		prob.display(matrix);

		prob.makeZero(matrix, M, N);

		System.out.println();

		prob.display(matrix);
	}
 }