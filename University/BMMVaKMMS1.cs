using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var n = Convert.ToInt64(Console.ReadLine());
            var m = Convert.ToInt64(Console.ReadLine());
            var kmm = (n * m) / Main.gcd(n, m);
            Console.Write(Main.gcd(n, m).ToString() + " " + kmm.ToString());
        }
    }
    public static long gcd(long p, long q)
    {
        if (q == 0)
        {
            return p;
        }
        else
        {
            return Main.gcd(q, p % q);
        }
    }
}
