#! /bin/bash

read -p 'Enter the number upto which you want Prime Numbers: ' N
echo -n "Prime Numbers are: "
for (( i=1; i<=$N; i++ ))
do
    flag=0
    for (( j=2; j<= $(( $i/2 )) ; ++j ))
    do
        if [ $(($i % $j)) -eq 0 ]
        then
        flag=1
        fi
    done
    if [ $flag -eq 0 ]
    then
        echo -n " $i "
    fi
done
echo