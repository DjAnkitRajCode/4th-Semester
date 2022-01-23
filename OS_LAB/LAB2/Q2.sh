#! /bin/bash

read -p 'Enter a 3-digit number :' Num

rem1=`expr $Num % 10`
Num=`expr $Num / 10` 
rem2=`expr $Num % 10`
Num=`expr $Num / 10` 
rem3=`expr $Num % 10`
S=`expr $rem3 + $rem2 + $rem1`
echo "Sum of the entered 3-digit number is $S"