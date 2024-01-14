using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var min = Convert.ToInt64(Console.ReadLine());
            var max = Convert.ToInt64(Console.ReadLine());
            var flag = true;
            if (min == 1)
            {
                min++;
            }
            for (int i = min; i <= max; i++)
            {
                for (int j = 2; j <= (int)(i / 2); j++)
                {
                    if (i % j == 0)
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                {
                    Console.WriteLine(i);
                }
                flag = true;
            }
        }
    }
}
