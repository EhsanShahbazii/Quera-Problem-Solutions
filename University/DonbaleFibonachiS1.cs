using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        var scanner =  "Inputs";
        var n = Convert.ToInt64(Console.ReadLine());
        var m = Convert.ToInt64(Console.ReadLine());
        if (n == 1)
        {
            Console.Write(1);
        }
        else
        {
            var fib = new int[1000000];
            fib[0] = 1;
            fib[1] = 1;
            var f1 = 1;
            var f2 = 1;
            var f3 = 2;
            var i = 2;
            while (f3 <= n)
            {
                fib[i] = f3;
                i++;
                f1 = f2;
                f2 = f3;
                f3 = f1 + f2;
            }
            for (int j = i - 1; j >= 0; j--)
            {
                Console.WriteLine(fib[j]);
            }
        }
    }
}
