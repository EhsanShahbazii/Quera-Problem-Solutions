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
        $n;
        $i;
        $j;
        $space = 1;
        $s = "Inputs";
        $n = (int)readline();
        $n++;
        $space = $n - 1;
        for ($j = 1; $j <= $n; $j++)
        {
            for ($i = 1; $i <= $space; $i++)
            {
                echo " ";
            }
            $space--;
            for ($i = 1; $i <= 2 * $j - 1; $i++)
            {
                echo "*";
            }
            echo "","\n";
        }
        $space = 1;
        for ($j = 1; $j <= $n - 1; $j++)
        {
            for ($i = 1; $i <= $space; $i++)
            {
                echo " ";
            }
            $space++;
            for ($i = 1; $i <= 2 * ($n - $j) - 1; $i++)
            {
                echo "*";
            }
            echo "","\n";
        }
    }
}
Main::main_1($argv);
