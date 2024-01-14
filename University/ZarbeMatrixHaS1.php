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
        $input = "Inputs";
        $row1 = (int)readline();
        $column = (int)readline();
        $column2 = (int)readline();
        $array1 = array_fill(0,101,array_fill(0,101,0));
        $array2 = array_fill(0,101,array_fill(0,101,0));
        $result = array_fill(0,101,array_fill(0,101,0));
        for ($i = 0; $i < $row1; $i++)
        {
            for ($j = 0; $j < $column; $j++)
            {
                $array1[$i][$j] = (int)readline();
            }
        }
        for ($i = 0; $i < $column; $i++)
        {
            for ($j = 0; $j < $column2; $j++)
            {
                $array2[$i][$j] = (int)readline();
            }
        }
        for ($i = 0; $i < $row1; $i++)
        {
            for ($j = 0; $j < $column2; $j++)
            {
                for ($k = 0; $k < $column; $k++)
                {
                    $result[$i][$j] += $array1[$i][$k] * $array2[$k][$j];
                }
            }
        }
        for ($i = 0; $i < $row1; $i++)
        {
            for ($j = 0; $j < $column2; $j++)
            {
                echo strval($result[$i][$j]) . " ";
            }
            echo "","\n";
        }
    }
}
Main::main_1($argv);
