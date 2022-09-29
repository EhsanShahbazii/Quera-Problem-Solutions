<?php
// </Ctrl+Z>

$line = readline();
[$a] = explode(' ', $line);
$answer = "";
for ($i = 0; $i < $a; $i++)
   $answer .= "o";
echo "W" . $answer . "w!";
?>
