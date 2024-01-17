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
            $result = "";
            for ($i = $min + 1; $i < $max; $i++)
            {
                for ($j = 2; $j <= (int)($i / 2); $j++)
                {
                    if ($i % $j == 0)
                    {
                        $flag = false;
                        break;
                    }
                }
                if ($flag)
                {
                    $result = $result.strval($i) . ",";
                }
                $flag = true;
            }
            if (strlen($result) > 1)
            {
                echo substr($result,0,strlen($result) - 1 - 0);
            }
        }
    }
}
Main::main_1($argv);
