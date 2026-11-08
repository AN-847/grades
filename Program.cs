<?php

function average($arr) {
    $sum = 0;
    foreach($arr as $val) {
        $sum += $val;
    }
    return $sum / count($arr);
}

function letter($avg) {
    if ($avg >= 80) {
        return 'A';
    } elseif ($avg >= 70) {
        return 'B';
    } elseif ($avg >= 60) {
        return 'C';
    } elseif ($avg >= 50) {
        return 'D';
    } else {
        return 'F';
    }
}

// Store 5 exam scores
$scores = [75, 82, 68, 90, 53];

echo "Listing all exam scores:\n";
for ($i = 0; $i < count($scores); $i++) {
    $pos = $i + 1;
    echo "Score $pos: " . $scores[$i] . "\n";
}

$avgScore = average($scores);
$gradeLetter = letter($avgScore);

$formattedAvg = number_format($avgScore, 2);
echo "\nAverage: {$formattedAvg} ({$gradeLetter})\n";

