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
            var result = "";
            for (int i = min + 1; i < max; i++)
            {
                for (int j = 2; j <= (int)(i / 2); j++)
                {
                    if (i % j == 0)
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                {
                    result = result+i.ToString() + ",";
                }
                flag = true;
            }
            if (result.Length > 1)
            {
                Console.Write(result.Substring(0,result.Length - 1-0));
            }
        }
    }
}
