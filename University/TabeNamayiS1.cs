using System;
using System.IO;
public class Main
{
    public static void Main(string[] args)
    {
        try (public const  scanner =  "Inputs";)
        {
            var x = Convert.ToInt64(Console.ReadLine());
            var n = Convert.ToInt64(Console.ReadLine());
            var result = BigDecimal.valueOf(0);
            for (int i = 1; i <= n; i++)
            {
                result = result.add(Main.pows(x, i - 1).divide(Main.factorial(i - 1),java.math.MathContext.DECIMAL128));
            }
            java.io.PrintStream@6b1274d2.format("%.3f",result);
        }
    }
    public static BigDecimal factorial(long n)
    {
        if (n == 0)
        {
            return BigDecimal.valueOf(1);
        }
        else
        {
            return (BigDecimal.valueOf(n).multiply(Main.factorial(n - 1)));
        }
    }
    public static BigDecimal pows(long num, int n)
    {
        var result = BigDecimal.valueOf(1);
        for (int i = 0; i < n; i++)
        {
            result = result.multiply(BigDecimal.valueOf(num));
        }
        return result;
    }
}
