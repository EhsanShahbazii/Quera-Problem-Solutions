using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        var scanner =  "Inputs";
        var num = Convert.ToInt64(Console.ReadLine());
        Console.Write(Main.fact(num));
    }
    public static long fact(int num)
    {
        if (num == 0)
        {
            return 1;
        }
        else
        {
            return num * Main.fact(num - 1);
        }
    }
}
