//Zachary Scholz
import java.util.Scanner;

public class Lab07 {

public static void main(String[] args) {
Scanner key = new Scanner(System.in);
boolean sameSize = false;
int mat2_cols = 0;
int mat2_rows = 0;
System.out.println("Enter the numbers of rows of matrix 1:");
int mat1_rows = key.nextInt();
System.out.println("Enter the number of columns of matrix 1:");
int mat1_cols = key.nextInt();
while(sameSize == false)
{
System.out.println("Enter the number of rows in matrix 2:");
 mat2_rows = key.nextInt();

System.out.println("Enter the number of columns in matrix 2:");

 mat2_cols = key.nextInt();
if(mat2_cols == mat1_cols && mat2_rows == mat1_rows) {
	sameSize = true;
}
else {
	System.out.println("Please ensure that the matrices are equal");
}
}
//create two matrices
int[][] matrix1 = new int[mat1_rows][mat1_cols];
int[][] matrix2 = new int[mat2_rows][mat2_cols];
//first matrix
for(int i=0; i<mat1_rows; i++)
{
for(int j=0; j<mat1_cols; j++)
{
System.out.println("Enter the value of the matrix 1 at postion ("+i+","+j+"):");
matrix1[i][j] = key.nextInt();
}
}
//second matrix
for(int i=0; i<mat2_rows; i++)
{
for(int j=0; j<mat2_cols; j++)
{
System.out.println("Enter the value of the matrix 2 at position ("+i+","+j+"):");
matrix2[i][j] = key.nextInt();
}
}
//matrix addition
int[][] productMatrix = new int[mat1_rows][mat2_cols];
int sum = 0;
for(int i=0; i<mat1_rows; i++)
{
for(int j=0; j<mat2_cols; j++)
{
for(int k=0; k<mat1_cols; k++)
{
sum = matrix1[i][j] + matrix2[i][j];
}
productMatrix[i][j] = sum;
sum = 0;
}
}
//print sum matrix
for(int i = 0; i < mat1_rows; i++)
{
for(int j = 0; j < mat2_cols; j++)
{
System.out.print(productMatrix[i][j]+" ");
}
System.out.println();
//puts the next row down a line
}
}

}