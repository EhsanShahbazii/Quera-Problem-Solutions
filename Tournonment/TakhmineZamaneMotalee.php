<?php
function estimateReadingTime(string $text): int 
{
    $text = preg_replace('/[.,?!:;]+/', '', $text);
    $words = preg_split('/\s+/', $text);
    $wordCount = count($words);
    $readingTime = ceil($wordCount / 200);
    return $readingTime;
}
