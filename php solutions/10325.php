<?php
$n = readline();
[$r, $c] = explode(" ", $n);

echo ($c > 10) ? "Left " . 11 - $r . ' ' . 21 - $c : "Right " . 11 - $r . ' ' . $c;
