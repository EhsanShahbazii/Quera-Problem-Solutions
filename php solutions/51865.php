<?php
$x = readline();
$n = readline();

if ($n == 7)
    echo $x;

elseif ($n == 0)
    echo 20;
else {
    $x -= $n;
    echo ($x < 0) ? 0 : $x;
}
