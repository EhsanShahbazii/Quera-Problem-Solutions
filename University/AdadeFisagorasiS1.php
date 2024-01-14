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
        $number = (int)readline();
        $sum = 0;
        $n = 1;
        $m;
        $flag = true;
        while ($flag)
        {
            $m = ($n * ($n + 1)) / 2;
            for ($i = 1; $i <= $m; $i++)
            {
                if ($m % $i == 0)
                {
                    $sum++;
                }
            }
            if ($number <= $sum)
            {
                printf("%d",$m);
                $flag = false;
            }
            $sum = 0;
            $n++;
        }
    }
}
Main::main_1($argv);
