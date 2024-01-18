using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        int n;
        int i;
        int j;
        var space = 1;
        var s =  "Inputs";
        n = Convert.ToInt64(Console.ReadLine());
        n++;
        space = n - 1;
        for (j = 1; j <= n; j++)
        {
            for (i = 1; i <= space; i++)
            {
                Console.Write(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                Console.Write("*");
            }
            Console.WriteLine("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++)
        {
            for (i = 1; i <= space; i++)
            {
                Console.Write(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                Console.Write("*");
            }
            Console.WriteLine("");
        }
    }
}
