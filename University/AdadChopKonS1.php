<?php

class Main {
    function __construct(){
    }
    public static function Main_1() {
        $local_this = new Main();
        return $local_this;
    }
    public static function main_1(&$args) {
        try (
        public $scanner = "Inputs";)
        {
            $string = readline();
            for ($i = 0; $i < strlen($string); $i++)
            {
                echo strval($string[$i]) . ": ";
                for ($j = 0; $j < ord($string[$i]) - 48; $j++)
                {

echo $string[$i];
                }
                echo "","\n";
            }
        }
    }
}
Main::main_1($argv);
