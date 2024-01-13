using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var side1 = Convert.ToInt64(Console.ReadLine());
            var side2 = Convert.ToInt64(Console.ReadLine());
            var side3 = Convert.ToInt64(Console.ReadLine());
            if (side1 * side1 == side2 * side2 + side3 * side3)
            {
                Console.Write("YES");
            }
            else if (side2 * side2 == side1 * side1 + side3 * side3)
            {
                Console.Write("YES");
            }
            else if (side3 * side3 == side1 * side1 + side2 * side2)
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
