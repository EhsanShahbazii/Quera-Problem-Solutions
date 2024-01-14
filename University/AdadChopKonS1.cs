using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var string = Console.ReadLine();
            for (int i = 0; i < string.Length; i++)
            {
                Console.Write(string[i].ToString() + ": ");
                for (int j = 0; j < (int)(string[i]) - 48; j++)
                {
                    Console.Write(string[i]);
                }
                Console.WriteLine("");
            }
        }
    }
}
