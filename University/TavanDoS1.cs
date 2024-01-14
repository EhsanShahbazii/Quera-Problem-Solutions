using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var number = Convert.ToInt64(Console.ReadLine());
            var pow = 1;
            while (number >= pow)
            {
                pow *= 2;
            }
            Console.Write(pow);
        }
    }
}
