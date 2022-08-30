<?php
$number = 5;
for ($i = 1; $i <= $number; $i++) {
    echo str_repeat('*', $i * ($i + 1) /2) . str_repeat('0', $i) . PHP_EOL;
}
?>