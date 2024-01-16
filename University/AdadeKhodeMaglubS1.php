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
            $reverse = "";
            for ($i = 0; $i < strlen($number); $i++)
            {
                $reverse = $reverse.strval($number[strlen($number) - ($i + 1)]);
            }
            if ((strcmp($reverse,$number)==0))
            {
                echo "YES";
            }
            else
            {
                echo "NO";
            }
        }
    }
}
Main::main_1($argv);
