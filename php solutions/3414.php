<?php
$n = readline();
$p = explode(' ', $n);

echo ($p[0] == $p[2]) ? 'Vertical' : (($p[1] == $p[3]) ? 'Horizontal' : 'Try again');
