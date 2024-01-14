using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        var input =  "Inputs";
        var row1 = input.nextByte();
        var column = input.nextByte();
        var column2 = input.nextByte();
        var array1 = new int[101,101];
        var array2 = new int[101,101];
        var result = new int[101,101];
        for (byte i = 0; i < row1; i++)
        {
            for (byte j = 0; j < column; j++)
            {
                array1[i,j] = Convert.ToInt64(Console.ReadLine());
            }
        }
        for (byte i = 0; i < column; i++)
        {
            for (byte j = 0; j < column2; j++)
            {
                array2[i,j] = Convert.ToInt64(Console.ReadLine());
            }
        }
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < column2; j++)
            {
                for (int k = 0; k < column; k++)
                {
                    result[i,j] += array1[i,k] * array2[k,j];
                }
            }
        }
        for (byte i = 0; i < row1; i++)
        {
            for (byte j = 0; j < column2; j++)
            {
                Console.Write(result[i,j].ToString() + " ");
            }
            Console.WriteLine("");
        }
    }
}
