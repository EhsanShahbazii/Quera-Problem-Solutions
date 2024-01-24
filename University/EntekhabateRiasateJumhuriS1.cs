using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        var scanner =  "Inputs";
        var n = Convert.ToInt64(Console.ReadLine());
        Console.WriteLine(Main.person(n, 2) + 1);
    }
    public static int person(int n, int k)
    {
        if (n == 1)
        {
            return 0;
        }
        else
        {
            return (Main.person(n - 1, k) + k) % n;
        }
    }
}
