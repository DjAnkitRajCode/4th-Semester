#! /bin/bash

echo "Swapping of Two numbers without using 3rd variable"
read -p 'Enter x: ' x
read -p 'Enter y: ' y
echo
echo "Before Swapping: $x   $y"
echo
x=`expr $x + $y`
y=`expr $x - $y`
x=`expr $x - $y`
echo "After Swapping: $x   $y"