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
        $num = (int)readline();
        printf("%d",Main::fact($num));
    }
    public static function fact($num)
    {
        if ($num == 0)
        {
            return 1;
        }
        else
        {
            return $num * Main::fact($num - 1);
        }
    }
}
Main::main_1($argv);
