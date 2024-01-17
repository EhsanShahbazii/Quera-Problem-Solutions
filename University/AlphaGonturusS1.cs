using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var n = Convert.ToInt64(Console.ReadLine());
            var b = Convert.ToInt64(Console.ReadLine());
            var result = Convert.ToString(int.Parse(String.valueOf(n),10),b);
            Console.Write(result.ToUpper());
        }
    }
}
