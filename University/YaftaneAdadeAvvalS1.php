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
            $sum = 0;
            $count = 0;
            $prime = 0;
            $distance = $number;
            while ($number > 0)
            {
                $sum += $number % 10;
                $number /= 10;
            }
            if ($distance == 1)
            {
                printf("%d",2);
            }
            else
            {
                $flag = false;
                while ($count < $sum)
                {
                    $distance++;
                    for ($i = 2; $i <= ($distance + 1) / 2; $i++)
                    {
                        if ($distance % $i == 0)
                        {
                            $flag = true;
                            break;
                        }
                    }
                    if (!$flag)
                    {
                        $count++;
                        $prime = $distance;
                    }
                    $flag = false;
                }
                printf("%d",$prime);
            }
        }
    }
}
Main::main_1($argv);
