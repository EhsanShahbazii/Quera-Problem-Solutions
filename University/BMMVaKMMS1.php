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
            $m = (int)readline();
            $kmm = ($n * $m) / Main::gcd($n, $m);
            echo strval(Main::gcd($n, $m)) . " " . strval($kmm);
        }
    }
    public static function gcd($p, $q)
    {
        if ($q == 0)
        {
            return $p;
        }
        else
        {
            return Main::gcd($q, $p % $q);
        }
    }
}
Main::main_1($argv);
