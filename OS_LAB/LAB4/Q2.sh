#! /bin/bash

echo "Enter day no. "
read a
a=$(( a % 7 ))

case $a in
"1")
    echo "Monday" ;;
"2") 
    echo "Tuesday" ;;
"3") 
    echo "Wednesday" ;;
"4")
    echo "Thursday" ;;
"5")
    echo "Friday" ;;
"6")
    echo "Saturday" ;;
"0")
    echo "Sunday" ;;
*)  echo "Wrong input"
esac