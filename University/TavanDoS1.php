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
        try (
        public $scanner = "Inputs";)
        {
            $number = (int)readline();
            $pow = 1;
            while ($number >= $pow)
            {
                $pow *= 2;
            }
            printf("%d",$pow);
        }
    }
}
Main::main_1($argv);
