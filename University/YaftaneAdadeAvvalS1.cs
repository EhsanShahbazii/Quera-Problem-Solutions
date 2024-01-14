using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var number = Convert.ToInt64(Console.ReadLine());
            var sum = 0;
            var count = 0;
            var prime = 0;
            var distance = number;
            while (number > 0)
            {
                sum += number % 10;
                number /= 10;
            }
            if (distance == 1)
            {
                Console.Write(2);
            }
            else
            {
                var flag = false;
                while (count < sum)
                {
                    distance++;
                    for (int i = 2; i <= (distance + 1) / 2; i++)
                    {
                        if (distance % i == 0)
                        {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag)
                    {
                        count++;
                        prime = distance;
                    }
                    flag = false;
                }
                Console.Write(prime);
            }
        }
    }
}
