package ru.spbstu.telematics.java;
import java.io.IOException;
import java.util.Scanner; // импорт сканера

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int i, j;
        String path1 = "C:\\Art\\Matrix1.txt";
        String path2 = "C:\\Art\\Matrix2.txt";
        Matrix MatrixA = new Matrix();
        Matrix MatrixB = new Matrix();
        Matrix MatrixC = new Matrix();
        System.out.println("Введите размерность матриц");
        i = scan.nextInt();
        j = scan.nextInt();
        MatrixA.create_Matrix(i, j, "Matrix.A");
        MatrixA.fill_Matrix(path1);
        MatrixA.print_Matrix();
        System.out.println("Введите размерность второй матрицы");
        MatrixB.create_Matrix(i, j, "Matrix.B");
        MatrixB.fill_Matrix(path2);
        MatrixB.print_Matrix();
        MatrixC.create_Matrix(i, j, "Matrix.C");

        MatrixC.Summ_of_Matrix(i,j,MatrixA,MatrixB);

    }
}