using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var side = Convert.ToInt64(Console.ReadLine());
            for (int i = 1; i <= side; i++)
            {
                if (i == 1)
                {
                    Main.print(side);
                    Console.Write("");
                }
                else if (i == side)
                {
                    Main.print(side);
                }
                else
                {
                    Main.printDeep(side);
                }
                Console.WriteLine("");
            }
        }
    }
    public static void print(int side)
    {
        for (int i = 1; i <= side; i++)
        {
            Console.Write("*");
        }
    }
    public static void printDeep(int side)
    {
        for (int i = 1; i <= side; i++)
        {
            if (i == 1 || i == side)
            {
                Console.Write("*");
            }
            else
            {
                Console.Write(" ");
            }
        }
    }
}
