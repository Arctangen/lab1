package ru.spbstu.telematics.java;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private Matrix MatrixTest0;
    private Matrix MatrixTest1;
    private Matrix MatrixTest2;

    @Before
    public void Preparations()
    {
        MatrixTest0 = new Matrix();
        MatrixTest1 = new Matrix();
        MatrixTest2 = new Matrix();

    }

    @Test
    public void ZeroTest()
    {
        MatrixTest0.create_Matrix(-55,0,"");
        MatrixTest1.create_Matrix(33,-1,"");
        MatrixTest2.create_Matrix(-4,0,"null");
        assertNotNull(MatrixTest0);
        assertNotNull(MatrixTest1);
        assertNotNull(MatrixTest2);
    }

    @Test
    public void test3x4() throws IOException
    {
        String path1 = "C:\\Art\\Matrix1.txt";
        String path2 = "C:\\Art\\Matrix2.txt";
        MatrixTest0.create_Matrix(3,4,"Test0");
        MatrixTest1.create_Matrix(3,4,"Test1");
        MatrixTest2.create_Matrix(3,4,"Test2");
        MatrixTest0.fill_Matrix(path1);
        MatrixTest1.fill_Matrix(path2);
        Matrix ExpectedMatrix = new Matrix();
        ExpectedMatrix.create_Matrix(3, 4, "Matrix.Expected");
        String path = "C:\\Art\\Matrix3x4.txt";
        ExpectedMatrix.fill_Matrix(path);
        MatrixTest2.Summ_of_Matrix(3,4,MatrixTest0,MatrixTest1);
        assertEquals(ExpectedMatrix.array,MatrixTest2.array);
    }

    @Test
    public void DifferentSizes() throws IOException {
        String path1 = "C:\\Art\\Matrix1.txt";
        String path2 = "C:\\Art\\Matrix2.txt";
        MatrixTest0.create_Matrix(3,4,"Test0");
        MatrixTest1.create_Matrix(4,2,"Test1");
        MatrixTest2.create_Matrix(5,4,"Test2");
        MatrixTest0.fill_Matrix(path1);
        MatrixTest1.fill_Matrix(path2);
        Matrix ExpectedMatrix = new Matrix();
        ExpectedMatrix.create_Matrix(3, 4, "Matrix.Expected");
        String path = "C:\\Art\\Matrix3x4.txt";
        ExpectedMatrix.fill_Matrix(path);
        MatrixTest2.Summ_of_Matrix(3,4,MatrixTest0,MatrixTest1);
        assertNotEquals(ExpectedMatrix.array,MatrixTest2.array);
    }
}
