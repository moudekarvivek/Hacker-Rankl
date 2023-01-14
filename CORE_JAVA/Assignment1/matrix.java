import java.io.*;
class Matrixadd
{
	int[][] Matrixadd(int A[][],int B[][])//Method for addition of matrix
	
	{

		int C[][]=new int[A.length][A[0].length];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}

		}	
   		return C;
   	}

}

class matrix
{

	public static void main(String args[]) throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);

		System.out.println("Enter no. of rows of matrix A:");
		int Ar=Integer.parseInt(br.readLine());
		System.out.println("Enter no. of Coloumns in Matrix A:");
		int Ac=Integer.parseInt(br.readLine());


		System.out.println("Enter no. of rows of matrix B:");
		int Br=Integer.parseInt(br.readLine());
		System.out.println("Enter no. of Coloumns of matrix B:");
		int Bc=Integer.parseInt(br.readLine());


		if((Ar==Br)&&(Ac==Bc))  //Condition for matrix addition 
		{
			int A[][]=new int[Ar][Ac];
			int B[][]=new int[Br][Bc];
			int C[][]=new int[Ar][Ac];
			System.out.println("\nEnter elements of matrix A:");
			for(int i=0;i<Ar;i++)
			{
				for(int j=0;j<Ac;j++)
				{
					System.out.format("Enter element A[%d][%d]:",i+1,j+1);
					A[i][j]=Integer.parseInt(br.readLine());
				}
	
			}
			System.out.println("\n Matrix A:");
			for(int i=0;i<Ar;i++)
			{
				for(int j=0;j<Ac;j++)
				{
					System.out.print(A[i][j]+" ");
				}
				System.out.println("\n");
			}


			System.out.println("\nEnter elements of matrix B:");
			for(int i=0;i<Br;i++)
			{
				for(int j=0;j<Bc;j++)
				{
					System.out.format("Enter element B[%d][%d]:",i+1,j+1);
					B[i][j]=Integer.parseInt(br.readLine());
				}
	
			}
			System.out.println("\n Matrix B:");
			for(int i=0;i<Br;i++)
			{
				for(int j=0;j<Bc;j++)
				{
					System.out.print(B[i][j]+" ");
				}
				System.out.println("\n");
			}	

			System.out.println("\nMatrix Addition:");

			Matrixadd ma=new Matrixadd();

			C=ma.Matrixadd(A,B);
			for(int i=0;i<Ar;i++)
			{
				for(int j=0;j<Ac;j++)
				{
					System.out.print(C[i][j]+" ");
				}
				System.out.println("\n");
			}

		}
else
System.out.println("Matrix Addition is not Possible:");
}
}

