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
            $min = (int)readline();
            $max = (int)readline();
            $flag = true;
            if ($min == 1)
            {
                $min++;
            }
            for ($i = $min; $i <= $max; $i++)
            {
                for ($j = 2; $j <= (int)($i / 2); $j++)
                {
                    if ($i % $j == 0)
                    {
                        $flag = false;
                        break;
                    }
                }
                if ($flag == true)
                {
                    printf("%d\n",$i);
                }
                $flag = true;
            }
        }
    }
}
Main::main_1($argv);
