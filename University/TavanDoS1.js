class Main
{
    static main(args)
    {
        try (scanner = java.util.Scanner(java.io.BufferedInputStream@b3d7190);)
        {
            var number = this.scanner.nextLong();
            var pow = 1;
            while (number >= pow)
            {
                pow *= 2;
            }
            console.log(pow);
        }
    }
}
Main.main([]);
