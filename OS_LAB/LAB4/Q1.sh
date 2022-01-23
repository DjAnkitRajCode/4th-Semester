#! /bin/bash

read -p 'Enter the numbers: ' a b
echo "Enter the operator"
read c

case $c in 
"+")
    d=$(( a + b ))
    echo "Sum is $d" ;;
"-")
    d=$(( a - b ))
    echo "Difference is $d" ;;
"/")
    d=$(( a / b ))
    echo "Quotient is $d" ;;
"*")
    d=$(( a * b ))
    echo "Product is $d" ;;
*)  echo "Wrong input"
esac