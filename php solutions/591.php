<?php
$n = readline();

function star(): void
{
    echo str_repeat('*', $GLOBALS['n']) . "\n";
}

star();
$side = str_repeat(' ', $n - 2);
for ($i = 0; $i < $n - 2; $i++)
    echo '*' . $side . "*\n";
star();
