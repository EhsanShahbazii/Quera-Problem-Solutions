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
            $side = (int)readline();
            for ($i = 1; $i <= $side; $i++)
            {
                if ($i == 1)
                {
                    Main::print($side);
                    echo "";
                }
                else if ($i == $side)
                {
                    Main::print($side);
                }
                else
                {
                    Main::printDeep($side);
                }
                echo "","\n";
            }
        }
    }
    public static function print($side)
    {
        for ($i = 1; $i <= $side; $i++)
        {
            echo "*";
        }
    }
    public static function printDeep($side)
    {
        for ($i = 1; $i <= $side; $i++)
        {
            if ($i == 1 || $i == $side)
            {
                echo "*";
            }
            else
            {
                echo " ";
            }
        }
    }
}
Main::main_1($argv);
