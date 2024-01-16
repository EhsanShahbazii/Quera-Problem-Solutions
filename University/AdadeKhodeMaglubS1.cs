using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var number = Console.ReadLine();
            var reverse = "";
            for (int i = 0; i < number.Length; i++)
            {
                reverse = reverse+String.valueOf(number[number.Length - (i + 1)]);
            }
            if (reverse.Equals(number))
            {
                Console.Write("YES");
            }
            else
            {
                Console.Write("NO");
            }
        }
    }
}
