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
            $n = (int)readline();
            $b = (int)readline();
            $result = strval(intval(strval($n),10),$b);
            echo $result.toUpperCase();
        }
    }
}
Main::main_1($argv);
