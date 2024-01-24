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
        printf("%d\n",Main::person($n, 2) + 1);
    }
    public static function person($n, $k)
    {
        if ($n == 1)
        {
            return 0;
        }
        else
        {
            return (Main::person($n - 1, $k) + $k) % $n;
        }
    }
}
Main::main_1($argv);
