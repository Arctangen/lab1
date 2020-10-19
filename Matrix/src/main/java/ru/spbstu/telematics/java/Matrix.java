package ru.spbstu.telematics.java;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Matrix
{
    public int num_of_rows;
    public int num_of_columns;
    public int[][] array;
    public String Name;

    public void create_Matrix(int i, int j, String Word)
    {
        if (i<1||j<1)
            return;
        this.num_of_rows = i;
        this.num_of_columns = j;
        this.array = new int[num_of_rows][num_of_columns];
        this.Name=Word;
    }

    public void fill_Matrix(String path) throws IOException
    {
        Scanner scanner = new Scanner(new FileReader(path));
        for (int r = 0;r < this.num_of_rows; r++)
        {
            for (int c =0;c< this.num_of_columns;c++)
            {
                if(scanner.hasNextInt())
                {
                    this.array[r][c]=scanner.nextInt();
                }
            }
        }
    }

    public Matrix Summ_of_Matrix(int i,int j, Matrix matrixa, Matrix matrixb)
    {
        if ((matrixa.num_of_rows!=matrixb.num_of_rows)||(matrixa.num_of_columns!=matrixb.num_of_columns))
            return this;
        for (int r = 0; r < i; r++)
        {
            for (int c = 0; c < j; c++)
            {
                this.array[r][c] = matrixa.array[r][c] + matrixb.array[r][c];
            }
        }
        System.out.println("Результат суммы матриц:");

        this.print_Matrix();

        return this;

    }

    public void print_Matrix()
    {
        System.out.println(this.Name);
        for (int r = 0;r < this.num_of_rows; r++)
        {
            for (int c =0;c< this.num_of_columns;c++)
            {
                System.out.print(this.array[r][c]+" ");
            }
            System.out.println("");
        }
    }
}