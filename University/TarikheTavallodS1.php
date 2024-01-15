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
            $number = readline();
            echo "saal:" . strval($number[0]) . strval($number[1]),"\n";
            echo "maah:" . strval($number[2]) . strval($number[3]),"\n";
        }
    }
}
Main::main_1($argv);
