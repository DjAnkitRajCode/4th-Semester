#! /bin/bash

read -p 'Enter any four numbers: ' a b c d

if [ $a -gt $b -a $a -gt $c -a $a -gt $d ]
then echo "$a is the largest."
fi
if [ $b -gt $a -a $b -gt $c -a $b -gt $d ]
then echo "$b is the largest."
fi
if [ $c -gt $b -a $c -gt $a -a $c -gt $d ]
then echo "$c is the largest."
fi
if [ $d -gt $b -a $d -gt $c -a $d -gt $a ]
then echo "$d is the largest."
fi
