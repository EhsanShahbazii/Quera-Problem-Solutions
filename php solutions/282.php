<?php
$n = readline();

$res = 1;
for ($i = 2; $i <= $n / 2; $i++)
    $res = ($n % $i == 0) ? $res + $i : $res;

echo ($res == $n) ? 'YES' : 'NO';
