<?php

class Main
{
    function __construct(){
    }
    public static function Main_1()
    {
        $local_this = new Main();
        return $local_this;
    }
    public static function main_1(&$args)
    {
        $scanner = "Inputs";
        $n = (int)readline();
        $m = (int)readline();
        if ($n == 1)
        {
            printf("%d",1);
        }
        else
        {
            $fib = array_fill(0,1000000,0);
            $fib[0] = 1;
            $fib[1] = 1;
            $f1 = 1;
            $f2 = 1;
            $f3 = 2;
            $i = 2;
            while ($f3 <= $n)
            {
                $fib[$i] = $f3;
                $i++;
                $f1 = $f2;
                $f2 = $f3;
                $f3 = $f1 + $f2;
            }
            for ($j = $i - 1; $j >= 0; $j--)
            {
                printf("%d\n",$fib[$j]);
            }
        }
    }
}
Main::main_1($argv);
