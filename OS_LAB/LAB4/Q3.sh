#! /bin/bash

read -p 'Enter the no. of terms: ' n
a=0
b=1
echo
echo -n "The Fibonacci Series: "
while [ $a -le $((n - 1)) ]
do
    echo -n " $a "
    c=$(( b + a ))
    a=$b
    b=$c
done
echo