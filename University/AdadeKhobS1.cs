using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        var scanner =  "Inputs";
        var number = Convert.ToInt64(Console.ReadLine());
        var sum = 0;
        var n = 1;
        long m;
        var flag = true;
        while (flag)
        {
            m = (n * (n + 1)) / 2;
            for (int i = 1; i <= m; i++)
            {
                if (m % i == 0)
                {
                    sum++;
                }
            }
            if (number <= sum)
            {
                Console.Write(m);
                flag = false;
            }
            sum = 0;
            n++;
        }
    }
}
