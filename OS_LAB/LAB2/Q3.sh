#! /bin/bash

read -p 'Enter any distance in cm: ' d
km=`expr $d / 100000`
d=`expr $d % 100000`
m=`expr $d / 100`
d=`expr $d % 100`
echo "$km km, $m m, $d cm"